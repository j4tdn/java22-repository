import java.util.Scanner;

public class ex05 {
	 public static boolean isSymmetric(int number) {
	        String strNum = String.valueOf(number);
	        int length = strNum.length();
	        
	        for (int i = 0; i < length / 2; i++) {
	            if (strNum.charAt(i) != strNum.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int N;
	        
	        do {
	            System.out.print("Nhập số nguyên dương có tối thiểu 2 chữ số: ");
	            N = scanner.nextInt();
	            
	            if (String.valueOf(N).length() < 2) {
	                System.out.println("Lỗi! Yêu cầu nhập lại số có ít nhất 2 chữ số.");
	            } else if (!isSymmetric(N)) {
	                System.out.println("Số " + N + " không phải là số đối xứng.");
	            } else {
	                System.out.println("Số " + N + " là số đối xứng.");
	                break;
	            }
	        } while (true);
	        
	        scanner.close();
	}

}
