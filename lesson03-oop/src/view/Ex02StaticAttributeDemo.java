package view;

import bean.Car;

public class Ex02StaticAttributeDemo {
	public static void main(String[] args) {
		// Tạo ra 10(demo) mẫu xe Audi với màu sắc khác nhau
		// Tạo KDL Car dùng để quản lý xe cho hãng Audi
		
		Car c01 = new Car("01", "Audi", "Yellow", 800d);
		Car c02 = new Car("02", "Audi", "Red", 700d);
		Car c03 = new Car("03", "Audi", "Blue", 600d);
		Car c04 = new Car("04", "Audi", "Green", 800d);
		Car c05 = new Car("05", "Audi", "White", 500d);
		Car c0k = new Car("0k", "Audi", "Orange", 200d);
		Car c10 = new Car("10", "Audi", "Violet", 800d);
		
		//Tất cả các car khi tạo ra đều có model là Audi
		//Thay vì lưu trữ mỗi đối tượng(ô nhớ) quản lý 1 thông tin model riêng
		// + tổn vùng nhớ cho những giá trị trùng nhau của tất cả đối tượng ở class
		// + tất cả đối tượng mang giá trị model chung, nếu cập nhật giá trị cho model
		//   --> phải cập nhật cho tất cả, thiếu --> bug
				
		// IDEA: Nếu như thuộc tính(thông tin) nào mà là thông tin(giá trị) chung
		// cho tất cả các đối tượng được được tạo ra từ 1 class
				
		// --> nên cho thuộc tính đó là static
		// --> thuộc tính là static --> nó sẽ lưu trữ ở 1 ô nhớ riêng
	    // --> tất cả các đối tượng từ class đều dùng chung ô nhớ nay thay vì lưu riêng
				
				System.out.println("C01 --> " + c01);
				System.out.println("C05 --> " + c05);
		
		//2. Chuyển đổi tên hãng xe từ Audi sang MG
				
				c01.setModel("MG");
				// c02.setModel("MG");
				// c03.setModel("MG");
				// c04.setModel("MG");
				// c05.setModel("MG");
				// c0k.setModel("MG");
				// c10.setModel("MG");
				
				System.out.println("C01 --> " + c01);
				System.out.println("C05 --> " + c05);
				
	
	}

}
