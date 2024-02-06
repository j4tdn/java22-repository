package Ex02;

import java.util.Scanner;

public class DividedOrganize {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n;
	int index = 0;
	do {
	System.out.print("Nhập tổng chữ số ( 5<= n <=100 ) = ");
    n = scanner.nextInt();
	}while(n<5 || n>100);
	int number[] = new int[n];
	for( int i = 0; i<=n-1 ; i++) {
		System.out.print("Nhập số thứ " +(i+1)+" =");
		number[i] = scanner.nextInt();
	}
	int[] rs1 = numberDividedseven(number);
    int[] rs2 = othersNumber(number);
    int[] rs3 = numberDividedfive(number);
    
    int rsLength = rs1.length + rs2.length + rs3.length;
    int rs[] = new int[rsLength];
    
    for (int x : rs1) {
        rs[index++] = x;
    }
    for (int x : rs2) {
        rs[index++] = x;
    }
    for (int x : rs3) {
        rs[index++] = x;
    }
    
    for (int i = 0; i < rs.length; i++) {
        if (i == rs.length - 1) {
            System.out.print(rs[i]);
        } else {
            System.out.print(rs[i] + ",");
        }
    }
	}
	public static int[] numberDividedseven(int[] number){
		int numberDividedsevenTemp[] = new int[number.length];
		int index = 0;
		for(int x : number) {
			 if(x % 5 == 0) {}
		   else if (x % 7 == 0) {
				numberDividedsevenTemp[index++] = x;
			}
			
		}
		int numberDividedseven[] = new int[index];
		System.arraycopy(numberDividedsevenTemp, 0, numberDividedseven, 0, index);
		return numberDividedseven;
	}
	public static int[] numberDividedfive(int[] number) {
	    int[] numberDividedfiveTemp = new int[number.length]; // Mảng tạm thời để lưu trữ các số chia hết cho 5
	    int index = 0;
	    for (int x : number) {
	        if (x % 5 == 0 && x != 0) {
	            numberDividedfiveTemp[index++] = x; // Lưu số chia hết cho 5 vào mảng tạm thời
	        }
	    }
	    int[] numberDividedfive = new int[index];
	    System.arraycopy(numberDividedfiveTemp, 0, numberDividedfive, 0, index);

	    return numberDividedfive;
	}

	public static int[] othersNumber(int[] number) {
		int othernumberTemp[] = new int[number.length];
		int index = 0;
		for(int x : number) {
			if(x % 5 == 0 && x % 7 == 0 || x % 5 != 0 && x % 7 != 0) {
				othernumberTemp[index++] = x;
			}
		}
		int othernumber[] = new int[index];
		System.arraycopy(othernumberTemp, 0, othernumber, 0, index);
		return othernumber;
	}
}
