package Ex04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hai số tự nhiên N và M:");
        long N = sc.nextLong();
        long M = sc.nextLong();

        // Kiểm tra xem N và M có nguyên tố tương đương hay không
        if (areEquivalentPrimes(N, M)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Hàm kiểm tra hai số có nguyên tố tương đương hay không
    public static boolean areEquivalentPrimes(long N, long M) {
        // Tìm tất cả các ước số nguyên tố của N và M
        long gcd = gcd(N, M);

        // Nếu gcd của N và M là 1, tức là chúng không có ước số nguyên tố chung, trả về false
        return gcd == 1;
    }

    // Hàm tính ước số chung lớn nhất của hai số
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
