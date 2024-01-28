package inheritance.cclass.multiple;

public class Child extends Father {
	
/*
 * Java không  hỗ trợ tính chất đa thừa kế
 * 
 * 1 class không thừa kế extends 2 hoặc N classes khác
 * 
 * Java: khi class extends từ 1 class
 * --> không bắt buộc override các hàm từ class cha cho nên
 * nếu các class cha có chung hàm nào đó mà class con không bắt buộc override -->
 * đói tương không biết gọi đén hàm nào của classl
 */

	public static void main(String[] args) {
		Child child = new Child();
		child.coding();
	}
}
