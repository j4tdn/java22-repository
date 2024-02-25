package Bai5;

public class SachThamKhao extends Sach {
    private int thue;

    public SachThamKhao(String maSach, int donGia, String nhaXuatBan, int thue) {
        super(maSach, donGia, nhaXuatBan);
        this.thue = thue;
    }
    public int tinhTien() {
        return (int) (donGia * (1 + thue / 100.0));
    }

    @Override
    public String toString() {
        return "Sách tham khảo - " + super.toString() + ", Thuế: " + thue + "%";
    }
}
