/*
Bài 7: Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ
cơ số 2(nhị phân)
Tham khảo công thức: https://bit.ly/3QuVyXx
VD: Nhập N = 0 → 0
		 N = 1 → 1
		 N = 2 → 10
		 N = 3 → 11
		 N = 4 → 100
		 N = 5 → 101
 */
package homework;

import java.util.Scanner;

public class BT7 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap N: ");
		int decimalNum = ip.nextInt();
		
		String binaryNum = convertBase(decimalNum);
		System.out.println(binaryNum);
		
		ip.close();
	}
	public static String convertBase(int decimalNum) {
		if(decimalNum == 0) {
			return "0";
		}
		StringBuilder binaryNum = new StringBuilder();
		while(decimalNum > 0) {
			int remainder = decimalNum % 2;
			binaryNum.insert(0, remainder);
			decimalNum /= 2;
		}
		return binaryNum.toString();
	}
}
