package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		//kieu du lieu nguyen thuy
	int a = 8;
	//ldl doi tuong -->tu tao ra
	
	Item it = new Item();
	/*
	 * KDL đối tượng --> có sẵn của Java -->Integer,String,Double
	 * -->luôn luôn có duy nhất 1 thuôvj tính bên trong
	 * Integer-->int value
	 * String-->byte[] value
	 * Chracter-->char value
	 * */

	/*
	 * + sử dụng từ khóa new gọi hàm khởi tạo giá trị cho biến
	 * -->lưu trữ trong trong vùng nhớ HEAP
	 * -->cứ new ra thì luôn khởi tạo ô nhớ mới co đối tượng tạo ra
	 * 
	 * 
	 * + gán giá trị trực tiếp cho biến , ko dùng từ khóa new 
	 * -->lưu trữ trong vùng nhớ HEAP-cóntant poo(ko cho thay đổi giá trị)
	 * -->trước khi khởi tạo ô nhớ mới , kiểm tra xem giá trị của đối tượng muôan 
	 * tạo ra đã có ở constant pool hay chưa , nếu chưa có thì mới tạo ra
	 * --> luôn luôn sử dụng cách khai báo và gán giá trị truực tiếp cho biến 
	 * thuộc KDL đối tượng có sẵn của Java
	 * -->tiêwst kiệm heap memoty khi khởi tạo nhiều ô nhớ có giá trị trùng nhau
	 * Iteger a = 8;
	 * String s = "hello";
	 * 
	 * Phân biệt int, Integer...
	 * -->int : 1005 mình phải có giá trị , măcj định là 0
	 * -->integer : null, có giá trị
	 * + bắt buộc có giá trị -->int
	 * +ko bắt buộc -->Integer
	 * -->thực tế, hầu hết các thuộc tính dùng để chứa dữ liệu từ dâtabase(csdl)
	 * có kahr năng nullable nên hầu hết-->Kdl đối tượng
	 * 
	 * -->những biến logic xử lí bài toán -->NT,DT
	 * 
	 * */
	Integer i1 = new Integer(22);//H1
	Integer i2 = new Integer(33);//H2
	Integer i3 = new Integer(33);//H3
	// dù = 33 giống nhau nhưng ô nhớ khác nhau
	 System.out.println("i1 code --> " + System.identityHashCode(i1));
	 System.out.println("i2 code --> " + System.identityHashCode(i2));
	 System.out.println("i3 code --> " + System.identityHashCode(i3));

	Integer n1 = 55;//H4
	Integer n2 = 66;//H5
	Integer n3 = 66;//H5
	 System.out.println("n1 code --> " + System.identityHashCode(n1));
	 System.out.println("n2 code --> " + System.identityHashCode(n2));
	 System.out.println("n3 code --> " + System.identityHashCode(n3));
	 
	n3 = 88;//H6
	//n2 dữ nguyên , n3 thay đổi 
	System.out.println("n2 --> " + n2);
	System.out.println("n3 --> " + n3);
	
	String s1 = new String("hello");
	String s2 = "xin chào ";
	
	Character c1 = new Character('a');
	Character c2 = 'b';
		
		
	}

}
