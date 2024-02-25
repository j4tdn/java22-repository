import java.util.ArrayList;
import java.util.Scanner;

class KhachHang {
    String maKhachHang;
    String hoTen;
    String soDienThoai;
    String diaChi;

    public KhachHang(String maKhachHang, String hoTen, String soDienThoai, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }
}

class Sach {
    String maSach;
    double donGia;
    String nhaXuatBan;

    public Sach(String maSach, double donGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
    }
}

class SachGiaoKhoa extends Sach {
    String tinhTrang;

    public SachGiaoKhoa(String maSach, double donGia, String nhaXuatBan, String tinhTrang) {
        super(maSach, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public double tinhTien() {
        if (tinhTrang.equals("Cu")) {
            // Giảm giá 30% với sách cũ
            return donGia * 0.7;
        } else {
            return donGia;
        }
    }
}

class SachThamKhao extends Sach {
    double thue;

    public SachThamKhao(String maSach, double donGia, String nhaXuatBan, double thue) {
        super(maSach, donGia, nhaXuatBan);
        this.thue = thue;
    }

    public double tinhTien() {
        // Thành tiền = đơn giá * (1 + % thuế)
        return donGia * (1 + thue);
    }
}

public class Ex05Book {
    public static void main(String[] args) {
        // Tao danh sach khach hang
        ArrayList<KhachHang> danhSachKhachHang = new ArrayList<>();
        danhSachKhachHang.add(new KhachHang("KH001", "Nguyen Van A", "0123456789", "123 Duong ABC, Quan XYZ"));
        danhSachKhachHang.add(new KhachHang("KH002", "Tran Thi B", "0987654321", "456 Duong XYZ, Quan ABC"));
        Scanner s=new Scanner(System.in);
        // Với mỗi khách hàng, tạo một danh sách sách mới
        for (KhachHang khachHang : danhSachKhachHang) {
            // Tao danh sach sach cho khach hang hien tai
            ArrayList<Sach> danhSachSach = new ArrayList<>();
            for(int i=1;i<=3;i++)
            {
                String maSach="SGK" + Integer.toString(i);
                System.out.println("Nhap cac thong tin SGK "+i+":");
                int donGia=s.nextInt();
                s.nextLine();
                String nhaXuatBan=s.nextLine();
                String tinhTrang=s.nextLine();
                danhSachSach.add(new SachGiaoKhoa(maSach,donGia,nhaXuatBan,tinhTrang));
            }
            for(int i=1;i<=2;i++)
            {
                String maSach="STK" + Integer.toString(i);
                System.out.println("Nhap cac thong tin STK "+i+":");
                int donGia=s.nextInt();
                s.nextLine();
                String nhaXuatBan=s.nextLine();
                double thue=s.nextDouble();
                danhSachSach.add(new SachThamKhao(maSach,donGia,nhaXuatBan,thue));
            }
            
            // Tim sach theo nha xuat ban Nhi Dong
            System.out.println("Sach thuoc nha xuat ban Nhi Dong cua khach hang " + khachHang.hoTen + ":");
            for (Sach sach : danhSachSach) {
                if (sach.nhaXuatBan.equals("Nhi Dong")) {
                    System.out.println("Ma sach: " + sach.maSach + ", Don gia: " + sach.donGia);
                }
            }

            // Tim sach co don gia nho hon 50
            System.out.println("\nSach co don gia nho hon 50 cua khach hang " + khachHang.hoTen + ":");
            for (Sach sach : danhSachSach) {
                if (sach.donGia < 50) {
                    System.out.println("Ma sach: " + sach.maSach + ", Don gia: " + sach.donGia);
                }
            }

            // Tim sach giao khoa co don gia tu 100 den 200
            System.out.println("\nSach giao khoa co don gia tu 100 den 200 cua khach hang " + khachHang.hoTen + ":");
            for (Sach sach : danhSachSach) {
                if (sach instanceof SachGiaoKhoa && sach.donGia >= 100 && sach.donGia <= 200) {
                    System.out.println("Ma sach: " + sach.maSach + ", Don gia: " + sach.donGia);
                }
            }

            // Thuc hien giai lap: Khach hang mua 1 cuon sach giao khoa va 1 cuon sach tham khao
            double tongTien = thanhToan(new SachGiaoKhoa("SGK1", 150, "Nhi Dong", "Moi"), new SachThamKhao("STK1", 70, "Giao Duc", 0.05));
            System.out.println("\nTong tien phai thanh toan cua khach hang " + khachHang.hoTen + ": " + tongTien);
        }
    }

    public static double thanhToan(SachGiaoKhoa sachGiaoKhoa, SachThamKhao sachThamKhao) {
        return sachGiaoKhoa.tinhTien() + sachThamKhao.tinhTien();
    }
}