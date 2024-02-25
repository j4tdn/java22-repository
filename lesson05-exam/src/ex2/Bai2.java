package ex2;

public class Bai2 {
	public static void main(String[] args) {
		int n = 10;
		int[] A1 = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("Phần tử tìm có giá trị:" + getMissingNumber(n, A1));
	}
	public static int getMissingNumber(int n, int[] A) {
		int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : A) {
            arraySum += num;
        }
        return totalSum - arraySum;
	}
}
