package view;

import bean.Car;

public class Ex02StaticAttributeDemo {

		public static void main(String[] args) {
			// tạo 100 mẫu xe màu sắc khác nhau
			//demo 10 mãu
			
			Car c1 = new Car("1", "Audi", "Yellow", 800d); // H1
			Car c2 = new Car("2", "Audi", "Red", 700d); // H2
			Car c3 = new Car("3", "Audi", "Blue", 600d); // H3
			Car c4 = new Car("4", "Audi", "Green", 800d); // H3
			Car c5 = new Car("5", "Audi", "While", 500d); // H3
			Car c0k = new Car("0k", "Audi", "Orange", 200d); // H3
			Car c10 = new Car("10", "Audi", "Violet", 800d); // H3
			
			
			//tất cả cả khi mik tạo ra đều có model là Audi 
			// nên khi chuyển đổi tên hãng xe sẽ phải chuyển hết và lần lượt
		}
	
}
