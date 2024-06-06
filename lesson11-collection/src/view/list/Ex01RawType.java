package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawType {

	public static void main(String[] args) {
		// Để khai báo 1 biến kdl List, ArrayList, LinkedList
		
		// Từ JDK 1.0 đến JDK 1.34
		// l1 là biến có kdl List lúc compile và là ArrayList lúc runtime
		// l2 là biến có kdl List lúc compile và là LinkedList lúc runtime
		// l1, l2 là kiểu list có thể chứa các phần tử, mỗi phần tử có kdl Object --> add bất kỳ giá trị KDL nào
		// vấn đề: ko kiểm soát đc KDL add vào trong list -> dễ bị lỗi ép kiểu lúc runtime nếu giá trị add vào ko chính xác
		List l1 = new ArrayList();
		
		l1.add("text1");
		l1.add("text2");
		printList14("l1 value ",l1);
		
		List l2 = new LinkedList(); //cần lưu danh sách các số nguyên
		l2.add(6);
		l2.add("nam");
		printList14("l2 value ",l2);
		
	}
	
	private static void printList14(String prefix, List list) {
		System.out.print(prefix + "--> ");
		for(Object object : list) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
}
