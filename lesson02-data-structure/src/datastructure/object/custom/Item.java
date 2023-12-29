package datastructure.object.custom;

public class Item {
	public int id;
	char name;
	double salesPrime;
	// ham khoi tao (ko co tham so  truyen vao)
	// dung de khoi tao dois tuong (o nho) tren vung nho heap
	// o  nho phai co day du thong tin cua cac thuoc tin trong class
	// dc goi thong qua tu khoa 'new'
	public Item() {

}
	
	public Item(int pid, char pname, double psalesPrime) {
	
		this.id = pid;
		this.name = pname;
		this.salesPrime = psalesPrime;
	}

	//this dai dien cho bien,doi tuong hien tai dang goi den ham trong class
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.salesPrime;
	}
}
