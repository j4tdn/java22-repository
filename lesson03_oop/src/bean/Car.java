package bean;

public class Car {
    
	// attributes 
	// khi khởi tạo đối tượng cho class thông qua hàm khởi tạo
      // mỗi đối tượng sẽ có 1 ô nhớ quản lý các thuộc tính riếng 
	private String id;
	private String model;
	private String color;
	private Double salesPrice;
	
    
    //empty constructor
	public Car() {
	
	}
	
     
  public Car(String string, String string2, String string3, double d) {
		// TODO Auto-generated constructor stub
	}


public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Double getSalesPrice() {
		return salesPrice;
	}


	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}
	
	
	
}
