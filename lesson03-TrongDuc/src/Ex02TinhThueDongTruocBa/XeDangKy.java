package Ex02TinhThueDongTruocBa;

import java.util.Scanner;

public class XeDangKy {
    private String hangXe;
    private double triGiaXe;
    private int dungTichXylanh;

    // Constructor
    public XeDangKy(String hangXe, double triGiaXe, int dungTichXylanh) {
        this.hangXe = hangXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXylanh = dungTichXylanh;
    }

    // Phương thức tính mức thuế trước bạ
    public double tinhThueTruocBa() {
        if (dungTichXylanh < 100) {
            return triGiaXe * 0.01;
        } else if (dungTichXylanh >= 100 && dungTichXylanh <= 200) {
            return triGiaXe * 0.03;
        } else {
            return triGiaXe * 0.05;
        }
    }

    // Phương thức xuất thông tin của xe
    public void hienThiThongTin() {
        System.out.println("Thông tin xe:");
        System.out.println("Hãng xe: " + hangXe);
        System.out.println("Trị giá xe: " + triGiaXe);
        System.out.println("Dung tích xylanh: " + dungTichXylanh);
        System.out.println("Mức thuế trước bạ: " + tinhThueTruocBa());
    }
}
