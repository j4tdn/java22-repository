package bai1;

import java.util.Scanner;

public class KiemTra {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int lanThuMax = 5;// lưu giá trị tối đa số lần nhập ko hợp lệ
		int lanThu = 0;//lưu số lần thử nhập
		int n = 0;// lưu gias trị số nguyên
		
		while (lanThu < lanThuMax){
			System.out.println(" Nhap so nguyen N: ");
			
			if(ip.hasNextInt()) {//kiẻm tra người dùng đã nhập 1 số nguyên hay không
				n = ip.nextInt();
				break;
			}else {
				String inPut = ip.next();	// ddọc dlieu người dùng nhập không hợp lệ
				System.out.println(" Lỗi:" + inPut + "\n Không phải là số nguyên" + "\n Vui lòng nhập lại");
				lanThu++;
				}
		}
		if(lanThu >= lanThuMax) {// kiểm tra nhập > 5 hay ch
			System.out.println("Số lần nhập vượt giới hạn.\n Kết thúc chương trình");
			return;
		}
		//kiểm tra N có phải là bội cả 2 không	
		boolean MultipleOfTwo = MultipleOfTwo(n);
		System.out.println(" Kết quả : " + MultipleOfTwo);
		
		
	}

	private static boolean MultipleOfTwo(int n) {
		// TODO Auto-generated method stub
		return (n % 2 == 0);
	}
	
}
