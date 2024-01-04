package view;

import bean.CarAdv;

public class Ex03BasicCarAdvDemo {
	public static void main(String[] args) {
		/*
		 +static :
		   --> class gọi được không? Được
		   --> object gọi được không? Được (ko nên -WARNING)
		       WARNING: lấy 1 đối tượng set giá trị nhưng lại ăn chung giá trị cho tất cả
		   
		   non-static
		     --> class gọi được không? Không(khi nào khởi tạo đối tượng thì mới có thông tin
		        lấy class gọi thì ko biết đang gọi cho đối tượng nào
		     --> object gọi đc ko? Được
		 */
		// Tạo ra 10(demo) mẫu xe Audi với màu sắc khác nhau
		// Tạo KDL CarAdv dùng để quản lý xe cho hãng Audi
		//model(Audi)
		//thuộc tính static ăn chung cho tất cả đối tượng
		//hàm khởi tạo ko nên truyền giá trị cho tt static
		
		CarAdv.model = "Audi";
		
		CarAdv c01 = new CarAdv("01", "Yellow", 800d);
		CarAdv c02 = new CarAdv("02", "Red", 700d);
		CarAdv c03 = new CarAdv("03", "Blue", 600d);
		CarAdv c04 = new CarAdv("04", "Green", 800d);
		CarAdv c05 = new CarAdv("05", "White", 500d);
		CarAdv c0k = new CarAdv("0k", "Orange", 200d);
		CarAdv c10 = new CarAdv("10", "Violet", 800d);
		
		//ko nên set static theo cách: c01.setModel(Audi);
		System.out.println("C01 --> " + c01);
		System.out.println("C05 --> " +c05);
		//Tất cả các CarAdv khi tạo ra đều có model là Audi
		//Thay vì lưu trữ mỗi đối tượng(ô nhớ) quản lý
		
		//2. Chuyển đổi tên hãng xe từ Audi sang MG
		System.out.println("\n --- Chuyển đổi tên hãng xe ---\n");
		
		CarAdv.model = "MG";
		// cập nhật cho tất cả các đối tượng, nhìn code dễ hiểu nhầm chỉ cập nhật
		// cho c04
		// c04.setModel("MG");
		System.out.println("C01 --> " + c01);
		System.out.println("C05 --> " +c05);
	
	}

}
