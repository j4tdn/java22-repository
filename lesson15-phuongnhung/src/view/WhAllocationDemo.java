package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.multi.MultiButtonUI;

import bean.Item;
import bean.Store;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		
		// use data from DataModel
		Map<Integer, Integer> refStore = mockRefStores();
		Map<Item, List<Store>> storesOfA55 = mockStoresOfRefItemA55();
		Map<Item, List<Store>> storesOfA77 = mockStoresOfRefItemA77();
		Map<Integer, BigDecimal> refWeights = mockRefWeights();
		Map<Integer, BigDecimal> trendStore = mockTrendStore();
		
		// do calculation
		// step 1
		if (planningAmount>requiredMinPlanningAmount) {
			// step 2
			List<Store> ListStoresOfA55 = storesOfA55.entrySet().iterator().next().getValue();
			List<Store> ListStoresOfA77 = storesOfA77.entrySet().iterator().next().getValue();
			Map<Integer, BigDecimal> mapStorePotential55 = fillMissingStorePotential(ListStoresOfA55, refStore);
			Map<Integer, BigDecimal> mapStorePotential77 = fillMissingStorePotential(ListStoresOfA77, refStore);
			printf("step 2 Danh sách các cửa hàng item A55 : ", mapStorePotential55);
			printf("step 2 Danh sách các cửa hàng item A77 : ", mapStorePotential77);
			
			//step3
			Map<Integer, BigDecimal> mapStoreDemands = calculateStoreDemand(mapStorePotential55,mapStorePotential77,refWeights,trendStore);
			printf("step 3 Danh sách demand theo mỗi của hàng : ",mapStoreDemands) ;
			//
			
		}
		// print result step by step
	}
	private static Map<Integer, BigDecimal> calculateSumDemand(Map<Integer, BigDecimal> mapStoreDemand, List<Store> ListStoresOfA55 ){
	    Map<Integer, BigDecimal> result = new HashMap<>();
	    Map<Integer, Integer> mapListStoreWithWH = ListStoresOfA55.stream() // level_id
				.filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) > 0)
				.collect(Collectors.toMap( Store::getWhId, Store::getId));
	    Set<Integer> level =  mapListStoreWithWH.values().stream().collect(Collectors.toSet());
	    for(Integer key: mapListStoreWithWH.keySet()) {
	    	for(Integer wh: level) {
	    		if(key == wh ) {
	    			
	    		}
	    	}
	    }
	    
	    return result;
	}

	
	private static Map<Integer, BigDecimal> calculateStoreDemand(
	        Map<Integer, BigDecimal> mapStore55,
	        Map<Integer, BigDecimal> mapStore77,
	        Map<Integer, BigDecimal> refWeights,
	        Map<Integer, BigDecimal> trendStore) {

	    Map<Integer, BigDecimal> result = new HashMap<>();

	    // Tính tổng giá trị từ refWeights
	    BigDecimal sumOfValues = refWeights.values().stream()
	                                       .reduce(BigDecimal.ZERO, BigDecimal::add);
	    System.out.println("sum==>" + sumOfValues);
	    for (Integer key : mapStore55.keySet()) {
	        // Lấy giá trị từ các map, sử dụng giá trị mặc định BigDecimal.ZERO nếu không có
	        BigDecimal value55 = mapStore55.getOrDefault(key, BigDecimal.ZERO);
	        BigDecimal value77 = mapStore77.getOrDefault(key, BigDecimal.ZERO);
	        BigDecimal weight55 = refWeights.getOrDefault(55, BigDecimal.ZERO);
	        BigDecimal weight77 = refWeights.getOrDefault(77, BigDecimal.ZERO);
	        BigDecimal trend = trendStore.getOrDefault(key, BigDecimal.ONE);

	        // Kiểm tra tránh chia cho số không
	        if (sumOfValues.equals(BigDecimal.ZERO)) {
	            throw new ArithmeticException("Tổng giá trị bằng 0, không thể chia cho 0.");
	        }

	        // Tính toán nhu cầu
	        BigDecimal demand = (value55.multiply(weight55)
	                .add(value77.multiply(weight77)))
	                .divide(sumOfValues, RoundingMode.HALF_UP)
	                .multiply(trend);

	        // Đưa kết quả vào map
	        result.put(key, demand.setScale(1, RoundingMode.HALF_UP));
	    }

	    return result;
	}
	
	
	private static Map<Integer, BigDecimal> fillMissingStorePotential(List<Store> ListStore, Map<Integer,Integer> refStore) {
		// Chuyển list cửa hàng chi tiết của hàng map<> chưa Id và Store
		Map<Integer, Store> MapStore = ListStore.stream() 
				.filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) > 0)
				.collect(Collectors.toMap(Store::getId, s -> s));
		Map<Integer, BigDecimal> result = new HashMap<>();
		// Tính giá trị trung bình của tất cả các cửa hàng 
		Double average = ListStore.stream().filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) > 0)
				.mapToDouble(store -> store.getPotential().doubleValue()).average().orElse(0);
//		System.out.println("average -->"+ average +",,,,"+ MapStore.size());
		// cập nhật 
		ListStore.stream().filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) == 0) // lọc các store cần fill
				.forEach(store -> {
					Integer referenceStoreID = refStore.get(store.getId()); // tìm cửa hàng tham chiếu
					System.out.println(referenceStoreID +" của của hàng "+ store.getId());
					if (referenceStoreID ==  null) {
						store.setPotential(new BigDecimal(average));
					} else {
						store.setPotential(MapStore.get(referenceStoreID).getPotential());
					}
				});
		ListStore.stream().forEach(
				store -> {
					result.put(store.getId(), store.getPotential().setScale(1, RoundingMode.HALF_UP));
				}
				);
		return result;
	}
	
	public static <K, V> void printf(String prefix, Map<K, V> data) {
		printf(prefix, data.entrySet());
	}

	private static <T> void printf(String prefix, Collection<T> data) {
		System.out.println("\n" + prefix + " -->{");
		for (var t : data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
}
