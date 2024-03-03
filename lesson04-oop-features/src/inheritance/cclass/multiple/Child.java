package inheritance.cclass.multiple;

// Father: running, coding, cooking(ngon)
// Mother: playBadminton, designing, cooking(dở)
public class Child extends Father/* , Mother */ {
	
	/**
	 * Java không hỗ trợ tính chất đa thừa kế
	 * 
	 * 1 class không thể thừa kế extends 2 hoặc N classes khác
	 * 
	 * Vì sao ?
	 * 
	 * Java: Khi class extends từ 1 class 
	 * --> không bắt buộc override các hàm từ class cha cho nên
	 * 
	 * nếu các class cha có chung(phần khai báo ví dụ cooking) hàm nào đó
	 * mà class con không bắt buộc phải override --> đối tượng con gọi đến hàm 
	 * đó thì nó sẽ ko biết gọi hàm của class cha nào
	 * 
	 */
	
	public static void main(String[] args) {
		Child child = new Child();
		child.coding();
		child.cooking();
	}
	
}