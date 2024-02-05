package Bai1;

public class sinhvien {
	private int MSSV;
	private String HoTen;
	private Float DiemLT;
	private Float DiemTH;
	
	public sinhvien() {
		
	}

	public sinhvien(int mSSV, String hoTen, Float diemLT, Float diemTH) {
		MSSV = mSSV;
		HoTen = hoTen;
		DiemLT = diemLT;
		DiemTH = diemTH;
	}

	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public Float getDiemLT() {
		return DiemLT;
	}

	public void setDiemLT(Float diemLT) {
		DiemLT = diemLT;
	}

	public Float getDiemTH() {
		return DiemTH;
	}

	public void setDiemTH(Float diemTH) {
		DiemTH = diemTH;
	}

	public Float tinhDiem() {
		return (this.DiemLT+this.DiemTH)/2;
	}
	
	@Override
	public String toString() {
		return "sinhvien [MSSV=" + MSSV + ", HoTen=" + HoTen + ", DiemLT=" + DiemLT + ", DiemTH=" + DiemTH + "]";
	}
	
	
}
