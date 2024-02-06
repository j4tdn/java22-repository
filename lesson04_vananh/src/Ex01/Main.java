package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(1, "Le Minh Anh", 8.0, 7.5);
		SinhVien sv2 = new SinhVien(2, "Nguyen Tuan Vu", 9.0, 8.5);
		SinhVien sv3 = new SinhVien();
        nhapThongTinSinhVien(sv3);  
        SinhVien[] danhSachSV = {sv1, sv2, sv3};

        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv.toString());
        }

      
        System.out.println("\nDanh sách sinh viên có điểm trung bình lớn hơn 8.5:");
        hienThiDanhSach(timSinhVienDiemTBHon8_5(danhSachSV));

       
        System.out.println("\nDanh sách sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
        hienThiDanhSach(timSinhVienLyThuyetLonHonThucHanh(danhSachSV));

	}

	public static void nhapThongTinSinhVien(SinhVien sv) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Mã SV (số nguyên dương): ");
			if (scanner.hasNextInt()) {
				int maSV = scanner.nextInt();
				if (maSV > 0) {
					sv.setMSSV(maSV);
					break; 
				} else {
					System.out.println("Mã SV phải là số nguyên dương. Vui lòng nhập lại.");
				}
			} else {
				System.out.println("Vui lòng nhập một số nguyên dương. Thử lại.");
				scanner.next(); 
			}
		}

		scanner.nextLine(); 

		System.out.print("Họ tên: ");
		sv.setHoTen(scanner.nextLine());
		System.out.print("Điểm lý thuyết: ");
		sv.setDiemLT(scanner.nextDouble());
		System.out.print("Điểm thực hành: ");
		sv.setDiemTH(scanner.nextDouble());
	}
	   public static void hienThiDanhSach(SinhVien[] danhSachSV) {
	        for (SinhVien sv : danhSachSV) {
	            System.out.println(sv.toString());
	        }
	    }
	    public static SinhVien[] timSinhVienDiemTBHon8_5(SinhVien[] danhSachSV) {
	        List<SinhVien> ketQua = new ArrayList<SinhVien>();
	        for (SinhVien sv : danhSachSV) {
	            if (sv.tinhDiemTrungBinh() > 8.5) {
	                ketQua.add(sv);
	            }
	        }
	        return ketQua.toArray(new SinhVien[0]);
	    }

	    public static SinhVien[] timSinhVienLyThuyetLonHonThucHanh(SinhVien[] danhSachSV) {
	        List<SinhVien> ketQua = new ArrayList<SinhVien>();

	        for (SinhVien sv : danhSachSV) {
	            if (sv.getDiemLT() > sv.getDiemTH()) {
	                ketQua.add(sv);
	            }
	        }

	        return ketQua.toArray(new SinhVien[0]);
	    }
	}
