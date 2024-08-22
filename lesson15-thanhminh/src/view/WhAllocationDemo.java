package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import static model.DataModel.*;
import static utils.NumberUtils.*;

public class WhAllocationDemo {
	public static void main(String[] args) {
		var item55 = mockStoresOfRefItemA55();
		var item77 = mockStoresOfRefItemA77();
		
		if(!checkForPlanningAmount(planningAmount, requiredMinPlanningAmount)) {
			System.out.println("Stop calculation");
		} else {
			System.out.println("Continue step 2");
			var refItem55 = fillingGaps(item55);
			generate("Filling gaps by references or average", refItem55);
			var refItem77 = fillingGaps(item77);
			generate("Filling gaps by references or average", refItem77);
		}
		System.out.println("Step 3: Calculate Store Demand of current Item");
		
	}
	// step 1
	private static boolean checkForPlanningAmount(Integer planningAmount, Integer minPlanningAmout) {
		if (planningAmount <= minPlanningAmout) {
			return false;
		}
		return true;
	}
	// step 2
	private static Map<Integer, List<Entry<Integer, BigDecimal>>> fillingGaps(Map<Item, List<Store>> stores) {
		var storeRef = mockRefStores();
		var entry = new ArrayList<>(stores.entrySet());
		var list = entry.get(0).getValue();

		if (list.stream().anyMatch(s -> (s.getPotential().compareTo(BigDecimal.ZERO) == 0))) {
			double result = 0;
			int count = 0;
			for (var store : list) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) != 0) {
					result += Double.parseDouble(store.getPotential().toString());
					count++;
				}
			}
			double avg = result / count;
			for (var store : list) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
					var potentials = list.stream().filter(st -> st.getId() == storeRef.get(store.getId())).distinct()
							.collect(Collectors.toList());

					if (storeRef.containsKey(store.getId()) && (potentials.get(0).getPotential().compareTo(BigDecimal.ZERO) != 0)) {
						store.setPotential(potentials.get(0).getPotential());
					} else {
						store.setPotential(bd(avg));
					}
				}
			}
		}
		var potentials = new LinkedHashMap<Integer, BigDecimal>();
		for (var store : list) {
			potentials.put(store.getId(), store.getPotential().setScale(1, RoundingMode.HALF_UP));
		}
		
		var result = new LinkedHashMap<Integer, List<Entry<Integer, BigDecimal>>>();
		result.put(entry.get(0).getKey().getId(), potentials.entrySet().stream().collect(Collectors.toList()));
		return result;
	}
	// step 3

	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " --> {");	
		for (K key: map.keySet()) {
			System.out.println("  " + key + ", " + map.get(key));
		}
		System.out.println("}");
	}
	
}
