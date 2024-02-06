package Ex01;

public class SinhVien {
      private int MSSV;
      private String HoTen;
      private double DiemLT;
      private double DiemTH;
      
      
	public SinhVien() {
		
	}


	public SinhVien(int mSSV, String hoTen, double diemLT, double diemTH) {
		super();
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


	public double getDiemLT() {
		return DiemLT;
	}


	public void setDiemLT(double diemLT) {
		DiemLT = diemLT;
	}


	public double getDiemTH() {
		return DiemTH;
	}


	public void setDiemTH(double diemTH) {
		DiemTH = diemTH;
	}
      
      public double tinhDiemTrungBinh() {
    	  return (DiemLT + DiemTH)/2;
      }


	@Override
	public String toString() {
		return "SinhVien [MSSV=" + MSSV + ", HoTen=" + HoTen + ", DiemLT=" + DiemLT + ", DiemTH=" + DiemTH + "]";
	}


}
