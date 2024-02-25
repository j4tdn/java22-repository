package Bai5;

abstract class Sach {
    protected String maSach;
    protected int donGia;
    protected String nhaXuatBan;

    public Sach(String maSach, int donGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach + ", Đơn giá: " + donGia + ", Nhà xuất bản: " + nhaXuatBan;
    }
}
