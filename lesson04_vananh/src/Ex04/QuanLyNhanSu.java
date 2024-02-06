package Ex04;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanSu {
	public static void main(String[] args) {

		GiamDoc gd = new GiamDoc("GD1", "1997", 2, 2);

		TruongPhongNhanSu truongPhong1 = new TruongPhongNhanSu("Truong Phong A", "02/02/1975", 2.0, 0.5, "Phong A");
		TruongPhongNhanSu truongPhong2 = new TruongPhongNhanSu("Truong Phong B", "03/03/1980", 2.5, 0.7, "Phong B");

		NhanVien nv1 = new NhanVien("Le Van A", "01/01/1990", 1.0, "tenDonVi1", "truongPhong1");
		NhanVien nv2 = new NhanVien("Le Van B", "02/01/1990", 2.0, "tenDonVi2", "truongPhong2");
		NhanVien nv3 = new NhanVien("Le Van C", "03/01/1990", 3.0, "tenDonVi2", "truongPhong2");
		NhanVien nv4 = new NhanVien("Le Van D", "04/01/1990", 6.0, "tenDonVi1", "truongPhong1");
		NhanVien nv5 = new NhanVien("Le Van E", "05/01/1990", 1.0, "tenDonVi1", "truongPhong1");
		NhanVien nv6 = new NhanVien("Le Van F", "06/01/1990", 1.0, "tenDonVi1", "truongPhong1");

		GiamDoc[] ListGiamDoc = { gd };
		TruongPhongNhanSu[] listTP = { truongPhong1, truongPhong2 };
		NhanVien[] ListNhanVien = { nv1, nv2, nv3, nv4, nv5, nv6 };
		
		print(ListGiamDoc,listTP,ListNhanVien);
		System.out.println("\n");
		NVtheoTP(listTP,ListNhanVien);
		System.out.println("\n");
		Luong(ListGiamDoc,listTP,ListNhanVien );
	}
	
	   // Hiển thị thông tin các nhân sự có trong công ty
    public static void print(GiamDoc[] ListGiamDoc, TruongPhongNhanSu[] listTP, NhanVien[] ListNhanVien) {
        System.out.println("Thông tin các nhân sự có trong công ty:");
        for (GiamDoc gd : ListGiamDoc) {
            System.out.println(gd);
        }
        for (TruongPhongNhanSu tp : listTP) {
            System.out.println(tp);
        }
        for (NhanVien nv : ListNhanVien) {
            System.out.println(nv);
        }
    }
    // Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
    public static void NVtheoTP(TruongPhongNhanSu[] listTP, NhanVien[] ListNhanVien) {
        System.out.println("Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
        for (TruongPhongNhanSu tp : listTP) {
            int count = 0;
            for (NhanVien nv : ListNhanVien) {
                if (nv.getTruongPhong().equals(tp.getTenDonVi())) {
                    count++;
                }
            }
            System.out.println("Trưởng phòng " + tp.getTenDonVi() + " quản lý " + count + " nhân viên.");
        }
    }
 // Tính và in ra mức lương của từng loại nhân sự
    public static void Luong(GiamDoc[] ListGiamDoc, TruongPhongNhanSu[] listTP, NhanVien[] ListNhanVien) {
        System.out.println("Mức lương của từng loại nhân sự:");
        for (GiamDoc gd : ListGiamDoc) {
            System.out.println("Họ tên: " + gd.getHoTen() + ", Lương: " + gd.tinhLuong() + ", Loại: Giám đốc");
        }
        for (TruongPhongNhanSu tp : listTP) {
            System.out.println("Họ tên: " + tp.getHoTen() + ", Lương: " + tp.tinhLuong() + ", Loại: Trưởng phòng");
        }
        for (NhanVien nv : ListNhanVien) {
            System.out.println("Họ tên: " + nv.getHoTen() + ", Lương: " + nv.tinhLuong() + ", Loại: Nhân viên");
        }
    }
}