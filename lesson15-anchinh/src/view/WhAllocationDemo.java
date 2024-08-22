package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import bean.Item;
import bean.Store;
import utils.NumberUtils;

import static model.DataModel.*;

public class WhAllocationDemo {
    
    public static void main(String[] args) {
    	if(checkPlanningAmount()) {
			return;
		}else {
			System.out.println("Continue with Step 2");
		}
        
        System.out.println("=========Step 2==========");
        processPotentialGaps(mockStoresOfRefItemA55());
        processPotentialGaps(mockStoresOfRefItemA77());
        
        System.out.println("\n=========Step 3==========:");
        Item tempItem = mockStoresOfRefItemA55().keySet().iterator().next();
        List<Store> storeList = mockStoresOfRefItemA55().get(tempItem);

        List<Map<Item, List<Store>>> listOfMaps = new ArrayList<>();
        listOfMaps.add(mockStoresOfRefItemA55());
        listOfMaps.add(mockStoresOfRefItemA77());

        calculateStoreDemand(listOfMaps, storeList);
        
      
    }

    // Step 1
    private static boolean checkPlanningAmount() {
        return planningAmount <= requiredMinPlanningAmount;
    }

    // Step 2
    private static void processPotentialGaps(Map<Item, List<Store>> mockStore) {
        Map<Integer, Integer> refStores = mockRefStores();
        Item tempItem = mockStore.keySet().iterator().next();
        List<Store> stores = mockStore.get(tempItem);
        
        fillPotentialGaps(stores, refStores);

        printStorePotential(stores, tempItem);
    }

    private static void fillPotentialGaps(List<Store> stores, Map<Integer, Integer> refStores) {
        Map<Integer, Store> refStoreMap = createRefStoreMap(stores, refStores);

        for (Store store : stores) {
            if (store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
                handlePotentialGap(store, refStores, refStoreMap, stores);
            }
        }
    }

    private static Map<Integer, Store> createRefStoreMap(List<Store> stores, Map<Integer, Integer> refStores) {
        Map<Integer, Store> refStoreMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : refStores.entrySet()) {
            Optional<Store> storeOpt = stores.stream()
                                             .filter(store -> store.getId().equals(entry.getValue()))
                                             .findFirst();
            storeOpt.ifPresent(store -> refStoreMap.put(entry.getKey(), store));
        }
        return refStoreMap;
    }

    private static void handlePotentialGap(Store store, Map<Integer, Integer> refStores, Map<Integer, Store> refStoreMap, List<Store> allStores) {
        Integer storeId = store.getId();
        if (refStoreMap.containsKey(storeId) && refStoreMap.get(storeId).getPotential().compareTo(BigDecimal.ZERO) != 0) {
            store.setPotential(refStoreMap.get(storeId).getPotential());
        } else {
            BigDecimal average = calculateAveragePotential(allStores, refStores);
            store.setPotential(average);
        }
    }

    private static BigDecimal calculateAveragePotential(List<Store> stores, Map<Integer, Integer> refStores) {
        List<Store> nonRefStores = stores.stream()
                                         .filter(store -> !refStores.containsValue(store.getId()))
                                         .toList();
        
        BigDecimal total = nonRefStores.stream()
                                        .map(Store::getPotential)
                                        .filter(potential -> potential != null && potential.compareTo(BigDecimal.ZERO) > 0)
                                        .reduce(BigDecimal.ZERO, BigDecimal::add);
        
        BigDecimal count = BigDecimal.valueOf(nonRefStores.size());
        return total.divide(count, 1, RoundingMode.HALF_EVEN);
    }

    private static void printStorePotential(List<Store> stores, Item item) {
        System.out.println("\n--> Item: " + item);
        for (Store store : stores) {
            System.out.println("Store: " + store.getId() + " -- Potential Ref: " + store.getPotential());
        }
    }
 // 3:
 	private static void calculateStoreDemand(List<Map<Item, List<Store>>> listOfMaps, List<Store> storelist) {
 		Map<Integer, BigDecimal> trends = mockStoreTrends();
 		Map<Integer, BigDecimal> weights = mockRefWeights();
 		Map<Integer, BigDecimal> demandList = new HashMap<>();
// 		Map<Integer, List<Item>> StoreItemList = new HashMap<>();

 		// Calculate the total weight as the major divisor.
 		BigDecimal totalWeightDivisor = BigDecimal.valueOf(0);
 		for (Map<Item, List<Store>> map : listOfMaps) {
 			Item tempItem = map.keySet().iterator().next();
 			totalWeightDivisor = totalWeightDivisor.add(weights.get(tempItem.getId()));
 		}
 		int i = 1;
 		while (i <= storelist.size()) {
 			BigDecimal demand = BigDecimal.valueOf(0);
 			BigDecimal totalDivide = BigDecimal.valueOf(0);
 			
 			for (Map<Item, List<Store>> map : listOfMaps) {
 				Item tempItem = map.keySet().iterator().next();
 				for (Store store : map.get(tempItem)) {
 					if (store.getId() == i)
 						totalDivide = totalDivide.add(store.getPotential().multiply(weights.get(tempItem.getId())));
 				}
 			}
 			if (trends.containsKey(i)) {
 				demand = (demand.add(totalDivide));
 				demand = demand.divide(totalWeightDivisor).multiply(trends.get(i));
 			} else {
 				demand = demand.add(totalDivide);
 				demand = demand.divide(totalWeightDivisor);
 			}
 			demandList.put(i++, demand);
 		}

 		for (Map.Entry<Integer, BigDecimal> entry : demandList.entrySet()) {
 			System.out.println("Store " + entry.getKey() + " -- Demand new campaign: "
 						+ entry.getValue().setScale(1, RoundingMode.HALF_EVEN));
 		}
 	}
   // 4
 	private static Map<Integer, BigDecimal> calculateTotalPotentialByWhId(List<Store> demandStore) {
		Map<Integer, BigDecimal> totalPotentialByWhId = new HashMap<>();

		for (Store store : demandStore) {
			Integer whId = store.getWhId();
			BigDecimal storePotential = store.getPotential();
			BigDecimal currentTotal = totalPotentialByWhId.getOrDefault(whId, BigDecimal.ZERO);
			BigDecimal newTotal = currentTotal.add(storePotential);

			totalPotentialByWhId.put(whId, newTotal);
		}
		return totalPotentialByWhId;
	}

	private static Map<Integer, BigDecimal> calculatePercentagesByWhId(Map<Integer, BigDecimal> totalPotentialByWhId) {
		Map<Integer, BigDecimal> percentagesByWhId = new HashMap<>();
		BigDecimal totalSum = BigDecimal.ZERO;

		for (BigDecimal value : totalPotentialByWhId.values()) {
			totalSum = totalSum.add(value);
		}

		for (Map.Entry<Integer, BigDecimal> entry : totalPotentialByWhId.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.divide(totalSum, 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100.0));
			percentagesByWhId.put(whId, percentage);
		}
		return percentagesByWhId;
	}

	private static void printf(String prefix, Map<Integer, BigDecimal> map) {
		System.out.println(prefix );
		for(Map.Entry<Integer, BigDecimal> entry : map.entrySet()) {
			 Integer key = entry.getKey();
			 BigDecimal value = entry.getValue();
			 System.out.println(" " + key + " : " + value);
		}

	}

 }
