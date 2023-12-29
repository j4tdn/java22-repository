package datastructure.object.custom;

public class Item {

	//thuoc tinh kdl Item
	//khi bien co kdl item-> bien do luon co 3 thong tin
	public int id;
	char name;
	double salePrice;
	
	//ham khoi tao mac dinh(khong co tham so truyen vao)
	//dung de khoi tao 1 doi tuong(ô nhớ) trên vùng nhớ
	//ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class
	//đc gọi thông qua từ khóa new
	public Item() {}
	//trong 1 class co tu khoa this thì sẽ đại diện cho biến, đối tượng hiện tại đag gọi đến hàm trong class
	//khởi tạo ô nhớ ở heap-> this đại diện cho ô nhớ vừa tạo
	//return this
	
	//Override
	@Override
	public String toString() {
		return this.id + ","+ this.name + ","+ this.salePrice;
		
	}

	public Item(int pid, char pname, double psalePrice) {
		super();
		this.id = pid;
		this.name = pname;
		this.salePrice = psalePrice;
	}
}
