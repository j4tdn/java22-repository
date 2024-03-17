package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(1, "Khiếu Thanh Tùng", 7.5, 8.0);
		SinhVien sv2 = new SinhVien(1, "Phan Ngọc", 8.5, 8.0);
		SinhVien sv3 = new SinhVien();
		
		nhapThongtin(sv3);
		SinhVien[] danhsachSinhVien = {sv1, sv2, sv3};
		timSinhVienDiemTBHon85(danhsachSinhVien);
		timSinhVienLyThuyetHonThucHanh(danhsachSinhVien);
	}
	
	public static void nhapThongtin(SinhVien sv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên:");
		sv.setMaSV(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập họ và tên sinh viên:");
		sv.setHoTen(sc.nextLine());
		System.out.println("Nhập điểm lý thuyết:");
		sv.setDiemLyThuyet(sc.nextDouble());
		System.out.println("Nhập điểm thực hành:");
		sv.setDiemThucHanh(sc.nextDouble());
	}
	
	public static void timSinhVienDiemTBHon85(SinhVien[] danhSacSinhVien) {
		System.out.println("Danh sách sinh viên có điểm TB lớn hơn 8.5:");
		for(SinhVien sv : danhSacSinhVien) {
			if(sv.tinhDiemTrungBinh()> 8.5) {
				System.out.println(sv);
			}
		}
	}
	
	public static void timSinhVienLyThuyetHonThucHanh(SinhVien[] danhSachSinhVien) {
		System.out.println("Danh sách sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
		for(SinhVien sv : danhSachSinhVien) {
			if(sv.getDiemLyThuyet() > sv.getDiemThucHanh()) {
				System.out.println(sv);
			}
		}
	}
}
