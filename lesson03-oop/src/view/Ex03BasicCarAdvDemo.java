package view;

import bean.carAdv;

public class Ex03BasicCarAdvDemo {
	/*
	 thuộc tình
	 static:
	 --> class gọi được k ? đc
	 --> object gọi được k ? ddc ()k nên - warning)
	 	Warning: lấy 1 đối tượng set giá trị nhưng mà lại ăn chung cho tất cả
	 	
	 non-static
	 --> class gọi đc k? Không (khó nào khởi tạo đối tượng thì mới có thể lấy 
	 	class gọi thì k biết đang gọi cho đối tượng nào
	 */
	public static void main(String[] args) {
	
//	carAdv.model = "Audi";	
	
	carAdv c01 = new carAdv("01", "Yellow", 100d);
	carAdv c02 = new carAdv("02", "Red", 200d);
	carAdv c03 = new carAdv("03", "Blue", 300d);
	carAdv c04 = new carAdv("04", "Green", 400d);
	carAdv c05 = new carAdv("05", "White", 500d);
	carAdv c06 = new carAdv("06", "Orange", 600d);
	carAdv c07 = new carAdv("07", "Violet", 700d);
	
	// k nên set static theo cách này
	// c01.setModel("Audi");
	
	System.out.println("C01 --> " + c01);
	System.out.println("C05 --> " + c05);
	}
}
