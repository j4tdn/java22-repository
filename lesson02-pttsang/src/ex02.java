
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int count = 0;
	        int n = 0;

	        while (count < 5) {
	            System.out.print("Nhập số nguyên N: ");
	            if (scanner.hasNextInt()) {
	                n = scanner.nextInt();
	                if (n > 0 && isPowerOfTwo(n)) {
	                    System.out.println("N là lũy thừa của 2: true");
	                } else {
	                    System.out.println("N không phải là lũy thừa của 2 hoặc không hợp lệ.");
	                }
	                break;
	            } else {
	                System.out.println("N không hợp lệ. Vui lòng nhập lại.");
	                scanner.next(); // Xóa bỏ input không hợp lệ
	                count++;
	            }
	        }

	        if (count == 5) {
	            System.out.println("Bạn đã nhập sai " + count + " lần. Kết thúc chương trình.");
	        }
	        scanner.close();
	    }

	    public static boolean isPowerOfTwo(int n) {
	        return (n > 0) && ((n & (n - 1)) == 0);
	    
	}

}
