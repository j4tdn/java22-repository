package inheritance.cclass.multiple;


public class Child extends Father{
	/*
	 Java không hỗ trợ tính chất đa thừa kế
	 1 class ko thể thừa kế/extends 2 hoặc N classes khác
	 Vì:
	 Java: ko bắt buộc override các hàm từ class cha cho nên
	 nếu các class có chung(phần khai báo VD cooking) hàm nào đó
	 mà class con ko bắt buộc phải override --> đối tượng con gọi đến
	 hàm đó thì nó sẽ ko biết gọi hàm của class cha nào 
	 */
	
	public static void main(String[] args) {
		Child child = new Child();
		child.cooking();
		
	}

}
