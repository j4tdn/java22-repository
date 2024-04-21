package ex01;

public class Studen {
	private int maSv;
	private String hoTen;
	private Rank hocLuc;
	public Studen() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Studen [maSv=" + maSv + ", hoTen=" + hoTen + ", hocLuc=" + hocLuc + "]";
	}
	public Studen(int maSv, String hoTen, Rank hocLuc) {
		super();
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.hocLuc = hocLuc;
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
	public Rank getHocLuc() {
		return hocLuc;
	}
	public void setHocLuc(Rank hocLuc) {
		this.hocLuc = hocLuc;
	}
	
}
