package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main (String[] args) {
		//KDL nguyên thủy ->> int, double, char , long
		int a=8;
		//KDL đối tượng --> tự tọa ra --> Item,Studen,...
		Item Item = new Item (1, 'a', 11d);
		
		String s1 = "hello";
		String s2 = new String ("hi");
		
		Long l1 = 22l;
		Long l2 = new Long(331);
		
		//phân biệt int và Integer
		//Class Integer
		
		//phân biệt long và Long
		//Điểm khác nhau khi khởi tạo giá trị trực tiếp và thông qua từ khóa new cho KDL đối tượng có sẵn của JAVA
	
		//c1:Sử dụng từ khóa new gọi hàm khởi tọa để khởi tạo giá trij cho biến
		//-->lưu trữ trong vùng nhớ HEAP vủa JVM
		//+ cứ new ra thì luôn khởi tạo ô nhớ mới cho đối tượng tạo ra
		
		//c2:Gán giá trị trựic tiếp cho biếnm không dùng từ khóa new
		//->lưu trữ trong vùng nhứo HEAP - constant pool(giá trị không thay đổi)
		//-->trước khi khởi tạo ô nhứo mới kiểm tra xem giá trị của đối tương muốn tạo ra đã có ở constant pool chưa, nếu có thì mới tạo ra
		
		Integer i1 = new Integer(22);
		System.out.println("i1 -->" + System.identityHashCode(i1));
		Integer i2 = new Integer(33);
		System.out.println("i2 -->" + System.identityHashCode(i2));
		
		Integer i3 = 44;
		System.out.println("it3 -->" + System.identityHashCode(i3));
		Integer i4 = 55;	
		System.out.println("it4 -->" + System.identityHashCode(i4));
		Integer i5 = 55;
		System.out.println("it5 -->" + System.identityHashCode(i5));
	}
}
