package Bai5;

public class SachThamKhao extends Sach{
    protected double thuePhanTram;

    public SachThamKhao(String maSach, double donGia, String nhaXuatBan, double thuePhanTram) {
        super(maSach, donGia, nhaXuatBan);
        this.thuePhanTram = thuePhanTram;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thuế (%): " + thuePhanTram;
    }

    // Phương thức tính giá tiền sách tham khảo
    public double tinhGiaTien() {
        return donGia * (1 + thuePhanTram / 100);
    }
}
