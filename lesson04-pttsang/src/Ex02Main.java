import java.util.*;

public class Ex02Main {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số phần tử của dãy: ");
			int n = scanner.nextInt();

			int[] arr = new int[n];
			System.out.println("Nhập dãy số nguyên ngẫu nhiên:");
			for (int i = 0; i < n; i++) {
			    arr[i] = scanner.nextInt();
			}

			
			Arrays.sort(arr);

			List<Integer> multiplesOf7 = new ArrayList<>();
			List<Integer> multiplesOf5 = new ArrayList<>();
			List<Integer> others = new ArrayList<>();

		
			for (int num : arr) {
			    if (num % 7 == 0 && num % 5 != 0) {
			        multiplesOf7.add(num);
			    } else if (num % 5 == 0 && num % 7 != 0) {
			        multiplesOf5.add(num);
			    } else {
			        others.add(num);
			    }
			}

			
			System.out.println("Dãy số được sắp xếp theo yêu cầu là:");
			for (int num : multiplesOf7) {
			    System.out.print(num + " ");
			}
			for (int num : others) {
			    System.out.print(num + " ");
			}
			for (int num : multiplesOf5) {
			    System.out.print(num + " ");
			}
		}
    }
}
