package Ex04;

public class TruongPhongNhanSu extends GiamDoc {
	private String tenDonVi;

	public TruongPhongNhanSu(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu, String tenDonVi) {
		super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
		this.tenDonVi = tenDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Override
	public String toString() {
		return "TruongPhongNhanSu [tenDonVi=" + tenDonVi + "]";
	}
	
    @Override
	public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 2200000; // Lương của Trưởng phòng
    }
}
