
import java.util.Scanner;
public class ex01 {
	
	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int count = 0;
		        int n = 0;
		        
		        while (count < 5) {
		            System.out.print("Nhap so nguyên N: ");
		            if (scanner.hasNextInt()) {
		                n = scanner.nextInt();
		                if (n > 0) {
		                    boolean isMultipleOfTwo = isMultipleOfTwo(n);
		                    System.out.println("N là bội của 2: " + isMultipleOfTwo);
		                    break;
		                } else {
		                    System.out.println("N phải là số nguyên dương.");
		                }
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

		    public static boolean isMultipleOfTwo(int n) {
		        return n % 2 == 0;
		    }
	
	}

