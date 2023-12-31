package datastructure.object.custom;

public class Item {
	
	//thuộc tín 
	public int id;
	public char name;
	public double salesPrice;
	
	// hàm khởi tạo mặc định (ko có them số truyền vào)
	// dùng để khởi tạo 1 dối tượng (ô nhớ) trên vùng nhớ heap
	// ô nhớ phải đầy đủ các thông tin của các thuộc tín trong class Item
	// được gọi thông qua từ khóa new
	public Item() {
	}
	
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}


	@Override
	public String toString() {
		
		return"\n" + this.id+","+this.name+","+this.salesPrice;
	}
}
