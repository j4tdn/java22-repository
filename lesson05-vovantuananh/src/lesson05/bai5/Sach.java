package lesson05.bai5;

public class Sach {
	private String maSach;
    private double donGia;
    private String nxb;

    public Sach(String maSach, double donGia, String nxb) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.nxb = nxb;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNXB() {
        return nxb;
    }

    public void setNXB(String nxb) {
        this.nxb = nxb;
    }
}
