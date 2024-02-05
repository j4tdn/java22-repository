package inheritance.cclass.multiple;

public class Child extends Father, Mother{
	
	/*
	 * Java ko hỗ trợ tính chất đa thừa kế
	 * 
	 * 1 class ko thể extends từ nhiều class
	 * 
	 * vì sao?
	 * 
	 * JAVA: Khi class extends từ 1 class 
	 * --> ko bắt buộc mình phải override từ các hàm class cha cho nên
	 * nếu các class cha có chung(phần khai báo) 1 hàm nào đó mà class con
	 * ko bắt buộc phải override --> đối tượng con gọi đến hàm 
	 * đó thì nó sẽ ko biết gọi từ hàm cha nào
	 */

	public static void main(String[] args) {
		Child child = new Child();
		child.coding();
		child.cooking();
	}
	

}
