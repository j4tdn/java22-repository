package Ex04;

public class GiamDoc {
	protected String hoTen;
    protected String ngaySinh;
    protected double heSoLuong;
    protected double heSoChucVu;

    public GiamDoc(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.heSoLuong = heSoLuong;
        this.heSoChucVu = heSoChucVu;
    }
   
    public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 3000000; // Lương của Giám đốc
    }

	@Override
	public String toString() {
		return "NhanVien [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", heSoLuong=" + heSoLuong + ", heSoChucVu="
				+ heSoChucVu + "]";
	}
	
	
}

