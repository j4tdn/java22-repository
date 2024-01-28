package view;

import bean.Car;

public class Ex02StaticAttributeDemo {

	public static void main(String[] args) {

		// 1 .Tạo ra 1000 mẫu xe Audi với màu sắc khác nhau
		// Tạo ra 10(demo)

		// Tạo ra kdl Car dùng để quản lí xe cho hãng Audi

		Car c01 = new Car("01", "Audi", "Yellow", 800d); // H1
		Car c02 = new Car("02", "Audi", "Red", 700d); // H2
		Car c03 = new Car("03", "Audi", "Blue", 600d); // H3
		Car c04 = new Car("04", "Audi", "Green", 800d); // H4
		Car c05 = new Car("05", "Audi", "White", 500d); // H5
		Car c0k = new Car("0k", "Audi", "Orange", 200d); // H6
		Car c10 = new Car("10", "Audi", "Violet", 800d); // H7

		System.out.println("Trước");

		System.out.println("C01--> " + c01);
		System.out.println("C05--> " + c05);

		// 2. Chuyển đổi tên hãng xe từ Audi sang MG
		System.out.println("\n--- Chuyển đổi tên hãng xe ---\n");

		c01.setModel("MG");
		c02.setModel("MG");
		c03.setModel("MG");
		c04.setModel("MG");
		c05.setModel("MG");
		c0k.setModel("MG");
		c10.setModel("MG");

		System.out.println("c01 -->" + c01);
		System.out.println("C05--> " + c05);
	}

}
