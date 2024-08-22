package view;

import bean.*;
import model.*;
import utils.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhAllocationDemo {

	public static void main(String[] args) {

		// use data from DataModel

		// do calculation

		// print result step by step
		Integer PlanningAmount = 88;
		Integer RequiredMinPlanningAmount = 50;
		Map<Item, List<Store>> mockStoresOfRefItemA77 = DataModel.mockStoresOfRefItemA77();
		Map<Item, List<Store>> mockStoresOfRefItemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Integer, Integer> mockRefStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> mockRefWeights = DataModel.mockRefWeights();
		Map<Item, Map<Integer, BigDecimal>> testA77 = new HashMap<>();
		Map<Item, Map<Integer, BigDecimal>> testA55 = new HashMap<>();
		Map<Item, Map<Integer, BigDecimal>> resultA55 = new HashMap<>();
		Map<Item, Map<Integer, BigDecimal>> resultA77 = new HashMap<>();
		if (CheckForPlanningAmount(PlanningAmount, RequiredMinPlanningAmount)) {
			testA77 = FillingGapsByReferencesOrAverage(mockStoresOfRefItemA77, mockRefStores);
			testA55 = FillingGapsByReferencesOrAverage(mockStoresOfRefItemA55,mockRefStores);
			for (Map.Entry<Item, Map<Integer, BigDecimal>> entry : testA77.entrySet()) {
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
				// in ra kết quả step 2 với A77
			}
			for (Map.Entry<Item, Map<Integer, BigDecimal>> entry : testA55.entrySet()) {
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
				// in ra kết quả step 2 với A55
			}
			System.out.println(" in ra kết quả của step 3 gồm item map con chứa id store và Demand new campaign");
			resultA55 = resultStep3(testA55, mockRefWeights);
			resultA77 = resultStep3(testA77, mockRefWeights);
			for (Map.Entry<Item, Map<Integer, BigDecimal>> entry : resultA55.entrySet()) {
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
			for (Map.Entry<Item, Map<Integer, BigDecimal>> entry : resultA77.entrySet()) {
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
		} else {
		}

	}

	// step 1
	public static boolean CheckForPlanningAmount(Integer PlanningAmount, Integer RequiredMinPlanningAmount) {
		if (PlanningAmount > RequiredMinPlanningAmount) {
			return true;
		} else {
			return false;
		}

	}

	// step 2
	// lấy ra list trong map
	public static List<Store> returnList(Map<Item, List<Store>> mockStores) {
		List<Store> result = new ArrayList<>();
		for (Map.Entry<Item, List<Store>> entry : mockStores.entrySet()) {
			result.addAll(entry.getValue());
		}
		return result;
	}

	// AverageValuePotentialStorage : giá trị trung bình lưu trữ
	// map lưu item và map con là id Store và giá trị Potential
	public static Map<Item, Map<Integer, BigDecimal>> FillingGapsByReferencesOrAverage(
			Map<Item, List<Store>> mockStoresOfRefItem, Map<Integer, Integer> mockRefStores) {
		Map<Integer, BigDecimal> storage = new HashMap<>();
		Map<Item, Map<Integer, BigDecimal>> test = new HashMap<>();
		List<Store> listStore = returnList(mockStoresOfRefItem);
		for (Store store : listStore) {
			if (store.getPotential() != BigDecimal.ZERO) {
				storage.put(store.getId(), store.getPotential());
			} else if (store.getPotential() == BigDecimal.ZERO) {
				storage.put(store.getId(), getReferenceValue(listStore, mockRefStores));
			}
		}
		Item item = new Item();
		for (Item keyItem : mockStoresOfRefItem.keySet()) {
			item = keyItem;
			break;
		}
		test.put(item, storage);
		return test;
	}

	// check tham chiếu
	public static BigDecimal getReferenceValue(List<Store> listStore, Map<Integer, Integer> mockRefStores) {
		BigDecimal getreferencevalue = new BigDecimal("0");
		BigDecimal meanValue = new BigDecimal("0");
		BigDecimal sum = new BigDecimal("0");
		BigDecimal count = new BigDecimal("0");
		BigDecimal cong = new BigDecimal("1");
		for (Store store : listStore) {
			if (store.getPotential() != BigDecimal.ZERO) {
				sum = sum.add(store.getPotential());
				count.add(cong);
			}
		}
		for (Store store : listStore) {
			if (store.getId() == browseValue(mockRefStores)) {
				if (store.getPotential() != BigDecimal.ZERO) {
					getreferencevalue = store.getPotential();
				} else if (store.getPotential() == BigDecimal.ZERO) {
					meanValue = sum.divide(count, 4, RoundingMode.HALF_UP);
					getreferencevalue = meanValue;
				}
			}
		}
		return getreferencevalue;
	}

	public static Integer browseValue(Map<Integer, Integer> mockRefStores) {
		Integer a = 0;
		for (Map.Entry<Integer, Integer> entry : mockRefStores.entrySet()) {
			a = entry.getKey();
		}
		return a;
	}
	// step 3
	// map l;ưu item và map con lưu  store và Demand new campaign

	public static Map<Item, Map<Integer, BigDecimal>> resultStep3(
			Map<Item, Map<Integer, BigDecimal>> FillingGapsByReferencesOrAverage,
			Map<Integer, BigDecimal> mockRefWeights) {
		Map<Item, Map<Integer, BigDecimal>> result = new HashMap<>();
		for (Map.Entry<Item, Map<Integer, BigDecimal>> entry : FillingGapsByReferencesOrAverage.entrySet()) {
			Item item = entry.getKey();
			Map<Integer, BigDecimal> itemGaps = entry.getValue();
			Map<Integer, BigDecimal> demandPerStore = new HashMap<>();
			BigDecimal totalWeight = BigDecimal.ZERO;
			BigDecimal weightedSum = BigDecimal.ZERO;
			for (Map.Entry<Integer, BigDecimal> refWeightEntry : mockRefWeights.entrySet()) {
				Integer storeId = refWeightEntry.getKey();
				BigDecimal weight = refWeightEntry.getValue();
				if (itemGaps.containsKey(storeId)) {
					BigDecimal potential = itemGaps.get(storeId);
					weightedSum = weightedSum.add(potential.multiply(weight));
					totalWeight = totalWeight.add(weight);
				}
			}

			for (Map.Entry<Integer, BigDecimal> refWeightEntry : mockRefWeights.entrySet()) {
				Integer storeId = refWeightEntry.getKey();
				BigDecimal weight = refWeightEntry.getValue();
				if (itemGaps.containsKey(storeId)) {
					BigDecimal potential = itemGaps.get(storeId);
					BigDecimal demand;
					if (totalWeight.compareTo(BigDecimal.ZERO) > 0) {
						demand = weightedSum.divide(totalWeight, BigDecimal.ROUND_HALF_UP);
					} else {
						demand = BigDecimal.ZERO;
					}
					demandPerStore.put(storeId, demand);
				}
			}
			result.put(item, demandPerStore);
		}
		return result;
	}
	// step 4 lưu 1 map chứa key = item map con chứa key = kho value bằng Demand WH:

	public static Map<Item, Map<Integer, BigDecimal>> resultStep4(Map<Item, Map<Integer, BigDecimal>> resultStep3,
			Map<Item, List<Store>> mockStoresOfRefItem) {

		Map<Item, Map<Integer, BigDecimal>> result = new HashMap<>();
		List<Store> list = returnList(mockStoresOfRefItem);

		for (Map.Entry<Item, Map<Integer, BigDecimal>> entry : resultStep3.entrySet()) {
			Item item = entry.getKey();
			Map<Integer, BigDecimal> itemGaps = entry.getValue();
			Map<Integer, BigDecimal> demandwh = new HashMap<>();

			for (Map.Entry<Integer, BigDecimal> itemgaps : itemGaps.entrySet()) {
				Integer storeId = itemgaps.getKey();
				BigDecimal gapValue = itemgaps.getValue();
				Integer whId = getStore(list, storeId).getWhId();
				demandwh.merge(whId, gapValue, BigDecimal::add);
			}
			result.put(item, demandwh);
		}
		return result;
	}

	// lấy ra store từ nid
	public static Store getStore(List<Store> list, Integer id) {
		Store s = new Store();
		for (Store store : list) {
			if (store.getId() == id) {
				s = store;
			}
		}
		return s;
	}

}