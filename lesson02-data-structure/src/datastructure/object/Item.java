package datastructure.object;

public class Item {
	//thuoc tinh cua KDL Item
	//khi tao bien co KDL item --> bien do luon chua 3 thong tin
	
	public int id;
	public char name;
	public double salesPrice;
	
	//ham khoi tao mac dinh ko co tham so truyen vao
	// dung de khoi tao 1 doi tuong(o nho) tren vung nho heap
	// o nho phai co day du thong tin cua cac thuoc tinh trong class Item
	// duoc goi thong qua tu khoa 'new'
	
	// ham khoi tao mac dinh se tu mat di khi minh co ham khoi tao khac
	
	public Item(double d, float f) {
		// khoi tao o nho o heap --this dai dien cho o nho vua tao ra
		// return this
	}
	
	//Item itc = new Item(33, 'C', 67);
	
	public Item(int pId, char pName, double pSalesPrice) {
		//khhoi tao o nho o heap --> this dai dien cho o nho vua tao ra
		// return this
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	//trong 1 class co tu khoa this
	// this dai dien cho bien, doi tuong hien tai dang den ham trong class
	
	//itA.toString() -->H1 (id,name, salesPrice) --> this =itA
	//itB.toString() -->H2 (id,name, salesPrice)
	//override(dinh nghialai) ham toString
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
		
	}
}
