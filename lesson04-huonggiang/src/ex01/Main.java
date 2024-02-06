package ex01;

public class Main {


	
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(23, "Lê Thị Hương Giang", 8, 10);
		SinhVien sv2 = new SinhVien(24, "Nguyên Văn A", 8.7,5);
		SinhVien sv3 = new SinhVien();
		sv3.setMaSV(26);
		sv3.setHoTen("Nguyen Van B");
		sv3.setDiemThucHanh(9);
		sv3.setDiemLyThuyet(10);
		
		SinhVien[] danhSachSV = {sv1,sv2,sv3};
		
		//
		for(SinhVien sv : danhSachSV) {
			if(sv.DiemTB() > 8.5) {
				System.out.println(sv);
			}
		}
		//2.
		System.out.println("Sinh vien co diem lys thuyet lon hon diem thuc hanh: ");
		for(SinhVien sv : danhSachSV) {
			if(sv.getDiemLyThuyet() > sv.getDiemThucHanh()) {
				System.out.println(sv);
			}
		}
	}

}



