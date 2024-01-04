package bean;

public class CarAdv {
/*
 
 Thuộc tính :
    + Static : Thuộc phạm vi của class
       --> Tất cả các đối tượng tạo ra từ class đều có chung giá trị cho thuộc tính static
       --> Lưu trữ ở 1 ô nhớ chung cho class 
       VD: model 
    + Non-Static : Thuộc phạm vi của Object 
       --> Mỗi đối tượng sẽ quản lý một giá trị thông tin riêng cho thuộc tính non-static
       --> Lưu trữ ở các ô nhớ riêng cho từng đối tượng
       VD: id, color, salesPrice
        
    
 
 */
		private String id;
		public static String model; 
		private String color;
		private Double salesPrice;
	
    public CarAdv() {
	   }
    //Ko nên truyền thuộc tính static cho hàm khởi tạo 
    public CarAdv(String id, String color,Double salesPrice) {
    	this.id = id;
    	 // Model Ở riêng một vùng nhớ, khi gọi hàm khởi tạo thì chỉ có ba cái id, color,  salesprices 
    	this.color = color;
    	this.salesPrice = salesPrice;	
    }
	
	
	/*
	 * Lấy c1.model --> get --> c1.getModel()
	 * set c1.model = 'x' --> set --> c1.setModel('x'); 
	 * 
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	//This đại diện cho đối tượng đang gọi hàm 
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
