package datastructure.object.custom;

public class Item {
	
   int id;
   char name;
   double salesPrice;
   
   //hàm khởi tạo mặc định(k có tham số truyền vào )
   // dùng để khởi tạo 1dối tượng (ô nhớ ) trên vùng nhớ heap
   
   public Item() {}
  
   public Item(int pId , char pName, double pSalesPrice) {
	   this.id = pId;
	   this.name = pName;
	   this.salesPrice = pSalesPrice;
	   
	   
   }
   // override (định nghĩa lại cái ) hàm tostring
   @Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
		
	}
}
