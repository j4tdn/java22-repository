package bean;

public class Car {
	
	// mỗi class quản lý thuộc tính riêng của nó
	// thuộc tính: nên cho access modifier --> private
		
	// attributes: thuộc tính
	// khi khởi tạo đối tượng cho class Car thông qua hàm khởi tạo
	// mỗi đối tượng sẽ có 1 ô nhớ quản lý các thuộc tiếng này riêng
	private String id;
	private String model;
	private String color;
	private Double salePrice;
	
	// empty construtor
	public Car() {
	}

	// constructor with full parameters
	public Car(String id, String model, String color, Double salePrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salePrice = salePrice;
	}
	
	// Car c1 = new Car("1", "VF8", "Blue", 720d)
	// lấy c1.model --> get --> c1.getModel()
	// set c1.model = 'x' --> set --> c1.setModel('x')
	
	//getter, setter
	// cho phép get/set giá trị của các thuộc tính (private) trong class

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

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salePrice=" + salePrice + "]";
	}

}
