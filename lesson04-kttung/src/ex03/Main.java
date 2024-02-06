package ex03;

public class Main {
	public static void main(String[] args) {
        int n = 5; 
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
