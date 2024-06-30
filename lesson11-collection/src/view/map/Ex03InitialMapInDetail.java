package view.map;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

public class Ex03InitialMapInDetail {
	
	public static void main(String[] args) {
		
		// List<T> list = new ArrayList<>()
		// add, add
		// Arrays.asList
		// List.of
		
		// Map<K, V> map = new HashMap<>() ==> TreeMap, LinkedHashMap
		// --> Tạo ra 1 dynamic map, sử dụng put, put để thêm phần tử vào
		
		// Khởi tạo map kèm các entry bàn đầu
		Map<Integer, String> codes = new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put(5000, "Da Nang");
				put(4200, "Ha Noi");
			}
		};
		codes.put(6800, "TP. Ho Chi Minh");
		
		System.out.println("code size --> " + codes.size());
		
		// Khởi tạo map với Map.of, Map.ofEntries ==> immutable map
		
		// Map<Integer, Integer> numbersMap = Map.of(1, 11);
		Map<Integer, Integer> numbersMap = Map.ofEntries(
				new SimpleEntry<>(1, 11),
				new SimpleEntry<>(2, 22)
		);
		
		// numbersMap.put(2, 22); // ko hỗ trợ thêm
		// numbersMap.remove(1); // ko hỗ trợ
		// numbersMap.put(1, 22); // ko hỗ trợ sửa
		
		System.out.println("Test Map 01 --> " + numbersMap);
		
		
	}
	
}
