
public class ex09 {

	    public static void main(String[] args) {
	        int SNT = 0;
	        int soHienTai = 2; // Bắt đầu kiểm tra từ số 2

	        while (SNT < 200) {
	            if (isPrime(soHienTai)) {
	                SNT++;
	                if (SNT == 200) {
	                    System.out.println("Số nguyên tố thứ 200 là: " + soHienTai);
	                    break;
	                }
	            }
	            soHienTai++;
	        }
	    }

	    // Phương thức kiểm tra số nguyên tố
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



