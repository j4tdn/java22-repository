package view;

import static model.DataModel.minPerStore;
import static model.DataModel.mockRefStores;
import static model.DataModel.mockRefWeights;
import static model.DataModel.mockStoreTrendFactors;
import static model.DataModel.mockStoresOfRefItemA55;
import static model.DataModel.mockStoresOfRefItemA77;
import static utils.CollectionUtils.generate;
import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {

		Integer planningAmountCountry = DataModel.planningAmount;
		Integer minPerStore = DataModel.minPerStore;
		Integer requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

		// step 1
		System.out.println("Step 1");
		checkPlanningAmount(planningAmountCountry, requiredMinPlanningAmount);

		List<Store> storeA55 = mockStoresOfRefItemA55();
		List<Store> storeA77 = mockStoresOfRefItemA77();
		
		 List<Store> mergedStores = new ArrayList<>(storeA55);
		 mergedStores.addAll(storeA77);

		Map<Integer, Integer> refStore = mockRefStores();
		Map<Integer, BigDecimal> refWeights = mockRefWeights();
		Map<Integer, BigDecimal> storeTrendFactors = mockStoreTrendFactors();
		Map<Integer, Integer> whOfStore = storeA55.stream().collect(Collectors.toMap(Store::getId, Store::getWhId));

		List<Store> storeA77Filled = fillingGap(storeA55, refStore);
		List<Store> storeA55Filled = fillingGap(storeA77, refStore);

		Map<Integer, BigDecimal> demands = calculateDemands(List.of(storeA55Filled, storeA77Filled), storeTrendFactors,
				refWeights);

		generate("3. demands", demands);

		Map<Integer, BigDecimal> demandWH = sumDemandOfWH(demands, whOfStore);
		generate("4. demandWH", demandWH);

		Map<Integer, BigDecimal> calculateShares = calculateShares(demandWH);
		generate("5. calculateShares", calculateShares);

		Map<Integer, BigDecimal> allocateByShares = allocateByShares(calculateShares, planningAmountCountry);
		generate("6. allocateByShares", allocateByShares);
		
		Map<Integer, BigDecimal> allocateBySharesOfMinimum =applyMinimum (allocateByShares, mergedStores);
		generate("7. applyMinimum", allocateBySharesOfMinimum);
		
		
		Map<Integer, BigDecimal> recalculateShares = reCalculateShares(allocateBySharesOfMinimum);
		generate("8. recalculateShares", recalculateShares);

	}
	
	public static List<Store> convertMapToList(Map<Item, List<Store>> itemStoreMap) {
        List<Store> allStores = new ArrayList<>();
        for (List<Store> stores : itemStoreMap.values()) {
            allStores.addAll(stores);
        } 
        return allStores;
	}

	// step 1
	public static void checkPlanningAmount(Integer planningAmountCountry, Integer requiredMinPlanningAmount) {
		if (planningAmountCountry <= requiredMinPlanningAmount) {
			System.out.println("Stop calculation!");
			System.exit(0);
		} else {
			System.out.println("Continue with step 2");
		}
	}

	// step 2
	private static List<Store> fillingGap(List<Store> stores, Map<Integer, Integer> refStore) {
		List<Store> filledStores = new ArrayList<>();

		List<Store> havePotentialStores = stores.stream().filter(t -> t.getPotential().compareTo(bd(0)) > 0)
				.collect(Collectors.toList());

		Map<Integer, BigDecimal> oldPotentialStoresMap = stores.stream()
				.collect(Collectors.toMap(Store::getId, Store::getPotential));

		BigDecimal averagePotential = calcAveragePotential(havePotentialStores);

		for (Store store : stores) {
			if (store.getPotential().compareTo(bd(0f)) != 0) {
				store.setPotential(store.getPotential().setScale(1, RoundingMode.HALF_UP));
				filledStores.add(store);
			} else {
				BigDecimal refStorePotential = oldPotentialStoresMap.get(refStore.get(store.getId()));
				if (store.getPotential().compareTo(bd(0d)) == 0 && refStore.containsKey(store.getId())
						&& (refStorePotential.compareTo(bd(0f)) > 0)) {

					store.setPotential(refStorePotential.setScale(1, RoundingMode.HALF_UP));
					filledStores.add(store);
				} else {
					store.setPotential(averagePotential.setScale(1, RoundingMode.HALF_UP));
					filledStores.add(store);
				}
			}
		}

		generate("2. filledStores", filledStores);
		return filledStores;
	}

	// step 3
	private static Map<Integer, BigDecimal> calculateDemands(List<List<Store>> allStores,
			Map<Integer, BigDecimal> storeTrendFactors, Map<Integer, BigDecimal> refWeights) {
		Map<Integer, BigDecimal> demands = new HashMap<>();

		Map<Integer, BigDecimal> fixRefWeights = refWeights.entrySet().stream().map(t -> {
			if (t.getValue().compareTo(bd(0)) == 0) {
				t.setValue(bd(1));
			}
			return t;
		}).collect(Collectors.toMap(Entry::getKey, Entry::getValue));

		Map<Integer, BigDecimal> fixStoreTrendFactors = storeTrendFactors.entrySet().stream().map(t -> {
			if (t.getValue().compareTo(bd(0)) == 0) {
				t.setValue(bd(1));
			}
			return t;
		}).collect(Collectors.toMap(Entry::getKey, Entry::getValue));

		BigDecimal sumRefWeight = fixRefWeights.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		for (int i = 0; i < allStores.get(0).size(); i++) {
			Integer storeId = allStores.get(0).get(i).getId();

			BigDecimal demand = BigDecimal.ZERO;

			for (List<Store> stores : allStores) {
				Store store = stores.get(i);
				BigDecimal storePotential = store.getPotential();

				if (storePotential != null && fixRefWeights.containsKey(store.getItem().getId())) {
					BigDecimal refWeight = fixRefWeights.get(store.getItem().getId());
					demand = demand.add(storePotential.multiply(refWeight));
				}
			}

			if (sumRefWeight.compareTo(bd(0f)) != 0 && fixStoreTrendFactors.containsKey(storeId)) {
				demand = demand.divide(sumRefWeight, 1, RoundingMode.HALF_UP)
						.multiply(fixStoreTrendFactors.get(storeId));
			}

			demands.put(storeId, demand.setScale(1, RoundingMode.HALF_UP));
		}

		return demands;
	}

	// step 4
	private static Map<Integer, BigDecimal> sumDemandOfWH(Map<Integer, BigDecimal> demands,
			Map<Integer, Integer> whOfStore) {

		Map<Integer, BigDecimal> sumByWH = new LinkedHashMap<>();

		for (Map.Entry<Integer, BigDecimal> entry : demands.entrySet()) {
			Integer storeId = entry.getKey();
			BigDecimal demand = entry.getValue();

			Integer whId = whOfStore.get(storeId);

			if (sumByWH.containsKey(whId)) {
				BigDecimal currentSum = sumByWH.get(whId);
				sumByWH.put(whId, currentSum.add(demand));
			} else {
				sumByWH.put(whId, demand);
			}
		}
		return sumByWH;
	}

	// step 5
	private static Map<Integer, BigDecimal> calculateShares(Map<Integer, BigDecimal> sumDemandOfWH) {
		Map<Integer, BigDecimal> sharesMap = new HashMap<>();
		BigDecimal sum = sumDemandOfWH.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		sumDemandOfWH.forEach((key, value) -> {
			BigDecimal newValue = value.divide(sum, 9, RoundingMode.HALF_UP).multiply(bd(100d));
			sharesMap.put(key, newValue.setScale(9, RoundingMode.HALF_UP));
		});

		return sharesMap;
	}

	// step 6
	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer, BigDecimal> shareOfWH,
			Integer planningAmountCountry) {
		Map<Integer, BigDecimal> allocateByShares = new HashMap<Integer, BigDecimal>();

		shareOfWH.forEach((key, value) -> {
			BigDecimal valueAllocate = value.divide(bd(100d)).multiply(BigDecimal.valueOf(planningAmountCountry));
			allocateByShares.put(key, valueAllocate);
		});

		return allocateByShares;
	}

	// step 7
	private static Map<Integer, BigDecimal> applyMinimum(Map<Integer, BigDecimal> allowcatedShares, 
			List<Store> stores){
		Integer totalWarehouseId = 0;
		 for (Store store : stores) {
	            totalWarehouseId = store.getWhId() + 1;
	        }
		Map<Integer, BigDecimal> applyMinimum = new HashMap<>();
		for(var entry : allowcatedShares.entrySet()) {
			Integer	key = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal newValue;
			var AmountOf = minPerStore * totalWarehouseId;
			if(value.compareTo(bd(AmountOf)) > 0) {
				newValue = value;
			}else {
				newValue = bd(AmountOf);
			}
			applyMinimum.put(key, newValue);
		}
		return applyMinimum;
	}

	// step 8
	private static Map<Integer, BigDecimal> reCalculateShares(Map<Integer, BigDecimal> allocateBySharesOfMinimum) {
		Map<Integer, BigDecimal> recalculateShares = new HashMap<>();

		BigDecimal sumSharesWithoutMinimum = allocateBySharesOfMinimum.entrySet().stream()
				.filter(t -> t.getValue().compareTo(bd(2)) > 0).map(Entry::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		recalculateShares = allocateBySharesOfMinimum.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> {
					if (entry.getValue().compareTo(BigDecimal.valueOf(2)) > 0) {
						return entry.getValue().divide(sumSharesWithoutMinimum, 9, RoundingMode.HALF_UP);
					} else {
						return BigDecimal.ZERO;
					}
				}));

		return recalculateShares;
	}

	private static BigDecimal calcAveragePotential(List<Store> stores) {
		BigDecimal sum = stores.stream().map(Store::getPotential).reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum.divide(BigDecimal.valueOf(stores.size()), 1, RoundingMode.HALF_UP);
	}
}