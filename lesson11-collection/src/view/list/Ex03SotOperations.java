package view.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03SotOperations {
	public static void main(String[] args) {
		List<String> elements = mockData();
		
		//  Thao tác duyệt các phần tử
		
		//  --> duyệt bất đồng bộ : khi duyệt ptu thứ i thì vẫn có thể truy cập ptu khác i
		//Cách 1: for index
		forIndex(elements);
		//Cách 2: forEach
		forEach(elements);
		
		//  --> duyệt đồng bộ : khi duyệt ptu thứ i thì chỉ được phép truy cập ptu thứ i không được truy cập ptu khác
		//Cách 3: iterate
		iterator(elements);
		
		System.out.println("=== Thao tác với hàm add/set,get/remove ===");
		
		elements.remove("C22");
		printf(" xóa ptu 'C22' ", elements);
		
		
//		for(String e: elements) {
//			// element.remove('W88') => lỗi ConcurrentModificationException
//			if(e.charAt(0) > 'D') {
//				elements.remove(e);
//			}
//		}
		remove(elements, element -> element.charAt(0) > 'D');
		printf(" xóa ptu có kí tự bắt đầu '>D' ", elements);
		
//		remove(elements, element -> {
//			char last = element.charAt(element.length()-1) ;
//			return last > '2' && last<='9';
//		});
		elements.removeIf(element -> { // cách mới gọn hơn
			char last = element.charAt(element.length()-1) ;
			return last > '2' && last<='9';
		});
		printf(" xóa ptu có kí tự cuối cùng là số, > 2", elements);
		 
		System.out.println(" Test hàm contains -->" + elements.contains("A22"));
	}
	private static void remove (List<String> elements, Predicate<String> predicate) {
		
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			if(predicate.test(iterator.next())) {
				iterator.remove();
			}
		}
	}
	
	private static void printf (String prefix, List<String> elements) {
		System.out.print(prefix + " --> ");
		for (String e: elements) {
			System.out.print(e + "  ");
		}
		System.out.println("\n");
	}
	
	
	private static void iterator (List<String> elements) {
		Iterator<String> iterator = elements.iterator();
		
		System.out.println("List iterate : ");
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	private static void forIndex (List<String> elements) {
		System.out.println("List forIndex : ");
		for (int i = 0; i<elements.size(); i++) {
			System.out.print(elements.get(i)+ "  ");
		}
		System.out.println("\n");
	}
	
	private static void forEach (List<String> elements) {
		System.out.println("List forEacch : ");
		for (String e: elements) {
			System.out.print(e + "  ");
		}
		System.out.println("\n");
	}
	
	
	private static List<String> mockData() {
		List<String> elements = new ArrayList<>();
		elements.add("A12");
		elements.add("Z7");
		elements.add("B90");
		elements.add("G09");
		elements.add("C22");
		elements.add("W82");
		elements.add("D55");
		elements.add("K12");
		return elements;
	}
}

