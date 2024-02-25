package Bai5;

public class Sach {
    protected String maSach;
    protected double donGia;
    protected String nhaXuatBan;

    public Sach(String maSach, double donGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach + ", Đơn giá: " + donGia + ", Nhà xuất bản: " + nhaXuatBan;
    }
}
