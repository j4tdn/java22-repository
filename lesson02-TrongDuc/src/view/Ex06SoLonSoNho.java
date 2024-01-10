package view;

import java.util.Scanner;
public class Ex06SoLonSoNho {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a = nhapSoNguyen("Nhập a: ");
	        int b = nhapSoNguyen("Nhập b: ");
	        int c = nhapSoNguyen("Nhập c: ");

	        int soLonNhat = timSoLonNhat(a, b, c);
	        int soNhoNhat = timSoNhoNhat(a, b, c);

	        System.out.println("Số lớn nhất là " + soLonNhat);
	        System.out.println("Số nhỏ nhất là " + soNhoNhat);
	    }

	    private static int nhapSoNguyen(String thongBao) {
	        Scanner scanner = new Scanner(System.in);
	        int soNguyen = 0;
	        boolean nhapLai = true;

	        do {
	            try {
	                System.out.print(thongBao);
	                String input = scanner.nextLine();
	                soNguyen = Integer.parseInt(input);

	                if (soNguyen >= 0 && soNguyen < 20) {
	                    nhapLai = false;
	                } else {
	                    System.out.println("Lỗi! Vui lòng nhập lại số nguyên nhỏ hơn 20.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Lỗi! Vui lòng nhập lại số nguyên.");
	            }
	        } while (nhapLai);

	        return soNguyen;
	    }


	    private static int timSoLonNhat(int a, int b, int c) {
	        return Math.max(Math.max(a, b), c);
	    }

	    private static int timSoNhoNhat(int a, int b, int c) {
	        return Math.min(Math.min(a, b), c);
	    }
	}