package inheritance.cclass.multiple;


public class Child extends Father{
	
	/*
	 * Java không hổ trợ tính chất đa thừa kế
	 * 
	 * 1 class không thể thừa kế extends 2 hoặc N classes khác
	 * 
	 * Java: khi class extends từ 1 class
	 * --> không bắt buộc override các hàm tuè class cha cho nên
	 * nếu các class cha có chung (phần khai báo ví dụ cooking) hàm 
	 * nào đó mà class con không bắt buộc phải override --> đối tượng con gọi đến
	 * hàm đó thù nó sẽ không biét gọi hàm của class cha nào
	 * */
	

}
