package inheritance.cclass.multiple;

public class Child extends Father{
	/*
	 Trong java không hỗ trợ tính chất đa thừa kế: 
	 	1 class ko thừa kế 2 hoạc nhiều class khác
	 	Vì sao?
	 	- trong java không bắt buộc override các hàm đc thừa kế
	 	--> nếu các class cha có chung (phần khai báo ví dụ cooking) hàm nào đó mà class
	 	con ko override --> đối tượng con gọi đến hàm đó sẽ ko biết gọi hàm của cha nào 
	 */
	public static void main(String[] args) {
		Child child = new Child();
		child.coding();
	}
}
