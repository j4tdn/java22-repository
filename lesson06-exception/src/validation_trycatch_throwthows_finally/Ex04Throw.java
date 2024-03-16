package validation_trycatch_throwthows_finally;

import java.time.Year;
import java.util.Scanner;

public class Ex04Throw {
	public static void main(String[] args) {
		
		// Nhap vao nam sinh in ra thong tin tuoi
		
		//cách 3: khi bị Exception thì có 1 số trường hợp thay vì try/catch thì có thể dùng thow để ném exception đó để không cần pahir xử lí
		//
		//thường chỉ ném(throw  exception trong hàm )
		
		//VD: chia 2 số nguyên
		
		try {
			// chỗ X1: chưa validate
			System.out.println("x1 -->"+ divide(7,0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			// chỗ X2: chưa validate
			System.out.println("x2 -->"+ divide(2,0));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			// chỗ X3: đã validate
			System.out.println("x3 -->"+ divide(2,3));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static int divide(int a, int b) {
		// đoạn code này có thể xảy ra exception - lỗi chia 0
		//vì  a,b là tham số truyền vào - việc xảy ra ngoại lệ hay không do chỗ gọi hàm và truyền giá trị
		
		// có chỗ: trước khi gọi hàm họ đã validate b!=0
		// có chỗ: trước khi gọi hàm họ chưa validate b!=0
		// nếu dùng try catch thì chỗ validate bị thừa 
		// ==> dùng throw ném ngọai lệ
		
		if(b==0) {
			// thay vì để a/b thực thi và bị quăng lỗi bởi thằng java 
			//thì mik ktra và quăng lỗi
			
			// ném ArithmeticException thì không bắt buộc xử lí lỗi 
			// nma nên xử lí lỗi (try/catch - lại throw đi chỗ khác)
			throw new ArithmeticException(" >> b cannot be ZERO <<");
			
		}
		
		return a/b;
	}
}
