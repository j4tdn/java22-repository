package view;

import bin.car;

public class Ex01BasicCarDemo {
	public static void main(String[] args) {
		// class Car(id, model, color, salesPrice)
		
		//tao ra 3 doi tuong cho class Car
		
		//new .. chinh la doi tuong 
		
		car c1 = new car("1", "MG5", "Yellow", 800);//h1
		car c2 = new car("2", "Raize", "Orange", 540);//h1
		car c3 = new car("3", "VF8", "Blue", 720);//h1
	
	
	// cap nhat thong tin
	
	c2.salesPrice = 560d;
	
	//lay thong tin 
	
	System.out.println("c3 Model --> " + c3.model);
	
	System.out.println("c1 --> " + c1);
	System.out.println("c2 --> " + c2);
	System.out.println("c3 --> " + c3);
	
	}

}
