/*
Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
VD: Nhập N  = abc → báo lỗi, yêu cầu nhập lại
			= 4 → true
			= 6 → false
			= 8 → true
			= 9 → false
 */
package homework;

public class BT2 {
	public static void main(String[] args) {
		int N = BT1.enterPositiveInteger();
		boolean rs = checkPowerOf2(N);

        if (rs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
	public static boolean checkPowerOf2(int N) {
		while (N > 1) {
			if(N % 2 != 0) {
				return false;
			}
			N /= 2;
		}
		return true;
	}
}
