package baitap;

public class bai9TimSoNguyenToThu200 {
	public static void main(String[] args) {
		int primeCount = 0; // Đếm số lượng số nguyên tố đã tìm được
        int number = 2; // Bắt đầu từ số nguyên tố đầu tiên

        while (primeCount < 200) {
            if (isPrime(number)) {
                primeCount++;
            }
            number++;
        }

        System.out.println("Số nguyên tố thứ 200 là: " + (number - 1));
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
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
