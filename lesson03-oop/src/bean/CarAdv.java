package bean;

public class CarAdv {
	
	/*
	 Thuộc tính
	 
	 + static: thuộc phạm vi của Class
	   --> tất cả các đội tượng tạo ra từ class đều có chung giá trị cho thuộc tính
	   	   static
	   --> lưu trữ ở 1 ô nhớ chung cho class	
	   VD: model
	   
	 + non-static: thuộc phạm vi của Object
	   --> mỗi đối tượng sẽ quản lý một giá trị thông tin riêng cho thuộc tính
	       non-static
	   --> lưu trử ở các ô nhớ riêng cho từng đối tượng
	   VD: id, color, salesPrice
	   
	 + Object được tạo ra từ Class
	 + Class có thể có nhiều Object
	 */
	private String id;
	public static String model;
	private String color;
	private Double salePrice;
	
	// empty constructor
	public CarAdv() {
	}

	// constructor with full parameters
	// ko nên truyền thuộc tính static cho hàm khởi tạo
	public CarAdv(String id, String color, Double salePrice) {
		this.id = id;
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
	
	// this đại diện cho đối tượng gọi hàm
	// c1.setModel(..)
	//this = c1	
	
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
