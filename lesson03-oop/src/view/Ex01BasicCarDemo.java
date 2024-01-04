package view;

import bean.car;

public class Ex01BasicCarDemo {
	public static void main(String[] args) {
		// class Car(id, model, color, salesPrice)
		// tạo ra 3 đối tượng cho class car
		
		car c1 = new car("1", "MG5", "Yellow", 800d);
		car c2 = new car("1", "MG5", "Yellow", 800d);
		car c3 = new car("1", "MG5", "Yellow", 800d);
		
		// cập nhập thông tin
		c2.setSalesPrice(500d);
				
		// lấy thông tin 
		System.out.println("C3 Model --> " + c3.getModel());
		
		System.out.println("c1 --> " + c1);
		System.out.println("c1 --> " + c2);
		System.out.println("c1 --> " + c3);
			
		}
	
}
