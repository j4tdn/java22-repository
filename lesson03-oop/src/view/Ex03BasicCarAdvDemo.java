package view;

import bean.CarAdv;

public class Ex03BasicCarAdvDemo {
	
	public static void main(String[] args) {
		CarAdv.model = "audi";
		
		CarAdv c01 = new CarAdv("01", "yellow", 800d);
		CarAdv c02 = new CarAdv("02", "red", 700d);
		CarAdv c03 = new CarAdv("03", "blue", 600d);
		CarAdv c04 = new CarAdv("04", "green", 800d);
		CarAdv c05 = new CarAdv("05", "white", 500d);
		CarAdv c0k = new CarAdv("0k", "orange", 200d);
		CarAdv c10 = new CarAdv("10", "violet", 800d);
		
		CarAdv.model = "mg";
	}

}
