package lesson03;


public class PrintPascalTriangle {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("=========Pascal=========");
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + calElement(j, i));
			}
			System.out.println();
		}
	}
	
	private static int calElement(int k, int n) {
		if (k == 0 || k == n ) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return calElement(k - 1, n - 1) + calElement(k, n - 1);
	}

}
