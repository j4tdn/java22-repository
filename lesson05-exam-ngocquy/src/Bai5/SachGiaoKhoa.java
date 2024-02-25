package Bai5;

public class SachGiaoKhoa extends Sach{
    protected String tinhTrang;

    public SachGiaoKhoa(String maSach, double donGia, String nhaXuatBan, String tinhTrang) {
        super(maSach, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tình trạng: " + tinhTrang;
    }

    // Phương thức tính giá tiền sách giáo khoa
    public double tinhGiaTien() {
        if (tinhTrang.equals("Cũ")) {
            return donGia * 0.7; // Giảm giá 30% cho sách cũ
        } else {
            return donGia;
        }
    }
}
