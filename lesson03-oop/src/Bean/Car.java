package Bean;

public class Car {
	
	//atributes
	//khi khởi tạo đối tượng cho class Car
	//mỗi đối tượng sẽ có 1 ô nhớ quản lý các thuộc tính riêng
	private String id;	
	private String model;
	private String color;
	private Double salesPrice;
	
	public Car() {
	}
	
	//constructor with full parameters
	public Car(String id, String model, String color, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice =salesPrice;
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
