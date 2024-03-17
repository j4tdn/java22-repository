package Bai2;

import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		Vehicle[] danhsachXe = nhapDanhSachXe();
		
		System.out.println("Chủ xe          Loại xe          Dung tích          Trị giá          Thuế   ");
		System.out.println("============================================================================");
		for ( Vehicle xe : danhsachXe) {
			double Thue = 0;
			if (xe.getDungTich()<100) {
				Thue = xe.getGia()*0.01;
					System.out.println(xe.getTenChuXe()+"         "+xe.getLoaiXe()+"         "+xe.getDungTich()+"         "+xe.getGia()+"         "+Thue);
			}else if (xe.getDungTich()<=200) {
				Thue = xe.getGia()*0.03;
				System.out.println(xe.getTenChuXe()+"         "+xe.getLoaiXe()+"         "+xe.getDungTich()+"         "+xe.getGia()+"         "+Thue);
			}else {
				Thue = xe.getGia()*0.05;
				System.out.println(xe.getTenChuXe()+"         "+xe.getLoaiXe()+"         "+xe.getDungTich()+"         "+xe.getGia()+"         "+Thue);
			}
		}
	}
	
	public static Vehicle[] nhapDanhSachXe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong xe (n): ");
        int n = Integer.parseInt(scanner.nextLine());
        
        Vehicle[] danhSachXe = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho xe thu " + (i + 1) + ":");
            System.out.print("Nhap ten chu xe: ");
            String tenChuXe = scanner.nextLine();

            System.out.print("Nhap loai xe: ");
            String loaiXe = scanner.nextLine();

            System.out.print("Nhap dung tich: ");
            int dungTich = scanner.nextInt();

            System.out.print("Nhap gia: ");
            double gia = scanner.nextDouble();

            danhSachXe[i] = new Vehicle(tenChuXe, loaiXe, dungTich, gia);

            scanner.nextLine();
        }
        return danhSachXe;
    }
}

