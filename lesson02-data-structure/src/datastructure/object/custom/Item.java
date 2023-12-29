package datastructure.object.custom;

public class Item {
    int id;
	char name;
	double salesPrice;
	
	public Item(){
		
	}
	
	public Item(int pID, char pName, double pSalesPrice) {
		this.setId(pID);
		this.name=pName;
		this.salesPrice=pSalesPrice;
	}
	
	
	
	@Override
	public String toString() {
		return this.getId() + "," + this.name + "," + this.salesPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
