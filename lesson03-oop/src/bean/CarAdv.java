package bean;

public class CarAdv {
	
	/*
	 thuộc tính
	 
	 + static: thuộc phạm vi của class
	 --> tất cả các đối tượng tạo ra từ class đều có chung giá trị 
	 cho thuộc tính static
	 --> lưu trữ ở 1 ô nhớ riêng
	 --> lưu trữ ở 1 ô nhớ chung cho class
	 VD: model
	 
	 + non-static: thuộc phạm vi của object
	 -->mỗi đối tượng sẽ quản lí 1 giá trị thông tin riêng cho thuộc tính non-static
	 --> lưu trữ ở các ô nhớ riêng cho từng đối tọngw
	 VD: id, color, salePrice
	 
	 + object
	 * 
	 */
	
	private String id;
	public static String model;
	private String color;
	private Double salePrice;
	
	//empty constructor
	public CarAdv() {
	}
	//constructor with full parameters
	public CarAdv(String id, String color, Double salePrice) {
		this.id = id;
		this.color = color;
		this.salePrice = salePrice;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getModel() {
		return model;
	}	
	public void setModel(String model) {
		this.model=model;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salePrice=" + salePrice + "]";
	}
	
}
