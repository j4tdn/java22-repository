package bin;

public class CarAdv {
	
	/*
	 * thuoc tinh 
	 * static: thuoc pham vi cua class
	 * --> tat ca cac doi tuong tao ra tu class deu co chung gia tri 
	 * thuoc tinh static 
	 * --> luu tru o 1 o nho rieng
	 * VD: model
	 * 
	 * non-static: thuoc vi cua object
	 * --> moi doi tuong se quan ly 1 gia tri thong tin rieng cho thuoc tinh non -static
	 * --> luu tru o cac o nho rieng cho tung doi tuong
	 * VD: id, color, salesPrice
	 * object duoc tao ra tung class
	 * class co the co nhieu object
	 */
	public String id; 
	private static String model;
	public String color;
	private static String salesPrice;
	
	//empty constructor 
	public CarAdv() {
		
	}
	
	//constructur with full parameters
	public CarAdv(String id, String model, String color, double salesPrice) {
		
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	//car c1 = new car(
	//lay c1.model --> get --> c1.getModel()
	//set c1.model = 'x' --> set --> c1.setModel('x');
	
	//getter
	// setter
	// cho phep lay/truyen gia tri cua cac thuoc tinh(private) trong class
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

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	@Override
	public String toString() {
		return "car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}
}

