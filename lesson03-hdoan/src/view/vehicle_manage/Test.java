package view.vehicle_manage;

public class Test {
	
	public static void main(String[] args) {
		Vehicle x1 = new Vehicle("Nguyễn Thu Loan", "Future Neo ",  100, 35000000);
		Vehicle x2 = new Vehicle("Lê Minh Tính   ", "Ford Ranger", 3000, 250000000);
		Vehicle x3 = new Vehicle("Nguyễn Thu Loan", "Future Neo ", 1500, 1000000000);
		System.out.println("Tên chủ xe"+"            "+"Loại xe"+"           "+"Dung tích"+
							 "    "+"Trị giá"+"        "+"Thuế phải nộp");
		System.out.println("===============================================================================");
		System.out.println(x1.toString()+"             "+x1.calTax());
		System.out.println(x2.toString()+"             "+x2.calTax());
		System.out.println(x3.toString()+"             "+x3.calTax());
	}
	
}
