package view;

import Bean.Car;

public class Ex02StaticAtributeDemo {
	public static void main (String[] args) {
		//1.tao ra 100 mau xe Audi voi mau sac khac nhau
		//tao 10demo
		
		//Tao ra KDL Car dung de quan ly xe cho hang Audi
		Car c01 = new Car("01","Audi","Yellow",800d);
		Car c02 = new Car("02","Audi","red",700d);
		Car c03 = new Car("03","Audi","blue",600d);
		Car c04 = new Car("04","Audi","green",800d);
		Car c05 = new Car("05","Audi","white",500d);
		Car c0k = new Car("0k","Audi","orange",200d);
		Car c10 = new Car("10","Audi","violet",800d);
		
		//tat ca cac Car khi minh tao ra deu co model =Audi
		
		// nếu thuộc tính tương tự nhau trong 1 class nên để ở dạng 
		//static cho dễ set cho nhiều đối tượng
		System.out.println("c1 -->" +c01);
		
		//2. Chuyen doi ten hang xe tu Audi sang MG
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
	}
}
