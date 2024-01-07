package Bean;

public class CarAdv {
		
	/*
	 * Thuộc tính 
	 * 	Static: thuộc phạm vi của Class
	 * 		-->tất cả các đối tượng tạo ra từ class đều có chung giá trị cho thuộc tính static
	 * 		--> lưu trữ ở 1 ô nhớ riêng (chung cho class)
	 * 		VD:model
	 * 
	 * 	Non-static: thuộc phạm vi của Object
	 * 		--> mỗi đối tượng sẽ quản lý một giá trị thông tin riêng cho
	 * 			thuộc tính non-static
	 * 		-->lưu trũ ở các ô nhớ riêng cho từng đối tượng
	 * 		VD:id,color, salesPrice
	 */	
		
		private String id;	
		public static String model;
		private String color;
		private Double salesPrice;
		
		public CarAdv() {
		}
		
		//constructor with full parameters
		//không nên truyển thuộc tính static vào hàm tạo
		public CarAdv(String id, String color, Double salesPrice) {
			this.id = id;
			this.color = color;
			this.salesPrice =salesPrice;
		}
		
		
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		//this đại diện cho đối tượng đang gọi hàm
		//c1.setModel(..)
		public String getModel() {
			return model;
		}

//		public void setModel(String model) {
//			this.model = model;
//		}

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
