package inheritance.cclass.multiple;

public class Child extends Father {
	
	/*
	 Java ko hỗ trợ tính chất đa thừa kế
	 
	 1 class ko thể thừa kế extends 2 hoặc N classes khác 
	 
	 Vì sao?
	 
	 Java: khi class extends từ 1 class
	 --> không bắt buộc override các hàm từ class cha cho nên 
	 
	 nếu các class cha có chung( phần khai báo vid dụ cooking) hàm nào đó
	 mà class con ko bắt buộc phải override --> đối tượng con gọi đến hàm 
	 đó thì nó sẽ ko biết gọi hàm của class cha nào 
	 */
	
	public static void main(String[] args) {
		Child child = new Child();
		child.cooking();
		child.cooking();
	}
}


