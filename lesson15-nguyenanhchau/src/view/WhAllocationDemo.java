package view;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class WhAllocationDemo {

	public static void main(String[] args) {

		Map<Item, List<Store>> storeA55Data = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> storeA77Data = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> referenceStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> trendStore = DataModel.mockTrendStore();
		Map<Integer, BigDecimal> weightReferenceStore = DataModel.mockRefWeights();

		// CHECK STEP 1
		int planningAmount = DataModel.planningAmount;
		int requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

		System.out.println("======STEP 1======");
		if (planningAmount <= requiredMinPlanningAmount) {
			System.out.println("Stopping calculation.");
			return;
		} else {
			System.out.println("Continuing to Step 2");
			fillGapsInPotential(storeA55Data, referenceStores);
			fillGapsInPotential(storeA77Data, referenceStores);

			System.out.println("======STEP 2======");
			NumberUtils.printMap("Item A55", storeA55Data);
			NumberUtils.printMap("Item A77", storeA77Data);

			System.out.println("======STEP 3======");

			Map<Integer, BigDecimal> demand = calculateDemand(storeA55Data, storeA77Data, weightReferenceStore,
					trendStore);

			NumberUtils.printMapp("Step 3", demand);

			
			
			System.out.println("======STEP 4======");
			
			 Map<Integer, BigDecimal> whDemand = calculateWH(demand, storeA55Data );

		        NumberUtils.printMapp("Step 4", whDemand);

		}
	}

	private static void fillGapsInPotential(Map<Item, List<Store>> storeData, Map<Integer, Integer> referenceStores) {
		storeData.forEach((item, stores) -> {
			BigDecimal averagePotential = calculateAverage(stores.stream()
					.filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) > 0).collect(Collectors.toList()));
			stores.forEach(store -> {
				if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
					fillPotential(store, referenceStores, stores, averagePotential);
				}
			});
		});
	}

	private static void fillPotential(Store store, Map<Integer, Integer> referenceStores, List<Store> stores,
			BigDecimal averagePotential) {
		Integer referenceStoreId = referenceStores.get(store.getId());

		if (referenceStoreId != null) {
			Store referenceStore = null;
			for (Store s : stores) {
				if (s.getId().equals(referenceStoreId)) {
					referenceStore = s;
					break;
				}
			}
			if (referenceStore != null && referenceStore.getPotential() != null
					&& referenceStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
				store.setPotential(referenceStore.getPotential());
			} else {
				store.setPotential(averagePotential);
			}
		} else {
			store.setPotential(averagePotential);
		}
	}
	private static Map<Integer, BigDecimal> calculateWH(Map<Integer, BigDecimal> demand,Map<Item, List<Store>> storeA55Data){
		
		Map<Integer, BigDecimal> WH = new HashMap<>();
		
		
		return WH;
		
		
		
	}
	private static Map<Integer, BigDecimal> calculateDemand(Map<Item, List<Store>> storeA55Data,
			Map<Item, List<Store>> storeA77Data, Map<Integer, BigDecimal> weightReStore,
			Map<Integer, BigDecimal> trendStore) {

		Map<Integer, BigDecimal> demandMap = new HashMap<>();
		BigDecimal totalWeight = weightReStore.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		Map<Integer, BigDecimal> storePotentialA55 = new HashMap<>();
		Map<Integer, BigDecimal> storePotentialA77 = new HashMap<>();

		for (List<Store> stores : storeA55Data.values()) {
			for (Store store : stores) {
				storePotentialA55.merge(store.getId(), store.getPotential(), BigDecimal::add);
			}
		}

		for (List<Store> stores : storeA77Data.values()) {
			for (Store store : stores) {
				storePotentialA77.merge(store.getId(), store.getPotential(), BigDecimal::add);
			}
		}

		for (Integer storeId : storePotentialA55.keySet()) {
			BigDecimal potentialA55 = storePotentialA55.getOrDefault(storeId, BigDecimal.ZERO);
			BigDecimal potentialA77 = storePotentialA77.getOrDefault(storeId, BigDecimal.ZERO);

			BigDecimal weightA55 = weightReStore.getOrDefault(55, BigDecimal.ZERO);
			BigDecimal weightA77 = weightReStore.getOrDefault(77, BigDecimal.ZERO);

			BigDecimal trend = trendStore.getOrDefault(storeId, BigDecimal.ONE);
			BigDecimal demand = ((potentialA55.multiply(weightA55).add(potentialA77.multiply(weightA77)))
					.divide(totalWeight, BigDecimal.ROUND_HALF_UP)).multiply(trend);

			demandMap.put(storeId, demand);
		}

		return demandMap;
	}

	private static BigDecimal calculateAverage(List<Store> stores) {
		BigDecimal totalPotential = BigDecimal.ZERO;
		int count = 0;

		for (Store store : stores) {
			if (store.getPotential().compareTo(BigDecimal.ZERO) > 0) {
				totalPotential = totalPotential.add(store.getPotential());
				count++;
			}
		}

		if (count > 0) {
			return totalPotential.divide(BigDecimal.valueOf(count), 2, BigDecimal.ROUND_HALF_UP);
		} else {
			return BigDecimal.ZERO;
		}
	}

}