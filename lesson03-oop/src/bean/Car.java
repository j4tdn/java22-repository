package bean;

public class Car {
	// moi class quan ly cac thuoc tinh cua rieng no
	// thuoc tinh: nen cho access modifier ---> private
	
	//tribute
	//khoi tao doi tuong cho class car thong qua ham khoi tao
	// moi doi tuong se co 1 o nho quan ly cac thuoc tinh nay rieng
    private String id;
    private String model;
    private String color;
    private Double salesPrice;
    
    
    //empty constructor 
    public Car() {
		// TODO Auto-generated constructor stub
	}

    //constructor with full parameters
	public Car(String id, String model, String color, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}

	
	// cho phep get/set gia tri cac thuoc tinh( private) trong class
	 
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
