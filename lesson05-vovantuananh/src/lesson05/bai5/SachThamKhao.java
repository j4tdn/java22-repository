package lesson05.bai5;

public class SachThamKhao extends Sach {
	private double thue;


    public SachThamKhao(String maSach, double donGia, String nxb, double thue) {
        super(maSach, donGia, nxb);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

	@Override
	public String toString() {
		return "SachThamKhao [thue=" + thue + ", getMaSach()=" + getMaSach() + ", getDonGia()=" + getDonGia()
				+ ", getNXB()=" + getNXB() + "]";
	}
}
