package bean;

public class CarAdv {
	/*
	 Thuộc tính
	 static: Thuộc phạm vi của classs
	 --> tất cả các đối tuộng tạo ra từ classs dều có chung giá trị cho thuộc tinh static
	 --> lưu trữ 1 ô nhớ chung cho class
	 VD:medel
	 non-static:thuộc phạm vi của ọect
	 ..> Mỗi đối tượng 
	 + object được tạo ra từng classs
	 + class có thể có nhiều object
	 */
	// attributes
	private String id;
	private static String model;
	private String color;
	private Double salesPrice;

	// empty constructor
	public  CarAdv() {
		
	}
	
	// Constructor with full parameters
	// k nên truyền thuộc tính staticc cho hàm khởi tạo
	public  CarAdv(String id, String color, Double salesPrice) {
		
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
	// thí đại diện cho đối tượng đang gọi hàm
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
