import java.util.Scanner;

public class Ex03Test {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số hàng và số cột của ma trận
	        System.out.print("Nhập số hàng của ma trận: ");
	        int rows = scanner.nextInt();
	        System.out.print("Nhập số cột của ma trận: ");
	        int cols = scanner.nextInt();

	        // Khởi tạo và nhập giá trị cho ma trận
	        int[][] matrix = new int[rows][cols];
	        System.out.println("Nhập các phần tử của ma trận:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Kiểm tra và in ra các phần tử yên ngựa
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                int currentElement = matrix[i][j];
	                boolean isSaddlePoint = true;

	                // Kiểm tra xem currentElement có phải là phần tử yên ngựa không
	                for (int k = 0; k < cols; k++) {
	                    if (currentElement > matrix[i][k]) {
	                        isSaddlePoint = false;
	                        break;
	                    }
	                }

	                if (isSaddlePoint) {
	                    for (int k = 0; k < rows; k++) {
	                        if (currentElement < matrix[k][j]) {
	                            isSaddlePoint = false;
	                            break;
	                        }
	                    }
	                }

	                // Nếu currentElement là phần tử yên ngựa thì in ra vị trí của nó
	                if (isSaddlePoint) {
	                    System.out.println("Phần tử yên ngựa: A" + i + j);
	                }
	            }
	        }
	    }
	}


