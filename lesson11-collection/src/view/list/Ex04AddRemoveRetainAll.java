package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04AddRemoveRetainAll {
	
	public static void main(String[] args) {
		
		// Các cách làm để khởi tạo 1 List, ArrayList
		// Cách 1: new ArrayList 		--> java.util.ArrayList 		--> dynamic ArrayList 	  --> hỗ trợ get/set/add/remove
		// Cách 2: Arrays.asList(...) 	--> java.util.Arrays.ArrayList	--> ArrayList(fixed size) --> hỗ trợ get/set
		// Cách 3: List.of(...)			--> ImmutableList										  --> hỗ trợ get
		
		// List<Integer> list0 = Arrays.asList(1,2,3,4,5);
		List<Integer> list0 = List.of(1,2,3,4,5);
		System.out.println("list0 get --> " + list0.get(0));
		list0.set(1, 99); // UnsupportedOperationException List.of
		list0.add(267); // UnsupportedOperationException List.of, Arrays.asList
				
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		
		// Thao tác giao, hợp, hiệu 2 danh sách với nhau
		List<Integer> list3 = new ArrayList<>(list1);
		list3.retainAll(list2);
		System.out.println("Giao 2 danh sách --> " + list3);
		
		List<Integer> list4 = new ArrayList<>(list1);
		list4.addAll(list2);
		System.out.println("Hợp/gộp 2 danh sách --> " + list4);
		
		List<Integer> list5 = new ArrayList<>(list1);
		list5.removeAll(list2);
		System.out.println("Hiệu 2 danh sách --> " + list5);
	}
}
