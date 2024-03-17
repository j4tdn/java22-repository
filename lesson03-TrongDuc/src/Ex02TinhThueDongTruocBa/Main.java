package Ex02TinhThueDongTruocBa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng xe: ");
        int soLuongXe = scanner.nextInt();
        scanner.nextLine(); 

        XeDangKy[] danhSachXe = new XeDangKy[soLuongXe];

        // Nhập thông tin và tạo đối tượng xe
        for (int i = 0; i < soLuongXe; i++) {
            System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
            System.out.print("Hãng xe: ");
            String hangXe = scanner.nextLine();
            System.out.print("Trị giá xe: ");
            double triGiaXe = scanner.nextDouble();
            System.out.print("Dung tích xylanh: ");
            int dungTichXylanh = scanner.nextInt();
            scanner.nextLine(); 

            danhSachXe[i] = new XeDangKy(hangXe, triGiaXe, dungTichXylanh);
        }

        // Xuất bảng kê khai tiền thuế trước bạ của các xe
        System.out.println("\nBảng kê khai tiền thuế trước bạ:");
        for (XeDangKy xe : danhSachXe) {
            xe.hienThiThongTin();
            System.out.println("-------------");
        }

        scanner.close();
    }
}

