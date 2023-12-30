package datastructure.object.custom;

public class Item {
	//thuộc tính của kiểu dữ liệu item 
	// khi tạo biến có kdl item --> biến đó luôn có 3 thông tin 
	public int id;
	public char name; 
	public double salesPrice;
	
	
	//ham khởi tạo mặc định (ko có tham số truyền vào)
	//dùng để khởi tạo 1 đối tượng (ô nhớ) trên vùng nhớ heap
	//ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class Item 
	//được gọi thông qua từ khoá 'new'
	public Item() {
		//khởi tạo ô nhớ ở heap
	}
	
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	//trong 1 class có từ khoá this 
	//this đại diện cho biến, đối tượng hiện tại đang gọi đến hàm trong class
	
	//itA.toString() ->H1(id,name, salesPrice) -->this = itA
	
	//override (định nghĩa lại) hàm toString 
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
	
}
