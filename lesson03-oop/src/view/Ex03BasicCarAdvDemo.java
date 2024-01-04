package view;

import bean.CarAdv;

public class Ex03BasicCarAdvDemo {

	public static void main(String[] args) {
		/*
		 *  Thuộc tính
		 *  +Static : --> Class gọi được không ? ĐƯỢC --> Object gọi được
		 * nhưng ko nên : WARNING : lấy 1 nhưng lại set tất cả các đối tượng 
		 * +Non-Static
		 * : --> Class gọi được không? KHÔNG (Khi khởi tạo đối tượng thì mới có nội dung lấy class gọi thì không biết đang gọi
		 *        cho đối tượng nào 
		 *   --> Object gọi được ko > ĐƯỢC 
		 */
		
		//Tạo ra 10 ( demo ) 
		//Tạo ra KDL CAR để quản lý xe hơi hãng Audi 
		
       CarAdv.model = "Audi";
		
		CarAdv c01 = new CarAdv("01","Yellow",800d);//H1
		CarAdv c02 = new CarAdv("02","Red",100d);//H2
		CarAdv c03 = new CarAdv("03","Blue",300d);//H3
		CarAdv c04 = new CarAdv("04","Green",800d);//H4
		CarAdv c05 = new CarAdv("05","White",800d);//H5
		CarAdv c0k = new CarAdv("0k","Orange",800d);//H6
		CarAdv c10 = new CarAdv("10","Violet",800d);//H7
		System.out.println("c01 --> " + c01);
		System.out.println("c05 --> " + c05);

		
		//Chuyển đổi tên hãng xe từ AUDI sang MG
		CarAdv.model = "MG";
		
		System.out.println("c01 --> " + c01);
		System.out.println("c05 --> " + c05);
	}

}
