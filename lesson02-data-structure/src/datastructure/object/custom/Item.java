package datastructure.object.custom;

public class Item {
	//thuộc tính của KDL Item
	//Khi tạo biến có KDL item --> biến đó có 3 thông tin (id,nme ,salePresom)
	int id;
	char name;
	double salesPrice;
	
	//hàm khởi tạo mặc định
	//dùng dể khởi tạo 1 đối tượng (Ô nhó ) trên vùng nhớ heap
	//ô nhó phải có đầy đủ thông tin thuộc tính trong class Item
	//Được khởi tạo thông qua từ khóa 'new'
	public  Item() {
		// Khởi tạo ô nhớ ở heap --> this đại diện cho ô nhớ vừa tại ra
		// Return this
	}
	public  Item(int pId,char pName, double pSalesPrice) {
		//Khởi tạo ô nhớ ở heap --> this đại diện cho ô nhớ vừa tạo ra 
		//return this
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;

	}
	//Trong 1 calss có từ khóa this
	//itA.toString()-->H1(id,name,salesPrice) -->this = itA
	//itB.toString()-->H2(id,name,salesPrice) -->this = itB

	//override(Định nghĩa lại) hàm toString
	@Override
	public String toString() {
		return this.id + ","+ this.name+ ","+this.salesPrice;
	}
}
