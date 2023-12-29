package datastructure.object.custom;

//Item là kiểu dữ liêu, ngang hàng với int

public class Item {
	
	//thuộc tính của KDL Item
	// khi tạo biến có KDL item --> biến đó luôn có 3 thông tin(id, name, salesPrice)
	
	int id;
	char name;
	double salesPrice;
	
	//hàm khởi tạo mặc đinh(ko có tham số truyền vào): dùng để khởi tạo đối tượng(ô nhớ) trên vùng nhớ heap
	//ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class Item
	//được gọi thông qua từ khóa "new"
	//hàm khởi tạo mặc định sẽ tự mất đi khi có hàm khởi tạo khác
	
	public Item() {
		//khởi tạo ô nhớ ở heap --> this đại diện cho ô nhớ vừa tạo ra
		//return this
	}
	// override(định nghĩa lại) hàm toString
	//trong 1 class có từ this - đại diện cho biến, đối tượng hiện tại đang gọi đến hàm trong class
	
	public Item(int pId, char pName, double psalesPrice) {
		//khởi tạo ô nhớ ở heap --> this đại diện cho ô nhớ vừa tạo ra
		//return this
		this.id = pId;
		this.name = pName;
		this.salesPrice = psalesPrice;
		
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
			
}
