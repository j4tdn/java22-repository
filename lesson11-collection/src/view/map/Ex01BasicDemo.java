package view.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01BasicDemo {
	
	/*
	 Map<K, V> --> Entry<K, V>
	 
	 HashMap      : không đảm bảo thứ tự đưa vào, không sắp xếp, được phép chứa key = NULL
	 LinkedHashMap: đảm bảo thứ tự đưa vào, ko sắp xếp, được phép chứa key = NULL
	 TreeMap      : tự động sắp xếp theo key(KDL đối tượng), ko hỗ trợ null value
	              : KDL của KEY phải là con của Comparable<K> 
	                hoặc là truyền Comparator<K> lúc gọi hàm khởi tạo
	                Lưu ý: chỉ hỗ trợ sắp xếp theo key
	                
     Sắp xếp theo KEY & | VALUE --> sử dụng lớp thực thi bất kỳ của Map(ko dùng TreeMap)
     
     thông thường --> sort return void hoán vị
     map          --> sort return sorted new map
	 
	 
	 */
	
	public static void main(String[] args) {
		
		// Xây dựng hệ thông quản lý biển số xe của các tỉnh thành ở Việt Nam
		// Đà Nẵng 43, Quảng Nam 92, Bắc Ninh 99
		
		// Arrays.sort(array, comparator)
		
		Map<String, Integer> models = new TreeMap<>(Comparator.reverseOrder());
		
		models.put("Quảng Nam", 92);
		models.put("Đà Nẵng", 43);
		models.put("Thừa Thiên Huế", 75);
		models.put("Quảng Trị", 74);
		models.put("Quảng Bình", 73);
		
		models.put("Hà Nam", null);
		models.put("TP Huế", null);
		// models.put(null, Integer.MAX_VALUE);
		
		// put ghi đè, nếu chưa tồn tại
		models.put("Đà Nẵng", 34);
		models.putIfAbsent("Quảng Bình", 37);
		
		// Cơ chế kiểm tra entry đã tồn tại trong map chưa
		// --> kiểm tra key của entry đã tồn tại trong map chưa
		
		//loopByEntry("1. Loop map by entries", models);
		loopByKey("1. Loop map by Key", models);
		//loopByValue("1. Loop map by Value", models);
		
		// Sắp xếp models theo biển số xe(value)
		Map<String, Integer> sortedModels = sort(models, (e1, e2) -> {
			Integer v1 = e1.getValue();
			Integer v2 = e2.getValue();
			
			// null first
			if (v1 == null) {
				return -1;
			}
			if (v2 == null) {
				return 1;
			}
			
			// ascending
			return v1.compareTo(v2);
		});
		
		//loopByEntry("2. Loop map by sorted entries", sortedModels);
		
		// Hỗ trợ tìm kiếm theo key = Quảng Trị
		//System.out.println("Quảng Trị có mã biển số xe = " + models.get("Quảng Trị"));
	}
	
	private static Map<String, Integer> sort(Map<String, Integer> models, Comparator<Entry<String, Integer>> comparator) {
		// B1. Chuyển đổi từ Map<K, V> -> Set<Entry<K, V>> -> List<Entry<K, V>> để trong List hỗ trợ hàm sort
		List<Entry<String, Integer>> entries = new ArrayList<>(models.entrySet());
		
		// B2: Sắp xếp list theo yêu cầu
		entries.sort(comparator);
		
		// B3: Tạo map(bắt buộc phải là LinkedHashMap), đưa các phần tử trong sorted list vào map
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		// B4. Trả về map mới
		return sortedMap;
	}
	
	//Value
	private static void loopByValue(String prefix, Map<String, Integer> models) {
		System.out.println(prefix + " {");
		Collection<Integer> values = models.values();
		for (Integer value : values) {
			System.out.println("  key  -> " + values);
			System.out.println("  value  -> " + models.get(value));
		}
		System.out.println("}\n");
	}
	
	//Key
	
	private static void loopByKey(String prefix, Map<String, Integer> models) {
		System.out.println(prefix + " {");
		Set<String> keys = models.keySet();
		for (String key : keys) {
			System.out.println("  key  -> " + keys);
			System.out.println("  value  -> " + models.get(key));
		}
		System.out.println("}\n");
	}
	
	// for each --> array, list, set
	// các phần tử lưu vào map, có key khác nhau ==> các entry 100% khác nhau
	
	private static void loopByEntry(String prefix, Map<String, Integer> models) {
		System.out.println(prefix + " {");
		Set<Entry<String, Integer>> entries = models.entrySet();
		for (Entry<String, Integer> entry: entries) {
			System.out.println("    -> " + entry);
		}
		System.out.println("}\n");
	}
	
}