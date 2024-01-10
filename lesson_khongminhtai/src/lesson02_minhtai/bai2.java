package lesson02_minhtai;

import java.util.Scanner;

public class bai2 {
	/* Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
		Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
		(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
		VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
		
		= 4 → true
		
		= 6 → false
		= 8 → true
		= 9 → false
	 */
	public static void main(String[] args) {
		int  n = 0;
		Scanner sc = new Scanner(System.in);
		
		while (n < 5) {
            System.out.println("Nhập một số  : ");
            int N = sc.nextInt();

            if (checkPowerOfTwo(N)== true) {
                System.out.println(N + " lũy thừa của 2");
                break; 
                //Thoát khỏi vòng lặp khi đã tìm lũy thừa của 2
            } else {
                System.out.println(N + " không là lũy thừa của 2");
                n++;
            }
        }

        if (n == 5) {
            System.out.println("Bạn đã nhập quá 5 lần không thể tiếp tục nhập");
        }
	}
//	Hàm kiểm tra số nguyên có phải là lũy thừa của 2 hay không
//  Các số là luỹ thừa của 2 đều có 1 chữ số 1 trong biểu diễn nhị phân của chúng
//	số n = 32 ( 100000) và n -1 = 31 (011111) và rõ ràng n&(n-1) = 0.
	private static boolean checkPowerOfTwo(int number) {
        return (number > 0) && ((number & (number - 1)) == 0);
    }
}
