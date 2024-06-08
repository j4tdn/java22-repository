package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawType {
	
	 public static void main(String[] args) {
		// khai báo kdl List, Arraylist, LinkedList
		 
		 // từ JDK 1.0 --> 1.4
		List l1 = new ArrayList();
		l1.add("text 1");
		l1.add("text 2");
		printList("l1 values",l1);
		
		
		
		List l2 = new LinkedList();
		l2.add(3);
		l2.add(6);
		l2.add("nam");
		printList("l2 values",l2);
		
		// l1, l2 là List chứa các ptu, mỗi ptu có kdl object --> add bất kì kdl nào
		
		
		// lấy phần tử trongn l2 đem "2+1 --> in ra giá trị mới
		for (Object o: l2) {
			int newvalue = Integer.parseInt(o.toString())*2 +1;
			System.out.println("oldvales ("+o+")  --> newvalues ("+newvalue+")");
		}// --> lỗi kdl 
		 
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
	 private static void printList(String prefix, List list) {
		 System.out.println(prefix + "-->");
		 for (Object o: list) {
			 System.out.print(o + "  ");
		 }
		 System.out.println("\n");
	}
}
