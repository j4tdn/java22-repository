package ex01;

enum XepLoai {
    A, B, C, D, E, F
}
public class Student {
	
	 int maSv;
	 String hoTen;
	 XepLoai xepLoai;
	 
	 
	public Student(int maSv, String hoTen, XepLoai xepLoai) {		
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.xepLoai = xepLoai;
	}


	public int getMaSv() {
		return maSv;
	}


	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public XepLoai getXepLoai() {
		return xepLoai;
	}


	public void setXepLoai(XepLoai xepLoai) {
		this.xepLoai = xepLoai;
	}


	@Override
	public String toString() {
		return "Student [maSv=" + maSv + ", hoTen=" + hoTen + ", xepLoai=" + xepLoai + "]";
	}
	 
	 

}
