package datastructure.object.custom;



public class Item {
	//Thuộc tính của kiểu dữ liệu Item
	//Khi tạo biến có KDL item ->> biến đó luôn có 3 thông tin(id, name, salesPrice) 
	public int id;
	public char name;
	public double salesPrice;
	
	//Hàm khởi tạo mặc định (ko có tham số truyền vào )
	//Dùng để khởi tạo 1 đối tượng ( ô nhớ ) trên vùng nhớ heap 
	//Ô nhớ phải có đầy đủ thông tin của các thuộc tính trong class Item 
    public Item() { 
    	this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
    }
    
	public Item(int id, char name,double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	//Override lại hàm toString   
	@Override
	public String toString() {
    //This đại diện cho biến, đối tượng hiện tại đang gọi đến hàm trong Class  
      return this.id + "," +	this.name + "," +this.salesPrice ;	
	}  
	
		
		
	}
	

