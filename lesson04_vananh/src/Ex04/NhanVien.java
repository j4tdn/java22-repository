package Ex04;

public class NhanVien extends GiamDoc {
	private String tenDonVi;     //tên đơn vị
	private String TruongPhong;
	
	
	public NhanVien(String hoTen, String ngaySinh, double heSoLuong, String tenDonVi, String TruongPhong) {
	    super(hoTen, ngaySinh, heSoLuong, 0); // Gọi constructor của lớp cha
	    this.tenDonVi = tenDonVi;
	    this.TruongPhong = TruongPhong;
	}
	public String getTenDonVi() {
		return tenDonVi;
	}
	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
	public String getTruongPhong() {
		return TruongPhong;
	}
	public void setTruongPhong(String truongPhong) {
		TruongPhong = truongPhong;
	}
	@Override
	public String toString() {
		return "NhanVien [tenDonVi=" + tenDonVi + ", TruongPhong=" + TruongPhong + "]";
	}
	@Override
    public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 1250000; // Lương của Nhân viên
    }
}


