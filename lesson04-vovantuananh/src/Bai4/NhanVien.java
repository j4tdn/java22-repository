package Bai4;

public class NhanVien extends NhanSu{
	private String TenDonVi;
	private TruongPhong truongphong;
	public NhanVien(String hoten, String ngaySinh, int heSoLuong, String tenDonVi,
			TruongPhong truongphong) {
		super(hoten, ngaySinh, heSoLuong);
		TenDonVi = tenDonVi;
		this.truongphong = truongphong;
	}
	public String getTenDonVi() {
		return TenDonVi;
	}
	public void setTenDonVi(String tenDonVi) {
		TenDonVi = tenDonVi;
	}
	public TruongPhong getTruongphong() {
		return truongphong;
	}
	public void setTruongphong(TruongPhong truongphong) {
		this.truongphong = truongphong;
	}
	
	
	
	@Override
	public String toString() {
		return "NhanVien [TenDonVi=" + TenDonVi + ", truongphong=" + truongphong + ", getHoten()=" + getHoten()
				+ ", getNgaySinh()=" + getNgaySinh() + ", getHeSoLuong()=" + getHeSoLuong() + ", getHeSoChucVu()="
				+ getHeSoChucVu() + "]";
	}
	@Override
	public float tinhLuong() {
		 return (getHeSoLuong() + getHeSoChucVu()) * 2200000;
	}
}
