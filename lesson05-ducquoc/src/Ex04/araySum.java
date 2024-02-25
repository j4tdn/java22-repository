package Ex04;

import java.util.Arrays;
import java.util.Scanner;

public class araySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) );
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        int newSize = n - 2; 
        int[] newArray = new int[newSize];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] != max && array[i] != min) {
                newArray[index++] = array[i];
            }
        }

        int[] uniqueArray = new int[newSize];
        int uniqueIndex = 0;

        for (int i = 0; i < newSize; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (newArray[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArray[uniqueIndex++] = newArray[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < uniqueIndex; i++) {
            sum += uniqueArray[i];
        }

        System.out.println("tổng của các phần tử trong mảng mới " + sum);

       
    }
}
