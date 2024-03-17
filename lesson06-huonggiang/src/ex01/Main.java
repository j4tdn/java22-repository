package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double a = 0, b = 0;

	        // Nhập hệ số a và b từ bàn phím
	        while (true) {
	            try {
	                System.out.print("Nhập hệ số a: ");
	                a = Double.parseDouble(scanner.nextLine());
	                System.out.print("Nhập hệ số b: ");
	                b = Double.parseDouble(scanner.nextLine());
	                break; // Nếu nhập liệu thành công, thoát khỏi vòng lặp
	            } catch (NumberFormatException e) {
	                System.out.println("Lỗi: Bạn đã nhập sai kiểu dữ liệu, vui lòng nhập lại.");
	            }
	        }

	        // Giải phương trình và xử lý trường hợp chia cho 0
	        if (a == 0) {
	            System.out.println("Lỗi: Không thể chia cho 0.");
	        } else {
	            double x = -b / a;
	            System.out.println("Kết quả: x = " + x);
	        }

	        scanner.close();
	    }
	}



