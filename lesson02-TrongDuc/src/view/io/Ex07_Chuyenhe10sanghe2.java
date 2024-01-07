package view.io;

import java.util.Scanner;
public class Ex07_Chuyenhe10sanghe2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên (hệ 10): ");
        int he10 = scanner.nextInt();

        String he2 = chuyenDoihe10sanghe2(he10);
        System.out.println("he2 tương ứng: " + he2);
    }
    private static String chuyenDoihe10sanghe2(int he10) {
        if (he10 == 0) {
            return "0";
        }

        StringBuilder ketQua = new StringBuilder();
        int soDu;

        while (he10 > 0) {
            soDu = he10 % 2; 
            ketQua.insert(0, soDu);  
            he10 /= 2; 
        }
        return ketQua.toString();
    }
}
