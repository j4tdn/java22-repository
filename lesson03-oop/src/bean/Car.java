package bean;

public class Car {

		//Khi khởi tạo đối tượng cho class Car thông qua hàm khởi tạo 
		//Mỗi đối tượng sẽ có 1 ô nhớ để quản lý 
		
		private String id;
		private String model;
		private String color;
		private Double salesPrice;
        private double setSalesPrice;
	
    public Car() {
	   }
    public Car(String id, String model, String color,Double salesPrice) {
    	this.id = id;
    	this.model = model;
    	this.color = color;
    	this.salesPrice = salesPrice;	
    }
	
	
	/*
	 * Lấy c1.model --> get --> c1.getModel()
	 * set c1.model = 'x' --> set --> c1.setModel('x'); 
	 * 
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}
    

}
