package datastructure.object.custom;


// Item là kiểu dữ liệu, ngang với int
public class Item {
	
	// thuộc tính của KDL Item
	// khi tạo biến có KDL Item -> biến đó luôn có 3 thông tin (id, name, salesPrice)
	public int id;
	public char name;
	public double salesPrice;
	
	// hàm khởi tạo mặc định( ko có tham số truyền vào)
	// dùng để khởi tạo 1 đối tượng (ô nhớ) trên vùng nhớ heap
	// ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class Item
	// được gọi thông qua từ khóa 'new'
	
	// hàm khởi tạo mặc định sẽ tự mất đi khi mình có hàm khởi tạo khác
	public Item() {
		//khởi tạo ô nhớ ở heap -> this đại diện cho ô nhớ vừa tạo ra
		//return this
	}
	
	// Item itC = new Item(33, 'C', 67);
	public Item(int pId, char pName, double pSalesPrice) {
		// khởi tạo ô nhớ ở heap -> this đại diện cho ô nhớ vừa tạo ra
		// return this
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	// trong 1 class có từ khóa this
	// this đại diện cho biến, đối tượng hiện tại đang gọi đến hàm trong class
	
	// itA.toString() -> H1(id, name, salesString) -> this = itA
	// itB.toString() -> H2(id, name, salesString) -> this = itB
	//override (định nghĩa lại) hàm toString
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
}
