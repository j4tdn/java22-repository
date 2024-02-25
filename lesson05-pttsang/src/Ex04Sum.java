import java.util.Scanner;
import java.util.Arrays;

public class Ex04Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int result = sum(arr);
        System.out.println("Tổng các phần tử không trùng nhau trong mảng (loại bỏ phần tử lớn nhất và nhỏ nhất): " + result);
    }

    
    public static int sum(int[] arr) {
        if (arr.length <= 2) {
            return 0;
        }
        
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
