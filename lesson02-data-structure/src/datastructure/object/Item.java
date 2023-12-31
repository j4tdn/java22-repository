package datastructure.object;

/*
 Có 2 loại KDL
 1. Kiểu nguyên thủy
 --> int, char, double, long
 --> chỉ sử dụng các KDL có sẵn của Java
 
 2. Kiểu đối tượng
 --> Integer,Double,Float --> KDL có sẵn của Java
 --> Item, Employee, Store --> KDL do mình tự khai báo, khởi tạo thêm từ bài toán
 
  VD: Mặt hàng: mã mặt hàng, tên mặt hàng, giá bán
  	  Item: id, name, salePrice
  	  
 */
// Item là kiểu dữ liệu, ngang hàng với int
public class Item {
	
	// thuộc tính của KDL Item
	// Khi tạo biến có KDL Item --> biến đó luôn có 3 thông tin(id, name, salePrice)
	public int id;
	public char name;
	public double salePrice;
	
	// hàm khởi tạo mặc định (không có tham số truyền vào)
	// dùng để khởi tạo 1 đối tượng (ô nhớ) trên vùng nhớ HEAP
	// ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class Item
	// được gọi thông qua từ khóa 'new'
	public Item() {
		
	}
	
	public Item(int pId, char pName, double pSalePrice) {
		this.id = pId;
		this.name = pName;
		this.salePrice = pSalePrice;
		
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salePrice + ", ";
	}	

}
