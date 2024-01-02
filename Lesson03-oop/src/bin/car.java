package bin;

public class car {
	
	// moi class quan ly cac thuoc tinh cua rieng no
	// thuoc tinh: nen cho access modifier --> private
	
	//bien toan cuc(attributes)
	// khi khoi tao doi tuong cho class Car thong qua ham khoi tao
	// moi doi tuong se co 1 o nho quan ly cac thuoc tinh nay rieng
	public String id; 
	public String model;
	public String color;
	public double salesPrice;
	
	//empty constructor 
	public car() {
		
	}
	
	//constructur with full parameters
	public car(String id, String model, String color, double salesPrice) {
		
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

