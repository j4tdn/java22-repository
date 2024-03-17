package homework;

import java.util.Scanner;

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
public class Ex07 {
	
	public static void main(String[] args) {
		
		int a;
		int count = 0;		
		
		do {
			Scanner ip = new Scanner(System.in);
			System.out.println("Hãy nhập số: " );
			
			if (ip.hasNextInt()) {
				a = Integer.parseInt(ip.next());
				if (a > 0) {
					DecimalBinary(a);
				}
				else {
					System.out.println("Vui lòng nhập số nguyên lớn hơn 0");
				}
			}
			else {
				System.out.println("Bạn đã nhập sai định dạng");
				count++;
				if (count == 5) {
					System.out.println("Bạn đã nhập sai 5 lần, kết thúc chương trình");
					System.exit(0);
				}
			}
			
		} while(count < 5);
	}
	
	public static int DecimalBinary (int decimal) {
		int remain;  //số dư 
		int binary = 0;
		int i = 1;
		
		while(decimal > 0) {
			remain = decimal % 2;
			binary = binary + (i * remain);
			decimal /= 2;
			i = i * 10;
		}
		System.out.println("Số ở hệ nhị phân --> " + binary);
		return binary;
		
	}
}
