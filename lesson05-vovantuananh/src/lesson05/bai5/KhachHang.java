package lesson05.bai5;

public class KhachHang {
	 private String maKH;
	    private String hoTen;
	    private String soDt;
	    private String diaChi;

	    public KhachHang(String maKH, String hoTen, String soDt, String diaChi) {
	        this.maKH = maKH;
	        this.hoTen = hoTen;
	        this.soDt = soDt;
	        this.diaChi = diaChi;
	    }

	    public String getMaKH() {
	        return maKH;
	    }

	    public void setMaKH(String maKH) {
	        this.maKH = maKH;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public String getSoDt() {
	        return soDt;
	    }

	    public void setSoDt(String soDt) {
	        this.soDt = soDt;
	    }

	    public String getDiaChi() {
	        return diaChi;
	    }

	    public void setDiaChi(String diaChi) {
	        this.diaChi = diaChi;
	    }

		@Override
		public String toString() {
			return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", soDt=" + soDt + ", diaChi=" + diaChi + "]";
		}
}
