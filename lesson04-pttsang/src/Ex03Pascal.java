import java.util.*;

public class Ex03Pascal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số hàng của tam giác Pascal: ");
			int n = scanner.nextInt();

	
			int[][] pascalTriangle = new int[n][n];

			
			for (int i = 0; i < n; i++) {
			    for (int j = 0; j <= i; j++) {
			        if (j == 0 || j == i) {
			            
			            pascalTriangle[i][j] = 1;
			        } else {
			            
			            pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
			        }
			    }
			}

			System.out.println("Tam giác Pascal:");
			for (int i = 0; i < n; i++) {
			    for (int j = 0; j <= i; j++) {
			        System.out.print(pascalTriangle[i][j] + " ");
			    }
			    System.out.println();
			}
		}
    }
}

