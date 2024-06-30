package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04AddRemoveRetainAll {
	
	public static void main(String[] args) {
		
		// câc cách khởi tạo 1 list , Arraylist
		// cách 1: new Arraylist --> java.util.Arraylist        --> dynamic ArrayList      --> hỗ trợ get/set/add/remove
		// cách 2: Arrays.asList --> java.util.Arrays.Arraylist --> ArrayLisst(fixed size) --> hỗ trợ get/set
		// cách 3: List.of(...)	 --> ImmutableList										   --> Hỗ trợ get
		
		// cách khởi tạo 3
		List<Integer> list03 = List.of(1,2,3,4,5);
		System.out.println("List0 get --> "+ list03.get(0));
		list03.set(0, 99); //UnsupportedOperationException
		System.out.println("List0 get --> "+ list03.get(0));
		list03.add(267); //UnsupportedOperationException
		
		// cách khởi tạo 2
		List<Integer> list02 = Arrays.asList(1,2,3,4,5);
		System.out.println("List0 get --> "+ list02.get(0));
		list02.set(0, 99);
		System.out.println("List0 get --> "+ list02.get(0));
		list02.add(267); //UnsupportedOperationException
		
		//cách khởi tạo 1
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
		System.out.println("Giao 2 danh sách: "+ list3);
		
		List<Integer> list4 = new ArrayList<>(list1);
		list4.addAll(list2);
		System.out.println("Hơp/ Gộp 2 danh sách: "+ list4);
				
		List<Integer> list5 = new ArrayList<>(list1);
		list5.removeAll(list2);
		System.out.println("Hiệu 2 danh sách: "+ list5);
	}
	
}
