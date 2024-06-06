package view.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03SotOperations {

	public static void main(String[] args) {
		List<String> elements = mockData();
		
		System.out.println("======= Thao tác duyệt các phần tử ====");
		
		
		//Thao tác duyệt các phần tử
		
		// Duyệt bất đồng bộ
		// -> Đang duyệt đến ptu thứ i vẫn có thể truy tập ptu KHÁC i
		// cách 1: for index
		forIndex(elements);
		
		// cách 2: for each
		forEach(elements);
		
		// cách 3: iterate
		//Duyệt đồng bộ, tuần tự từng phần tử
		// -> Đang duyệt đến ptu thứ i chỉ đc phép truy tập ptu thứ i
		//    KO đc truy cập ptu khác
		iterate(elements);
		
		System.out.println("======= Thao tác với hàm add/get/set/remove các phần tử ====");
		
		elements.remove("C22");
		printf("Xóa phần tử C22 --> ", elements);
		
		/*
		// Xóa những phần tử mà có kí tự bắt đầu > D_
		// Exception in thread "main" java.util.ConcurrentModificationException
		for(String element:elements) {
			// element.remove("W88");
			if(element.charAt(0) > 'D') {
				elements.remove(element);
			}
		}
		*/
		
//		remove(elements, element -> element.charAt(0) > 'D');
//		printf("Xóa những phần tử mà có kí tự bắt đầu > 'D_' --> ", elements);
		
//		remove(elements, element -> {
//			char last = element.charAt(element.length() - 1);
//			return last > '2' && last <= '9';
//		});
		
		// xóa theo điều kiện
		elements.removeIf(element -> {
			char last = element.charAt(element.length() - 1);
			return last > '2' && last <= '9';
		});
		printf("Xóa những phần tử mà có kí tự cuối cùng là số > số '2' --> ", elements);
		
		System.out.println("Test hàm contains --> " + elements.contains("A12")); //true
		
	}
	
	// -> StrategyPattern
	// iterator.next().charAt(0) > 'D'
	// iterator.next().charAt(0) == 'A'
	// boolean test(String element)
	private static void remove(List<String> elements, Predicate<String> predicate) {
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			if(predicate.test(iterator.next())) {
				iterator.remove();
			}
		}
	}
	
	private static void printf(String prefix, List<String> elements) {
		System.out.print(prefix);
		for(String element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
		
	}
	
	private static void iterate(List<String> elements) {
		System.out.println("List iterate:");
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	
	private static void forIndex(List<String> elements) {
		System.out.println("List forIndex: ");
		for (int i = 0; i < elements.size(); i++) {
			System.out.print(elements.get(i) + " ");
		}
		System.out.println("\n");
	}
	
	private static void forEach(List<String> elements) {
		System.out.println("List forEach: ");
		for(String element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
		
	}
	
	private static List<String> mockData(){
		List<String> elements = new ArrayList<>();
		elements.add("A12");
		elements.add("Z7");
		elements.add("C22");
		elements.add("W88");
		elements.add("D55");
		
		return elements;
	}
	
}
