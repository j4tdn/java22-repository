package EX01;

public class students {
	private int maSV;
	private String HoTen;
	private float DTL, DTH;
	
	
	public students() {
		
	}


	public students(int maSV, String hoTen, float dTL, float dTH) {

		this.maSV = maSV;
		this.HoTen = hoTen;
		this.DTL = dTL;
		this.DTH = dTH;
	}


	public int getMaSV() {
		return maSV;
	}


	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}


	public String getHoTen() {
		return HoTen;
	}


	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}


	public float getDTL() {
		return DTL;
	}


	public void setDTL(float dTL) {
		DTL = dTL;
	}


	public float getDTH() {
		return DTH;
	}


	public void setDTH(float dTH) {
		DTH = dTH;
	}
	
	public float DTB () {
		return(DTL + DTH)/2;
	}
	public String toString () {
		return maSV + " - " +  HoTen + " - " + "DTB: " + DTB () ; 
	}
	 public void inSV() {
	        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSV, HoTen, DTL, DTH , DTB());
	    }


	
	
		
	}
	
	
	
	
	
	
	
