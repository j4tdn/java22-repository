package datastructure.Object.Custom;

/*
 
 Có 2 loại KDL
 1. Kiểu nguyên thủy
 --> int, char, double, long
 --> chỉ sử dụng các KDL có sẵn của Java
 
 2. Kiểu đối tượng
 --> Integer, Double, Float --> KDL có sẵn của Java
 --> Item, Employee, Store --> KDL do mình tự khai báo, khởi tạo thêm tùy bài toán
 
 VD: Mặt hàng: mã mặt hàng, tên mặt hàng, giá bán
 	 Item: id, name, salesPrice
 
 */


// Item là Kiểu dữ liệu, ngang hàng với int
// int a = ?
// Item b = ?
public class Item {
	 
	// thuộc tính của KDL Item
	// khi tạo biến có KDL item --> biến đó luôn có 3 thông tin(id, name, salesPrice)
	public Integer id;
	public char name;
	public double salesPrice;
	
	// reflection
	
	// hàm khởi tạo mặc định(ko có tham số truyền vào)
	// dùng để khởi tạo 1 đối tượng(ô nhớ) trên vùng nhớ heap
	// ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class Item
	// được gọi thông qua từ khóa 'new'
	
	// hàm khởi tạo mặc định sẽ tự mất đi khi mình có hàm khởi tạo khác
	public Item() {
		// khởi tạo ô nhớ ở heap --> this đại diện cho ô nhớ vừa tạo ra
		// return this
	}
	
	// Item itc = new Item(33, 'C', 67);
	public Item(int pId, char pName, double pSalesPrice) {
		// khởi tạo ô nhớ ở heap --> this đại diện cho ô nhớ vừa tạo ra
		// return this
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	// trong 1 class có từ khóa this
	// this đại diện cho biến, đối tượng hiện tại đang gọi đến hàm trong class
	
	// itA.toString() --> H1(id, name, salesPrice) --> this = itA
	// itB.toString() --> H2(id, name, salesPrice) --> this = itB
	
	// override(định nghĩa lại) hàm toString
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
	
}