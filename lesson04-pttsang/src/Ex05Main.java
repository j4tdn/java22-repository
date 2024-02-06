import java.util.*;

public class Ex05Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
			System.out.print("Nhập số phần tử của mảng: ");
			int n = scanner.nextInt();

			if (n < 3 || n > 20) {
			    System.out.println("Số phần tử của mảng không hợp lệ.");
			    return;
			}

			int[] arr = new int[n];
			System.out.println("Nhập mảng số nguyên:");
			for (int i = 0; i < n; i++) {
			    arr[i] = scanner.nextInt();
			}

			bubbleSort(arr);

			System.out.println("Mảng đã được sắp xếp theo thứ tự tăng dần:");
			for (int num : arr) {
			    System.out.print(num + " ");
			}
		}
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
