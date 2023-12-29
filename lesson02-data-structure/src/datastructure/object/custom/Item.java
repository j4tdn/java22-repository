package datastructure.object.custom;
/*
 có 2 kdl
 1. Kiểu nguyên thủy:
   -int, char, double, long
   -chỉ sử dụng kdl có sẵn của Java
 2. Kiểu đối tượng
   -Integer, Double, Float -> kdl có sẵn của Java
   -Item, Employee, Store --> kdl mình tự khai báo
   item là kiểu dl ngang với int
 */
public class Item {
    //thuộc tính của kdl item
	//khi tạo biến có kdl item, biến luôn có 3 thông tin id, name, saleprice
	int id;
	char name; 
	double salesPrice;
	
	public Item() {
		
	}
	//trong 1 class có từ khóa this
	// this đại diện cho biến, đối tượng hiện tại đang được trỏ đến
	
	public Item (int id, char name, double salePrice) {
		//khởi tạo ô nhớ ở heap -> this đại diện cho ô nhớ vừa tạo ra
	    //return this
		
		this.id=id;
		this.name=name;
		this.salesPrice=salePrice;
	}
	//ovveride(định nghĩa lại) hàm toString

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
}
