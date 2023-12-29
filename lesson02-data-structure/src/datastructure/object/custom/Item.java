package datastructure.object.custom;

public class Item {
	
	//Item là kiểu dữ liệu, ngang hàng với int
	//int a?
	//Item b= ?
	public int id;
	public char name;
	public double salesPrice;
	
	//hàm khởi tạo mặc định(không có tham số truyền vào)
	// dùng để khởi tạo 1 đối tượng trên vùng nhớ HEAP
	// ô nhớ sẽ có đầy đủ các thông tin của các thuộc tính có trong Class Item
	public Item() {
		
	}
	public Item(int a, char b, Double c) {
		//Khởi tạo ô nhớ ở heap -> đại diện cho ô nhớ vừa tạo ra
		this.id = a;
		this.name = b;
		this.salesPrice = c;
	}
	
	//trong một class có từ khóa this
	//this đại diện cho biến, đối tượng hiện tại đang gọi đến hàm trong class
	
	//override(định nghĩa lại) hàm toString
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.salesPrice;
	}
}