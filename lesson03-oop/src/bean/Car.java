Car.javapackage bean;

public class Car {
	// mối class quản lí các thuộc tisnh của riêng nó
	//thuộc tính:nên cho access nodifier --> private
	//attributes:thuộc tính
	// khi khởi tạo một đối tượng chonclass Cả thông qua hàm khơi tạo 
	// mỗi dối 
	private String id;
	private String model;
	private String color;
	private Double salesPrice;
	//ham khoi tao rỗng
	public Car() {
	
	}
	// constructor with full parameters : hàm khởi tạo
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
