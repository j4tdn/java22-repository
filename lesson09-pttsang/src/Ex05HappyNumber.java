import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex05HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        
        return n == 1;
    }
    
    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần kiểm tra: ");
        int numberToCheck = scanner.nextInt();

        if (isHappy(numberToCheck)) {
            System.out.println(numberToCheck + " là số hạnh phúc.");
        } else {
            System.out.println(numberToCheck + " không là số hạnh phúc.");
        }

        scanner.close();
    }
}
