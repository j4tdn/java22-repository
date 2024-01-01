package bean;

public class Car {
	
	private String id;
	private String model;
	private String Colorl;
	private Double salesPrice;
	
	public Car() {
	}

	public Car(String id, String model, String colorl, Double salesPrice) {
		this.id = id;
		this.model = model;
		Colorl = colorl;
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

	public void setModel(String model) {
		this.model = model;
	}

	public String getColorl() {
		return Colorl;
	}

	public void setColorl(String colorl) {
		Colorl = colorl;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", Colorl=" + Colorl + ", salesPrice=" + salesPrice + "]";
	}
	
	
	
	
	

}
