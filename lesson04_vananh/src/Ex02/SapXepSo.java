package Ex02;

import java.util.Scanner;

public class SapXepSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của dãy số (n): ");
        int n = scanner.nextInt();

        if (n < 5 || n > 100) {
            System.out.println("Số lượng phần tử không hợp lệ. Vui lòng nhập lại.");
            return;
        }

        int[] daySo = new int[n];

        System.out.println("Nhập dãy số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }

        // Gọi hàm sắp xếp dãy số theo yêu cầu
        sapXepDaySo(daySo);

        // Hiển thị kết quả
        System.out.println("Dãy số sau khi sắp xếp:");
        for (int i : daySo) {
            System.out.print(i + " ");
        }
    }

    public static void sapXepDaySo(int[] daySo) {
        int[] ketQua = new int[daySo.length];
        int indexChiaHetCho7 = 0;
        int indexKhac = 0;
        int indexChiaHetCho5 = daySo.length - 1;

        // Phân loại số vào mảng kết quả
        for (int i : daySo) {
            if (i % 7 == 0) {
                ketQua[indexChiaHetCho7++] = i;
            } else if (i % 5 == 0) {
                ketQua[indexChiaHetCho5--] = i;
            } else {
                ketQua[indexKhac++] = i;
            }
        }

        // Copy lại mảng kết quả vào dãy số gốc
        System.arraycopy(ketQua, 0, daySo, 0, daySo.length);
    }
}