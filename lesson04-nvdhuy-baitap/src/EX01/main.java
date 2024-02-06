package EX01;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		students sv1 = new students ();
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập mã sinh viên 1: ");
        sv1.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDTH(sc.nextFloat());
	
        
        students sv2 = new students ();
	
		System.out.println("Nhập mã sinh viên 2: ");
        sv1.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 2: ");
        sv1.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDTH(sc.nextFloat());

        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        sv1.inSV();
        sv2.inSV();
     

}
}

