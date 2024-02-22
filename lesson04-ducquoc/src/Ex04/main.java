package Ex04;

public class main {
	public static void main(String[] args) {
		// Tạo dữ liệu
		Manager[] managers = new Manager[3];
		TruongPhong[] truongPhongs = new TruongPhong[2];
		Staff[] staffs = new Staff[6];

		managers[0] = new Manager("Nguyen Van A", "01/01/1970", 3, 2);
		truongPhongs[0] = new TruongPhong("Tran Thi B", "10/05/1985", 2, 1.5, "Phong A");
		truongPhongs[1] = new TruongPhong("Le Van C", "15/08/1980", 2.5, 1.2, "Phong B");

		staffs[0] = new Staff("Hoang Thi D", "20/03/1990", 1.5, truongPhongs[0]);
		staffs[1] = new Staff("Nguyen Van E", "25/06/1995", 1.8, truongPhongs[0]);
		staffs[2] = new Staff("Tran Van F", "05/12/1988", 1.7, truongPhongs[1]);
		staffs[3] = new Staff("Le Thi G", "02/09/1992", 1.6, truongPhongs[1]);
		staffs[4] = new Staff("Pham Van H", "08/04/1993", 1.9, truongPhongs[0]);
		staffs[5] = new Staff("Do Thi I", "12/07/1987", 1.6, truongPhongs[1]);

		System.out.println("Thông tin nhân sự trong công ty:");
		hienThiThongTinNhanSu(managers);
		hienThiThongTinNhanSu(truongPhongs);
		hienThiThongTinNhanSu(staffs);

		thongKeSoLuongNhanVien(truongPhongs);

		tinhVaInLuongNhanSu(managers);
		tinhVaInLuongNhanSu(truongPhongs);
		tinhVaInLuongNhanSu(staffs);
	}

	public static void hienThiThongTinNhanSu(Manager[] nhanSus) {
		for (Manager nhanSu : nhanSus) {
			System.out.println(nhanSu);
		}
	}

	public static void thongKeSoLuongNhanVien(TruongPhong[] truongPhongs) {
		for (TruongPhong truongPhong : truongPhongs) {
			int soLuongNhanVien = truongPhong.getDsNhanVienQuanLy().size();
			System.out.println(truongPhong.getDate() + " quản lý " + soLuongNhanVien + " nhân viên.");
		}
	}

	public static void tinhVaInLuongNhanSu(Manager[] nhanSus) {
		for (Manager nhanSu : nhanSus) {
			String loaiNhanSu = nhanSu.getClass().getSimpleName();
			double luong = nhanSu.tinhLuong();
			System.out.println("Mức lương của " + loaiNhanSu + " " + nhanSu.getDate() + " là: " + luong + " VND");
		}
	}
}
