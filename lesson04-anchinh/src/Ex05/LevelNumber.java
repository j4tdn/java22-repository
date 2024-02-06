package Ex05;

import java.util.Scanner;

public class LevelNumber {
	
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = Integer.parseInt(ip.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ip.nextLine());
        }

        // Tìm level của từng phần tử trong mảng
        int[] levels = new int[n];
        for (int i = 0; i < n; i++) {
            levels[i] = findLevel(arr[i]);
        }

        // Sắp xếp mảng theo level tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (levels[i] > levels[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    temp = levels[i];
                    levels[i] = levels[j];
                    levels[j] = temp;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp theo level tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int findLevel(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count;
    }
}