package bean;

public class Car {
	//mỗi class quản lý các thuộc tính của riêng nó
	// thuộc tính: nên cho access modifier --> private
	// attributes
	// khi khởi tạo đối tượng cho class car thông qua hàm khởi tạo
	// mỗi đối tượng sẽ có 1 ô nhớ quản lý các thuộc tính này riêng
	private String id; 
	private String model;
	private String color;
	private Double salesPrice;
	// empty constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}
	// constructor with full parameters
	public Car(String id, String model, String color, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	//Car c1 = new Car("1", "MG5", "Yellow", 800d);
	//lấy c1.model --> get --> c1.getModel()
	//set c1.model = 'x' --> set --> c1.setModel('x')
	
	//getter,setter
	//cho phép get/set giá trị của các thuộc tính(private) trong class
	
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
