package bean;

public class carAdv {
	/*
	 thuộc tính
	 
	 static: thuộc phạm vi của class
	 --> tất cả các đối tượng tạo ra từ class đều có chung giá trị cho
	 	thuộc tính static
	 --> lưu trữ ở 1 ô nhớ chung cho class
	 Vd: model
	 
	 non-static: thuộc phạm vi của object
	 --> mỗi đối tượng sẽ quản lý một giá trị thông tin riêng cho
	 	thuộc tính non-static
	 --> lưu trữ các ô nhớ 
	 object được tạo ra từng class
	 class có thể có nhiều object
	 
	 */
	// attributes
	private String id;
	private static String model;
	private String color;
	private Double salesPrice;

	// empty constructor
	public carAdv() {
		
	}
	
	// Constructor with full parameters
	// k nên truyền thuộc tính static cho hàm khởi tạo
	public carAdv(String id, String color, Double salesPrice) {
		
		this.id = id;
		this.color = color;
		this.salesPrice = salesPrice;
	}

	// getter, setter
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}
	// this đại diện cho đối tượng đang gọi hàm
	// c1.setModel(..)
	// this = c1
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
		return "Car [id=" + id +",model=" + model +",color=" + color +",salesPrice=" + salesPrice +"]";
	}
	
}
