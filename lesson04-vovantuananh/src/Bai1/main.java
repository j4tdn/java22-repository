package Bai1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		sinhvien sv1 = new sinhvien(1,"Vo Van Tuan Anh", 9.5f,9.0f);
		sinhvien sv2 = new sinhvien(2,"Pham Duy", 8.0f,8.5f);
		sinhvien sv3 = new sinhvien();
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("MSSV sv3: ");
        sv3.setMSSV(scanner.nextInt());
        scanner.nextLine();

        System.out.println("HoTen sv3: ");
        sv3.setHoTen(scanner.nextLine());

        System.out.println("DiemLT sv3: ");
        sv3.setDiemLT(scanner.nextFloat());

        System.out.println("DiemTH sv3: ");
        sv3.setDiemTH(scanner.nextFloat());
		
		sinhvien[] sv = {sv1,sv2,sv3};
		
		tinhDiemTB(sv);
		System.out.println("\n");
		thongtinSV(sv);
		System.out.println("\n");
		 for (sinhvien student : sv) {
	            System.out.println(student);
	        }
	}
	
	public static void  tinhDiemTB(sinhvien[] sv) {
		System.out.println("Sinh vien co diem TB > 8.5 : \n");
		 for (sinhvien student : sv) {
	            Float TB = student.tinhDiem();
	            if(TB>8.5) {
	            	System.out.println("Diem TB của "+ student.getHoTen()+ " : " +TB);
	            	System.out.println(student);
	            }
	        }
	}
	
	public static void thongtinSV(sinhvien[] sv) {
		System.out.println("Sinh vien co diemLT > diemTH : \n");
		for (sinhvien student : sv) {
			if(student.getDiemLT()>student.getDiemTH()) {
				System.out.println(student);
			}
		}
	}
}
