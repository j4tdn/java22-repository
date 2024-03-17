package Ex02;

public class App {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan","Future Neo", 100 , 35000000);
		Vehicle v2 = new Vehicle("Lê Minh Tính","Ford Ranger", 3000 , 250000000);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết","Landscape", 1500 , 1000000000);
        System.out.printf("%-20s %-15s %-15s %-15s %-15s%n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("================================================================================");
        System.out.println(v1 + " " + String.format("%.2f", v1.tax()));
        System.out.println(v2 + " " + String.format("%.2f", v2.tax()));
        System.out.println(v3 + " " + String.format("%.2f", v3.tax()));

//		System.out.println(String.format("%.2f", v1.tax()));
//		System.out.println(String.format("%.2f", v2.tax()));
//		System.out.println(String.format("%.2f", v3.tax()));



	}

}
