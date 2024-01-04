package bean;

public class CarAdv {
	
	/*
	thuộc tín 
		+	Static: thuộc phạm vi của class
			--> tất cả các đối tượng tạo ra từ class đều có chung giá trị
				cho thuộc tính ở static
			--> lưu ở 1 ô nhớ riêng
			vd:model
			
		+	non-static: thuộc phạm ví của object
			--> mỗi đối tượng sẽ quản lí 1 giá trị thông tin riêng cho thuộc tín non-static
			
	*/
	private String id;
	public static String model;
	private String color;
	private Double salesPrice;
	
	//hàm khởi tạo rỗng
	public CarAdv() {
	}

	
	//hàm khởi tạo full tham số
	public CarAdv(String id, String color, Double salesPrice) {
		this.id = id;
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
