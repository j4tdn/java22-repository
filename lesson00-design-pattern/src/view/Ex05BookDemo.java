package view;

import java.math.BigDecimal;

import bean.TextBook;

public class Ex05BookDemo {

	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("SGK-T1", bd("15"), "Nhi Đồng", false);
		
		
	}
	
	public static BigDecimal bd(String val) {
		return new BigDecimal(val);
	}
}
