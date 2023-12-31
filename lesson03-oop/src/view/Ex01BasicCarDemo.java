package view;

import bean.Car;

public class Ex01BasicCarDemo {
	
	public static void main(String[] args) {
		// class Car(id,model,salesPrice)
		
		// tạo ra 3 đối tượng cho class Car
		Car c1 = new Car("1", "MG5", "Yellow", 800d); // H1
		Car c2 = new Car("2", "Raize", "Orange", 540d); // H2
		Car c3 = new Car("3", "VF8", "Blue", 720d); // H3
		
		//cập nhật thông tin
		c2.setSalesPrice(560d); 
		
		// lấy ra thông 
		System.out.println("c3 Model --> "+ c3.getModel());
		
		System.out.println("c1 --> "+ c1);
		System.out.println("c2 --> "+ c2);
		System.out.println("c3 --> "+ c3);
	}
	
}
