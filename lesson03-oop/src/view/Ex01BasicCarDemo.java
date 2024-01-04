package view;

import bean.Car;

public class Ex01BasicCarDemo {

	public static void main(String[] args) {

		Car c1 = new Car("1","MG5","Yellow",800d);//H1
		Car c2 = new Car("2","Raize","Orange",540d);//H2
		Car c3 = new Car("3","VF8","Blue",720d);//H3
		
		//Biến: 100% nằm ở STACK 
		
		Car c4 = c2;//Ko tạo ra đối tượng mới 
		
		
		
		c2.setSalesPrice(560d);
		
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);


	}

}
