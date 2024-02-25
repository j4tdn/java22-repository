package Bai5;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, int donGia, String nhaXuatBan, String tinhTrang) {
        super(maSach, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public int tinhTien() {
        if (tinhTrang.equals("Cũ")) {
            return (int) (donGia * 0.7);
        } else {
            return donGia;
        }
    }

    @Override
    public String toString() {
        return "Sách giáo khoa - " + super.toString() + ", Tình trạng: " + tinhTrang;
    }
}

