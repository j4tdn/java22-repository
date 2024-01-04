package bean;

public class CarAdv {
	/*
	 thuộc tính
	 +static: thuộc phạm vi class
	  --> tất cả các đối tượng tạo ra từ class đêì có chung giá trị cho thuộc tính static
	  --> lưu trữ ở 1 ô nhớ riêng cho class
	  VD: model
	 +non - static: thuộc vi của object
	 --> mỗi đối tượng sẽ quản lý một giá trị thông tin riêng cho thuộc tính non-static
	 --> lưu trữ ở các ô nhớ riêng của object
	 VD: color,id,salesPrice
	 object dc tạo ra từ class
	 class có thể có nhiều object
	 */
	private String id; 
	public static String model;
	private String color;
	private Double salesPrice;
	// empty constructor
	public CarAdv() {
		// TODO Auto-generated constructor stub
	}
	// constructor with full parameters
	//ko nên truyền thuộc tính static cho hàm khởi tạo
	public CarAdv(String id, String color, Double salesPrice) {
		this.id = id;
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
	//this là đại diện cho đối tượng đang gọi hàm
//	public void setModel(String model) {
//		this.model = model;
//	}
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
