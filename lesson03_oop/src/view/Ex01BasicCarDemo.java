package view;


import bean.Car;

public class Ex01BasicCarDemo {
	
     public static void main(String[] args) {
	// class Car (id ,odekl, 
    	 
    	 // tạo ra 3 cái đối tượng cho dũe liệu class car 
    	 Car c1 = new Car("1", "MG5", "Yellow", 800d);
    	 Car c2 = new Car("2", "Raize", "Yellow", 540d);
    	 Car c3 = new Car("3", "Vf8", "Yellow", 720d);
    
    	 
         System.out.println("c1 --> " + c1);
          System.out.println("c2 --> " + c2);
          System.out.println("c3 --> " + c3);
     
     }  
}
