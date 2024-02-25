package src.bai4;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // tạo mảng
        int[] array = new int[n];

        // Nhập phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out
                .println("tổng các phần tử không trùng nhau trong mảng ngoại trừ phần tử lớn nhất và phần tử nhỏ nhất: "
                        + sum(array));
    }

    public static int sum(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }

        // Sắp xếp mảng
        Arrays.sort(arr);

        // Loại bỏ phần tử lớn nhất và nhỏ nhất vad chỉ lấy phần tử trùng nhau 1 lần
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1]) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
