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
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int decimal = ip.nextInt();
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
