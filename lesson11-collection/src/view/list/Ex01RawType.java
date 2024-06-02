package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawType {
	
	public static void main(String[] args) {
		// Để khai báo 1 biến KDL List, ArrayList, LinkedList
		
		// Từ JDK 1.0 đến JDK 1.4
		// l1 là biến có KDL List lúc compile và là ArrayList lúc runtime
		// l2 là biến có KDL List lúc compile và là LinkedList lúc runtime
		// l1, l2 là list có thế chứa các phần tử, mỗi phần tử có KDL Object --> add bất kỳ giá trị KDL nào
		// vấn đề: ko kiểm soát KDL add vào trong list --> dễ bị lỗi ép kiểu lúc runtime nếu giá trị add vào ko chính xác
		
		// public interface List<E> {....}
		
		// chưa quan tâm ArrayList, LinkedList
		
		// khai báo theo kiểu raw type --> khi gọi generic class/interface cần truyền vào generic type
		// mà mình ko truyền vào sử dụng mặc định object --> raw type
		
		List l1 = new ArrayList(); // cần lưu danh sách các chuỗi
		l1.add("text1");
		l1.add("text2");
		printList14("l1 values", l1);
		
		List l2 = new LinkedList(); // cần lưu danh sách các số nguyên
		l2.add(3);
		l2.add(6);
		// l2.add("nam"); runtime error
		printList14("l2 values", l1);
		
		// lấy phần tử trong l2 đem * 2 + 1 --> in ra giá trị mới
		for (Object object: l2) {
			// could be exception at runtime
			int newValue = Integer.parseInt(object.toString()) * 2 + 1;
			System.out.println("oldValue("+object+") --> newValue("+newValue+")");
		}
		
		// Generic Type: Là 1 KDL generic đại diện, tham số cho bất kỳ KDL đối tượng nào
		//             : đặt tên bất kỳ --> thường là kí tự đơn viết hoa hoặc từ có nghĩa
		
		// Generic interface/class: là 1 interface/class trong đó có tham số là 1 hoặc N generic type
		//                        : khi cần gọi/sử dụng generic interface/class thì phải truyền giá trị cho generic type
		//                        : giá trị của generic type là 1 KDL đối tượng
		//                        VD: List<E> --> gọi --> List<Integer>, List<Item>
		
		// Từ JDK 1.5 đến now --> khai báo theo kiểu generic type
		// Sử dụng: 1.5 --> List<X1> list = new ArrayList<X1>();
		// Sử dụng: 1.7 --> List<X1> list = new ArrayList<>();
		List<String> l3 = new ArrayList<>(); // cần lưu danh sách các phần tử chuỗi
		l3.add("text1");
		l3.add("text2");
		
		List<Integer> l4 = new ArrayList<>(); // cần lưu danh sách các phần tử số
		l4.add(2);
		l4.add(4);
		// l4.add("tam); compile error
		printListNow("l4", l4);
	}
	
	private static void printListNow(String prefix, List<Integer> list) {
		System.out.print(prefix + " --> ");
		for (Integer object: list) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	
	private static void printList14(String prefix, List list) {
		System.out.print(prefix + " --> ");
		for (Object object: list) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
}
