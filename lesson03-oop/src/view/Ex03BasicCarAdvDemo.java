package view;

import bean.CarAdv;

public class Ex03BasicCarAdvDemo {
	public static void main(String[] args) {
		/*
		 Thuộc tính 
		 +static gọi được
		 +object gọi được(không nên -warning)
		 Warning: lấy một đối tượng set gias trị nhưng mà lại ăn chung cho tất cả
		 non-static--> ko gọi được(vì khi nào khởi tạo đoois tượng thì mới có thông tin cho thuộc tín static 
		 +lấy class gọi thì ko biết gọi cho đối tuoựng nào
		 +lấy object gọi được*/
		// tao ra 100 mau xe Audi vs cac mau sac khac nhau
		//thuộc tidnh static ăn chung cho tất cả đối tượng
		//hàm khởi tạo ko nên truyền giá trị cho tt dtatic
		CarAdv.model="Audi";
		CarAdv c01= new CarAdv("01",  "Yellow", 800d);//H1
		CarAdv c02= new CarAdv("02", "Red", 700d);//H2
		CarAdv c03= new CarAdv("03", "Blue", 600d);//H3
		CarAdv c04= new CarAdv("04", "Green", 800d);//H4
		CarAdv c05= new CarAdv("05", "White", 500d);//H5
		CarAdv c0k= new CarAdv("0k", "Orange", 200d);//H6
		CarAdv c10= new CarAdv("10", "Violet", 800d);//H7
		// chuyen doi ten hang xe tu Audi sang MG
		CarAdv.model="MG";
		
		
	}

}
