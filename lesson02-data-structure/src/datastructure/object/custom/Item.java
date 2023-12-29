package datastructure.object.custom;

public class Item {
	
	public int id;
	public char name;
	public double salesPrice;
	
	public Item() {
		
	}
	
	//Item itC = new Item(33, 'C', 67)
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
}
