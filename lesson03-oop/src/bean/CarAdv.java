package bean;

public class CarAdv {
	// mối class quản lí các thuộc tisnh của riêng nó
		//thuộc tính:nên cho access nodifier --> private
		//attributes:thuộc tính
		// khi khởi tạo một đối tượng chonclass Cả thông qua hàm khơi tạo 
		// mỗi dối 
	/*
	 static:thuộc phạm vi của class
	 --> tất cả các đối tượg tạo ra từ class đều có chung giá trị cho thuộc tính static
	 -->lưu trữ ở 1 ô nhớ riêng
	 Vd:model
	 non-static: thuộc phạm vi của object
	 -->mỗi đối tượng sẽ quản lí thông tin riêng cho thuộc tính non-static
	 --> lưu trữ ở các ô nhớ riêng cho tuừng đoios tượng
	 Vd;id,color,...*/
	
		private String id;
		public static String model;
		private String color;
		private Double salesPrice;
		//ham khoi tao rỗng
		public CarAdv() {
		
		}
		//ko nên truyền thuộc tính static cho hàm khởii tạo
		// constructor with full parameters : hàm khởi tạo
		public CarAdv(String id,String color, Double salesPrice) {
			//this đại diện cho đối tượng
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
		//public void setModel(String model) {
			//this.model = model;
		//}
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


