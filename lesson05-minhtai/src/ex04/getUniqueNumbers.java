package ex04;

import java.util.Scanner;

public class getUniqueNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        int[] uniqueNumbers = getUniqueNumbers(a);

        int count = 0;

        for (int number : uniqueNumbers) {
            if (number != 0) {
                count++;
                System.out.print(number + " ");
            }
        }

        System.out.println("\nSố lượng phần tử khác 0: " + count);
    }

    public static int[] getUniqueNumbers(int[] a) {
        // Tạo mảng count để lưu trữ số lần xuất hiện của mỗi phần tử
        int[] count = new int[101];

        // Duyệt qua mảng A và tăng số lần xuất hiện của mỗi phần tử
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        // Tạo mảng result lưu trữ kết quả
        int[] result = new int[a.length];
        int index = 0;

        // Duyệt qua mảng A và thêm các phần tử chỉ xuất hiện một lần vào mảng result
        for (int i = 0; i < a.length; i++) {
            if (count[a[i]] == 1) {
                result[index++] = a[i];
            }
        }

        // Dùng Arrays.sort để trả về két quả tăng dần
        java.util.Arrays.sort(result);
        
        return result;
    }
}
