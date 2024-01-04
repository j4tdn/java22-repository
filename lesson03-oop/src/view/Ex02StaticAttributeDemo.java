package view;

import bean.Car;

public class Ex02StaticAttributeDemo {
	public static void main(String[] args) {
		//tạo ra kdl Car
		Car c01 = new Car("1", "Audi", "Yellow", 800d);//h1
		Car c02 = new Car("2", "Audi", "Red", 700d);//h1
		Car c03 = new Car("3", "Audi", "Blue", 600d);//h1
		Car c04 = new Car("4", "Audi", "Green", 800d);//h1
		Car c05 = new Car("5", "Audi", "White", 500d);//h1
		Car c0k = new Car("0k", "Audi", "Orange", 200d);//h1
		Car c10 = new Car("10", "Audi", "Violet", 800d);//h1
		
		
		
		System.out.println("Đổi tên hãng xe\n");
		
		c01.setModel("MG");
		System.out.println(c01);
		System.out.println(c05);
	}
}
