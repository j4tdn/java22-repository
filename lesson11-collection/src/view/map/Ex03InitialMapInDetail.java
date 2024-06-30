package view.map;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

public class Ex03InitialMapInDetail {
	
	public static void main(String[] args) {
		
	//với các Map<K,V> map = new ...
	// tạo ra dynamic map
		
	// khởi tạo các map kèm các entry ban đầu
	Map<Integer, String> codes = new HashMap<>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(5000, "Nha Trang");
			put(40, "Da Nang");
		}
	};
	codes.put(6800, "TP. Ho Chi Minh");
	
	System.out.println("code size --> " +codes.size());
	
	
	//khởi tạo map với Map.of, Map.ofEntry đều trả về Immutable Map
	
	//Immutable Map
	//Map<Integer, Integer> numbersMap = Map.of(1,11);
	Map<Integer, Integer> numbersMap = Map.ofEntries(
			new SimpleEntry<>(1,11),
			new SimpleEntry<>(2,22)
			);
	
	//numbersMap.put(2, 22) Khong ho tro them
	// numbersMap.remove(1)  Khong ho tro xoa
	
	System.out.println("Test Map 01 ");
	}
}
