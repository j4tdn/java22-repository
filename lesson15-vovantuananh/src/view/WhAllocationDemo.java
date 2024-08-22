package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import static model.DataModel.*;
import static utils.NumberUtils.*;

public class WhAllocationDemo {

	public static void main(String[] args) {

		// khởi tạo data
		Map<Item, List<Store>> storesOfA55 = mockStoresOfRefItemA55();

		Map<Item, List<Store>> storesOfA77 = mockStoresOfRefItemA77();

		Map<Integer, Integer> refStores = mockRefStores();

		Map<Integer, BigDecimal> refWeights = mockRefWeights();

		// step 1
		if (planningAmount <= requiredMinPlanningAmount) {
			return;
		} else {
			// step 2
			// A55
			Map<Item, List<Store>> result1 = performStep2(storesOfA55, refStores);

			System.out.println("\nKết quả của A55 sau khi thực hiện step 2:");
			result1.forEach((item, stores) -> {
				System.out.println(item);
				stores.forEach(System.out::println);
			});
			// A77
			Map<Item, List<Store>> result2 = performStep2(storesOfA77, refStores);

			System.out.println("\nKết quả của A77 sau khi thực hiện step 2:");
			result2.forEach((item, stores) -> {
				System.out.println(item);
				stores.forEach(System.out::println);
			});
			
			System.out.println("===============");

			// step 3
			// vì không có trend factor nên em sẽ cho nó bằng 1
			Map<Integer, BigDecimal> storePotentials = performStep3(storesOfA55, storesOfA77, refWeights);
			System.out.println("\nKết quả sau khi thực hiện step 3:");
			storePotentials.forEach((storeId, potential) -> System.out.println("Store ID: " + storeId + ", Potential: " + potential));
			
			// step 4
			Map<Integer, BigDecimal> whPotentials = performStep4(storesOfA55, storePotentials);
	        System.out.println("\nKết quả sau khi thực hiện step 4:");
	        whPotentials.forEach((whId, totalPotential) -> System.out.println("WH ID: " + whId + ", Tổng Potential: " + totalPotential));
	        
	        // step 5
		}

	}
	
	//step 2
	private static Map<Item, List<Store>> performStep2(Map<Item, List<Store>> storesOfA,
			Map<Integer, Integer> refStores) {
		Map<Integer, Store> storeMap = storesOfA.values().stream().flatMap(List::stream)
				.collect(Collectors.toMap(Store::getId, store -> store));

		BigDecimal averagePotential = calculateAveragePotential(storesOfA);

		Map<Item, List<Store>> updatedStores = new HashMap<>();

		for (Map.Entry<Item, List<Store>> entry : storesOfA.entrySet()) {
			Item item = entry.getKey();
			List<Store> stores = entry.getValue();

			for (Store store : stores) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
					Integer refStoreId = refStores.get(store.getId());
					if (refStoreId != null) {
						Store refStore = storeMap.get(refStoreId);

						if (refStore != null) {
							store.setPotential(refStore.getPotential());
						} else {
							store.setPotential(averagePotential);
						}
					} else {
						store.setPotential(averagePotential);
					}
				}
			}

			updatedStores.put(item, stores);
		}

		return updatedStores;
	}

	private static BigDecimal calculateAveragePotential(Map<Item, List<Store>> storesOfA77) {
		BigDecimal sum = BigDecimal.ZERO;
		long count = 0;

		for (List<Store> stores : storesOfA77.values()) {
			for (Store store : stores) {
				BigDecimal potential = store.getPotential();
				if (potential.compareTo(BigDecimal.ZERO) > 0) {
					sum = sum.add(potential);
					count++;
				}
			}
		}

		if (count == 0) {
			return BigDecimal.ZERO;
		}

		return sum.divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP);
	}

	//step 3
	private static Map<Integer, BigDecimal> performStep3(Map<Item, List<Store>> storesOfA55, Map<Item, List<Store>> storesOfA77, Map<Integer, BigDecimal> refWeights) {
        BigDecimal weightA55 = refWeights.getOrDefault(55, BigDecimal.ZERO);
        BigDecimal weightA77 = refWeights.getOrDefault(77, BigDecimal.ZERO);

        BigDecimal totalWeight = weightA55.add(weightA77);

        Map<Integer, BigDecimal> storePotentials = new HashMap<>();

        Set<Integer> allStoreIds = new HashSet<>();
        allStoreIds.addAll(getStoreIdsFromMap(storesOfA55));
        allStoreIds.addAll(getStoreIdsFromMap(storesOfA77));

        for (Integer storeId : allStoreIds) {
            BigDecimal totalPotentialA55 = getStoresFromMap(storesOfA55).stream()
                .filter(store -> store.getId().equals(storeId))
                .map(store -> store.getPotential().multiply(weightA55))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal totalPotentialA77 = getStoresFromMap(storesOfA77).stream()
                .filter(store -> store.getId().equals(storeId))
                .map(store -> store.getPotential().multiply(weightA77))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal totalPotential = totalPotentialA55.add(totalPotentialA77);
            
            //nếu có trend factor thì lấy ra rồi nhân vào đây
            BigDecimal finalPotential = totalPotential.divide(totalWeight, 2, RoundingMode.HALF_UP);
            storePotentials.put(storeId, finalPotential);
        }

        return storePotentials;
    }

	
	//step 4
    private static Map<Integer, BigDecimal> performStep4(Map<Item, List<Store>> storesOfA55, Map<Integer, BigDecimal> storePotentials) {
        Map<Integer, BigDecimal> whPotentials = new HashMap<>();

        List<Store> allStores = getStoresFromMap(storesOfA55);

        for (Store store : allStores) {
            Integer storeId = store.getId();
            Integer whId = store.getWhId();
            BigDecimal potential = storePotentials.getOrDefault(storeId, BigDecimal.ZERO);

            whPotentials.merge(whId, potential, BigDecimal::add);
        }

        return whPotentials;
    }

    private static List<Store> getStoresFromMap(Map<Item, List<Store>> storesMap) {
        return storesMap.values().stream()
            .flatMap(List::stream)
            .toList();
    }

    private static Set<Integer> getStoreIdsFromMap(Map<Item, List<Store>> storesMap) {
        return storesMap.values().stream()
            .flatMap(List::stream)
            .map(Store::getId)
            .collect(Collectors.toSet());
    }
}
