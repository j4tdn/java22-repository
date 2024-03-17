package Bai4;

public class NhanSu {
	private String Hoten;
	private String NgaySinh;
	private int HeSoLuong;
	private int HeSoChucVu;

	public NhanSu(String hoten, String ngaySinh, int heSoLuong, int heSoChucVu) {
		super();
		Hoten = hoten;
		NgaySinh = ngaySinh;
		HeSoLuong = heSoLuong;
		HeSoChucVu = heSoChucVu;
	}
	
	public NhanSu(String hoten, String ngaySinh, int heSoLuong) {
		Hoten = hoten;
		NgaySinh = ngaySinh;
		HeSoLuong = heSoLuong;
	}

	public String getHoten() {
		return Hoten;
	}
	
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	
	public String getNgaySinh() {
		return NgaySinh;
	}
	
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	
	public int getHeSoLuong() {
		return HeSoLuong;
	}
	
	public void setHeSoLuong(int heSoLuong) {
		HeSoLuong = heSoLuong;
	}
	
	public int getHeSoChucVu() {
		return HeSoChucVu;
	}
	
	public void setHeSoChucVu(int heSoChucVu) {
		HeSoChucVu = heSoChucVu;
	}
	
	@Override
	public String toString() {
		return "NhanSu [Hoten=" + Hoten + ", NgaySinh=" + NgaySinh + ", HeSoLuong=" + HeSoLuong + ", HeSoChucVu="
				+ HeSoChucVu + "]";
	}
	
	public float tinhLuong() {
		return 0;
	}
}
