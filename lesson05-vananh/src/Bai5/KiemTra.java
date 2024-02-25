package Bai5;

import java.util.ArrayList;

public class KiemTra {
    public static void main(String[] args) {
        Sach[] danhSachSach = taoDuLieuSach();
        ArrayList<KhachHang> danhSachKhachHang = new ArrayList<>();
        danhSachKhachHang.add(new KhachHang("KH001", "Nguyễn Văn A", "0123456789", "Hà Nội"));
        danhSachKhachHang.add(new KhachHang("KH002", "Trần Thị B", "0987654321", "Hồ Chí Minh"));
        System.out.println("Thông tin các khách hàng:");
        for (KhachHang khachHang : danhSachKhachHang) {
            System.out.println(khachHang);
        }
        System.out.println("Danh sách sách của nhà xuất bản Nhi Đồng:");
        timSachTheoNhaXuatBan(danhSachSach, "Nhi Đồng");
        System.out.println("\nDanh sách sách có đơn giá nhỏ hơn 50:");
        timSachTheoDonGia(danhSachSach, 50000);
        System.out.println("\nDanh sách sách giáo khoa có đơn giá từ 100 đến 200:");
        timSachGiaoKhoaTheoDonGia(danhSachSach, 10000, 20000);
        int tongTien = tinhTongTienMuaSach(danhSachSach, 1, 1);
        System.out.println("\nTổng tiền khách hàng phải thanh toán: " + tongTien + " đồng.");
    }
    
    public static Sach[] taoDuLieuSach() {
        Sach[] danhSachSach = new Sach[5];
        SachGiaoKhoa sgk1 = new SachGiaoKhoa("SGK001", 10000, "NXB A", "Mới");
        SachGiaoKhoa sgk2 = new SachGiaoKhoa("SGK002", 15000, "NXB B", "Cũ");
        SachGiaoKhoa sgk3 = new SachGiaoKhoa("SGK003", 12000, "Nhi Đồng", "Mới");
        SachThamKhao stk1 = new SachThamKhao("STK001", 20000, "NXB D", 5);
        SachThamKhao stk2 = new SachThamKhao("STK002", 25000, "Nhi Đồng", 8);
        
        danhSachSach[0] = sgk1;
        danhSachSach[1] = sgk2;
        danhSachSach[2] = sgk3;
        danhSachSach[3] = stk1;
        danhSachSach[4] = stk2;

        return danhSachSach;
    }
    public static void timSachTheoNhaXuatBan(Sach[] danhSachSach, String tenNhaXuatBan) {
        for (Sach sach : danhSachSach) {
            if (sach.nhaXuatBan.equals(tenNhaXuatBan)) {
                System.out.println(sach);
            }
        }
    }
    public static void timSachTheoDonGia(Sach[] danhSachSach, int gia) {
        for (Sach sach : danhSachSach) {
            if (sach.donGia < gia) {
                System.out.println(sach);
            }
        }
    }
    public static void timSachGiaoKhoaTheoDonGia(Sach[] danhSachSach, int giaMin, int giaMax) {
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa && sach.donGia >= giaMin && sach.donGia <= giaMax) {
                System.out.println(sach);
            }
        }
    }
    public static int tinhTongTienMuaSach(Sach[] danhSachSach, int soLuongSGK, int soLuongSTK) {
        int tongTien = 0;
        int demSGK = 0;
        int demSTK = 0;
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa && demSGK < soLuongSGK) {
                tongTien += ((SachGiaoKhoa) sach).tinhTien();
                demSGK++;
            }
            if (sach instanceof SachThamKhao && demSTK < soLuongSTK) {
                tongTien += ((SachThamKhao) sach).tinhTien();
                demSTK++;
            }
            if (demSGK >= soLuongSGK && demSTK >= soLuongSTK) {
                break;
            }
        }
        return tongTien;
    }
}
