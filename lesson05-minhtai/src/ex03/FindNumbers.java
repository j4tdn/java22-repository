package ex03;

import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

       
        if (size < 2 || size > 20) {
            System.out.println("Vui lòng nhập kích thước từ 2 đến 20 :");
            return;
        }

     
        int[] arr = new int[size];
        System.out.println("Nhập  " + size + "Cho mảng:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Bội chung nhỏ nhất của các phần tử trong mảng là: " + getLeastCommonMultiple(arr));

        scanner.close();
        
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int getLeastCommonMultiple(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }
}
