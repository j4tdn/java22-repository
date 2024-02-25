package Bai5;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Tạo 3 đối tượng Sách Giáo Khoa
        SachGiaoKhoa sgk1 = new SachGiaoKhoa("SGK001", 142, "Nhi Đồng", "Mới");
        SachGiaoKhoa sgk2 = new SachGiaoKhoa("SGK002", 48, "Nhi Đồng", "Cũ");
        SachGiaoKhoa sgk3 = new SachGiaoKhoa("SGK003", 110, "Nhi Đồng", "Mới");

        // Tạo 2 đối tượng Sách Tham Khảo
        SachThamKhao stk1 = new SachThamKhao("STK001", 99, "Nhi Đồng", 10);
        SachThamKhao stk2 = new SachThamKhao("STK002", 120, "Kim Đồng", 12);

        // Thêm các đối tượng sách vào danh sách
        danhSachSach.add(sgk1);
        danhSachSach.add(sgk2);
        danhSachSach.add(sgk3);
        danhSachSach.add(stk1);
        danhSachSach.add(stk2);

        // In ra thông tin sách trong danh sách
        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }

        // In ra thông tin sách thuộc nhà xuất bản Nhi Đồng
        System.out.println("\nSách thuộc nhà xuất bản Nhi Đồng:");
        for (Sach sach : danhSachSach) {
            if (sach.nhaXuatBan.equals("Nhi Đồng")) {
                System.out.println(sach);
            }
        }

        // In ra thông tin sách có đơn giá nhỏ hơn 50
        System.out.println("\nSách có đơn giá nhỏ hơn 50:");
        for (Sach sach : danhSachSach) {
            if (sach.donGia < 50) {
                System.out.println(sach);
            }
        }

        // In ra thông tin sách giáo khoa có đơn giá từ 100 đến 200
        System.out.println("\nSách giáo khoa có đơn giá từ 100 đến 200:");
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoKhoa && sach.donGia >= 100 && sach.donGia <= 200) {
                System.out.println(sach);
            }
        }

        // Mô phỏng việc mua sách
        SachGiaoKhoa sachGiaoKhoa = (SachGiaoKhoa) danhSachSach.get(1); // Giả sử khách hàng mua sách giáo khoa SGK002
        SachThamKhao sachThamKhao = (SachThamKhao) danhSachSach.get(3); // Giả sử khách hàng mua sách tham khảo STK001
        // Tính tổng tiền khách hàng phải thanh toán
        double tongTien = tinhTongTien(sachGiaoKhoa, sachThamKhao);
        System.out.println("\nTổng tiền mà khách hàng phải thanh toán: " + tongTien);
    }

    // Hàm tính tổng tiền khách hàng phải thanh toán
    public static double tinhTongTien(SachGiaoKhoa sachGiaoKhoa, SachThamKhao sachThamKhao) {
        double tongTien = 0;

        // Tính tiền cho sách giáo khoa
        tongTien += sachGiaoKhoa.tinhGiaTien();

        // Tính tiền cho sách tham khảo
        tongTien += sachThamKhao.tinhGiaTien();

        return tongTien;
    }
}
