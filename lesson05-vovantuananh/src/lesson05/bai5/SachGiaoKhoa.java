package lesson05.bai5;

public class SachGiaoKhoa extends Sach{
	private String tinhTrang;

    public SachGiaoKhoa(String maSach, double donGia, String nxb, String tinhTrang) {
        super(maSach, donGia, nxb);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

	@Override
	public String toString() {
		return "SachGiaoKhoa [tinhTrang=" + tinhTrang + ", getMaSach()=" + getMaSach() + ", getDonGia()=" + getDonGia()
				+ ", getNXB()=" + getNXB() + "]";
	}
}
