package bean;

public class Car {
	
	//atributes
	//khởi tạo đối tượng cho class Cả thông qua hàm khởi tạo 
	//mỗi đối tượng sẽ có 1 ô nhớ quản lí các thuộc tín
	private String id;
	private String model;
	private String color;
	private Double salesPrice;
	
	//hàm khởi tạo rỗng
	public Car() {
	}

	
	//hàm khởi tạo full tham số
	public Car(String id, String model, String color, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}

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
