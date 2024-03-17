package ex01;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLyThuyet, diemThucHanh;
	
	public SinhVien() {
		
	}

	public SinhVien(int maSV, String hoTen, double diemLyThuyet, double diemThucHanh) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(double diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public double getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(double diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	
	public double tinhDiemTrungBinh() {
		return (diemLyThuyet + diemThucHanh)/ 2;
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLyThuyet=" + diemLyThuyet + ", diemThucHanh="
				+ diemThucHanh + "]";
	}
	
	
}
