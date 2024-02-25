package ex02;

import java.util.Scanner;

/*	
		 Cho mảng A gồm n-1 phần tử không trùng nhau, giá trị của mỗi phần
		tử trong mảng, Ak = [1, n].
		Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
		 VD1: n = 6, Ak = [3, 2, 1, 6, 5]
		 Phần tử cần tìm có giá trị: 4
		 VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
		 Phần tử cần tìm có giá trị: 8
		Method signature: int getMissingNumber(...)
 */
public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Nhập số lượng phần tử: ");
	    int n = sc.nextInt();
	   
	    int[] A = new int[n - 1];
	    for (int i = 0; i < n - 1; i++) {
	      System.out.printf("Nhập phần tử thứ %d: ", i + 1);
	      A[i] = sc.nextInt();
	    }

	    // Tìm số nguyên còn lại
	    int missingNumber = getMissingNumber(A);

	    System.out.println("Số nguyên còn lại là: " + missingNumber);
	}
	public static int getMissingNumber(int[] A) {
		  int n = A.length + 1;
		  int[] count = new int[n + 2];
		  for (int x : A) {
		    count[x]++;
		  }
		  for (int i = 1; i < n; i++) {
		    if (count[i] == 0) {
		      return i;
		    }
		  }
		  return -1; // Không tìm thấy số nguyên còn lại
		}
}
