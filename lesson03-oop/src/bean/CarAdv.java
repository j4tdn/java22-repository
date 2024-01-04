package bean;

public class CarAdv {
	
	private String id;
	public static String model;
	private String Colorl;
	private Double salesPrice;
	
	public CarAdv() {
	}

	public CarAdv(String id, String colorl, Double salesPrice) {
		this.id = id;
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

//	public void setModel(String model) {
//		this.model = model;
//	}

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
