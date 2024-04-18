package Ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi tiếng Việt:");
        String chuoi = scanner.nextLine();
        
        String ketqua = boDau(chuoi);
        System.out.println("Chuỗi sau khi loại bỏ dấu: " + ketqua);
    }
    
    public static String boDau(String nhap) {
        String chuoiKhongDau = Normalizer.normalize(nhap, Normalizer.Form.NFD);
        return chuoiKhongDau.replaceAll("[^\\p{ASCII}]", "");
    }
}
