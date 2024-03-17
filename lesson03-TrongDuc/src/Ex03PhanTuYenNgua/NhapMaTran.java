package Ex03PhanTuYenNgua;

import java.util.Scanner;

public class NhapMaTran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng (M): ");
        int soHang = scanner.nextInt();
        System.out.print("Nhập số cột (N): ");
        int soCot = scanner.nextInt();

        // Khởi tạo và nhập giá trị cho ma trận
        int[][] maTran = new int[soHang][soCot];
        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập giá trị cho A[" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        // gọi hàm kiểm tra yên ngựa
        KiemTraPhanTu.kiemTraYenNgua(maTran, soHang, soCot);
    }
}
