package Bai4;

public class TruongPhong extends NhanSu {
	private String TenDonVi;

	public TruongPhong(String hoten, String ngaySinh, int heSoLuong, int heSoChucVu, String tenDonVi) {
		super(hoten, ngaySinh, heSoLuong, heSoChucVu);
		TenDonVi = tenDonVi;
	}

	public String getTenDonVi() {
		return TenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		TenDonVi = tenDonVi;
	}


	
	@Override
	public String toString() {
		return "TruongPhong [TenDonVi=" + TenDonVi + ", getHoten()=" + getHoten() + ", getNgaySinh()=" + getNgaySinh()
				+ ", getHeSoLuong()=" + getHeSoLuong() + ", getHeSoChucVu()=" + getHeSoChucVu() + "]";
	}

	@Override
	public float tinhLuong() {
		 return (getHeSoLuong() + getHeSoChucVu()) * 2200000;
	}
	
}
