package view.map;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

public class Ex03InitialMapInDetail {
	public static void main(String[] args) {
		Map<Integer, String> codes = new HashMap<>() {
			private static final long serialVersionUID = 1L;				
			{
				put(5000, "Da Nang");
				put(4200, "Ha Noi");
			}
		};
		codes.put(6800, "TP Ho Chi Minh");
		
		System.out.println("code size --> " + codes.size());
		
		// Khởi tạo map với Map.of
		
		// Immutable Map
		// Map<Integer, Integer> numberMap = Map.of(1, 11);
		Map<Integer, Integer> numberMap = Map.ofEntries(
			new SimpleEntry<>(1, 11),
			new SimpleEntry<>(2, 22)
		);
		
		//numberMap.put(2, 22); ko hỗ trợ thêm
		//numberMap.remove(1); ko hỗ trợ xóa
		//numberMap.put(1, 22); ko hỗ trợ sửa
		
		System.out.println("Test Map 01 --> " + numberMap);
	}
}
