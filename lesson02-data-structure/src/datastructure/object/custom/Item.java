package datastructure.object.custom;

public class Item {
	public int id;
	char name;
	double salePrice;

	// hamf khoiwr taoj khoiwr taoj 1 dodoi tuong treen vung nho heap
	// được ghọi thông qua từ khóa new
	public Item() {
	}
	
	public Item(int pId,char pName ,double pSalePrice) {
		this.id =pId;
		this.name =pName;
		this.salePrice =pSalePrice;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrice=" + salePrice + "]";
	}
}
