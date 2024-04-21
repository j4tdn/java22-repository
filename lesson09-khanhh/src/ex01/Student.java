package ex01;

public class Student {

	private int maSV;
	private String hoTen;
	private xepLoai a;
	
	public Student() {
	}
	
	public Student(int i, String hoTen, xepLoai a) {
		this.maSV = i;
		this.hoTen = hoTen;
		this.a = a;
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

	public xepLoai getXepLoai() {
		return a;
	}

	public void setXepLoai(String xepLoai) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "[maSV=" + maSV + ", hoTen=" + hoTen + ", xepLoai=" + a + "]";
	}
	
}
