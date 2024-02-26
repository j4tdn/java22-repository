package lesson05;

import java.util.HashSet;
import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi so ");
        String input = scanner.nextLine();

        int result = sumWithoutMinMax(input);

        System.out.println("Tong cac so khong lap lai tru di so lon nhat va nho nhat: " + result);

        scanner.close();
    }

    public static int sumWithoutMinMax(String input) {
        String[] numbers = input.split(",");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        return sumWithoutMinMax(arr);
    }

    public static int sumWithoutMinMax(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (!set.contains(num)) {
                set.add(num);
                sum += num;
            }
        }

        sum -= min + max;

        return sum;
    }
}
