package view.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03SotOperations {
	public static void main(String[] args) {
		List<String> elements = mockData();
		// Thao tác duyệt các phần tử
		// Duyệt bất đồng bộ: Đang duyệt ptu thứ i có thẻ truy cập ptu khác i
		
		// Cách 1: for index
		forIndex(elements);
		
		// Cách 1: for each
		forEach(elements);
		
		// Duyệt đồng bộ, tuần tự từng phần tử 
		// Đang duyệt đến phần tử thứ i chỉ được phép truy cập phần tử thứ i
		// Không được truy cập đến các ptu khác
		
		// Cách 3: iterate
		iterate(elements);
		
		elements.remove("C22");
		printf("Xóa C22 ", elements);
		
		// Xóa những phần tử có kí tự bắt đầu > D
		/*
		for (String element: elements) {
			if (element.charAt(0) > 'D') {
				elements.remove(element);
			}
		}
		remove(elements, element -> {
			char last = element.charAt(element.length() - 1);
			return last > '2' && last <= '9';
		});*/
		// xóa theo điều kiện
		elements.removeIf(element -> {
			char last = element.charAt(element.length() - 1);
			return last > '2' && last <= '9';
		});
		printf("Xóa những phần tử có kí tự cuối cùng là số 2", elements);
		
		System.out.println("Test hàm contains: " + elements.contains("A12"));
		
	}
	private static void remove(List<String> elements, Predicate<String> predicate) {
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			if (predicate.test(iterator.next())) {
				iterator.remove();
			}			
		}
	}
	private static void printf(String prefix,List<String> elements) {
		System.out.println(prefix + " --> ");
		for (String element: elements) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
	}
	private static void iterate(List<String> elements) {
		System.out.println("List Interate: ");
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element + " ");
		}
		System.out.println("\n");
	}
	private static void forIndex(List<String> elements) {
		System.out.println("List forIndex: ");
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i) + " ");
		}
		System.out.println("\n");
	}
	private static void forEach(List<String> elements) {
		System.out.println("List forEach: ");
		for (String element: elements) {
			System.out.println(element + " ");
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
