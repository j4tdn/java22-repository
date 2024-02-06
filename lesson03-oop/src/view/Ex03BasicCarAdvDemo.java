package view;

import bean.CarAdv;

public class Ex03BasicCarAdvDemo {
	/*
	 thuộc tính
	 
	 +static:
	 --> class gọi được không ? được
	 --> object gọi đuọc không? được (khôn nên - warning)
	     warning: lấy 1 đói tượng set giá trị nhưng lại ăn cho tát cả
	     
	 +non-static: khi có đối tượng thì mơis có giá trị cho thuộc tính nớ, khi có class thì chưa có đối tượng, nên phải new ra đối tượng thì mới gọi dc 
	 --> class gọi đuoc không? không(khi nào khởi tạo đối tượng thì mới có thông tin cho thuôcj tính non-static
	                                 lấy class gọi thì không biết đang gọi cho đối tượng nào)
	 -->object gọi được không ? được    
	 */
	
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
