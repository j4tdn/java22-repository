package bean;

public class Car {
	
	//mỗi class quản lí các thuộc tính của riêng nó
	//--> access modifer --> private
	
	//attributes
	//khi khởi tạo đối tượng cho class Car thông qua hàm khởi tạo
	//mỗi đối tượng sẽ có 1 ô nhớ quản lí các thuộc tính này riêng
	
	public String id;
	public String model;
	public String color;
	public Double salePrice;
	
	//empty constructor
	public Car() {
	}
	//constructor with full parameters
	public Car(String id, String model, String color, Double salePrice) {
		this.id = id;
		this.model = model;
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
