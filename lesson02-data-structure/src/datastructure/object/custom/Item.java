package datastructure.object.custom;

public class Item {
    public int id;
    public char name;
    public double salesPrice;
	public int price;
    // ham khoi tao mac dinh, se tu mat di khi co ham khoi tao khac
    public Item() {
    	
    }
    public Item( int pId, char pName, double pSalesPrice) {
    	this.id = pId;
    	this.name = pName;
    	this.salesPrice =pSalesPrice;
	}
    //trong 1 class co tu khoa this
    // this dai dien cho bien, doi tuong hien tai dang goi den ham trong class 
    //itA.tString()---> H1
    //override ( định nghĩa lại) hàm toString 
    @Override
    public String toString() {
    	return this.id + "," + this.name +"," + this.salesPrice;
    }
}
