package inheritance.cclass.multiple;


public class Child extends Father /*, Mother */ {
	/*
	 * Trong Java ko hỗ trợ tính chất đa thừa kế
	 * 
	 * 1 class ko thể thừa kế 2 hoặc N class khác
	 * 
	 * Vì sao
	 * 
	 * Java: khi class extends từ class khasc
	 * => ko bắt buộc override các hàm từ class cha
	 * nếu các class cha có chung(phần khai báo ví dụ cooking) hàm nào đó
	 * mà class con ko bắt buộc phải override -> đối tượng con gọi đến hàm đó
	 * thì nó sẽ ko biết gọi hàm của class cha nào 
	 */
	
	public static void main(String[] args) {
		Child child=new Child();
		child.coding();
		child.cooking();
	} 

}
