package view;

import bean.Car;

public class Ex01BasicCarDemo {
    public static void main(String[] args) {
		//class Car(id, model, color, salesPrice)
    	//tạo 3 đối tượng cho class Car
    	Car c1 = new Car("1", "MG5", "Yellow", 800d);//h1
    	Car c2 = new Car("2", "Raize", "Orange", 540d);//h2
    	Car c3 = new Car("3", "VF8", "Blue", 720d);//h3
    	
    	c2.setSalesPrice(52220d);
    	
    	System.out.println("C3 Model --> " + c3.getModel());
    	
    	System.out.println(c1);
    	System.out.println(c2);
    	System.out.println(c3);
    }
}
