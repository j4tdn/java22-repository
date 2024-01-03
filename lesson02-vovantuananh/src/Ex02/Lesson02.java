package Ex02;

import java.util.Scanner;


/*
 * Mã code ở đây thực hiện các bài:1,2,3,5,7,8
 */
public class Lesson02 {
	
	public static void main (String[] args) {
		int x = NhapN();
		if (x != -1) {
			System.out.println("Bai 1 ");
			bai1(x);
			System.out.println("===================");
			
			System.out.println("Bai 2 \n");
			if(bai2(x)) {
				System.out.println("So N vua nhap la :" + x);
				System.out.println("\nSo N vua nhap la luy thua cua 2");
			}else {
				System.out.println("So N vua nhap la :" + x);
				System.out.println("\nSo N vua nhap khong phai la luy thua cua 2");
			}
			System.out.println("===================");
			
			System.out.println("Bai 3 \n");
			System.out.println("So N vua nhap la :" + x);
			System.out.println("\nGiai thua cua so vua nhap la :" +bai3(x));
			System.out.println("===================");
			
			System.out.println("Bai 5 \n");
			if(bai5(x)) {
				System.out.println("So N vua nhap la :" + x);
				System.out.println("\nSo N vua nhap la so doi xung");
			}else {
				System.out.println("So N vua nhap la :" + x);
				System.out.println("\nSo N vua nhap khong phai la so doi xung");
			}
			System.out.println("===================");
			
			System.out.println("Bai 7 \n");
			String[] ketQua = bai7(x);
			System.out.println("Chuyen " + x + " co so 2: " + String.join("", ketQua));
			System.out.println("===================");
			
			System.out.println("Bai 8 \n");
			if (bai8(x)) {
		            System.out.println(x + " la so nguyen to");
		        } else {
		            System.out.println(x + " khong la so nguyen to");
		        }
			System.out.println("===================");
			
        } else {
            System.out.println("Bạn đã hết số lần nhập. Chương trình kết thúc.");
        }
	}
	
	//Nhap so nguyen N
	public static int NhapN() {
		Scanner sc = new Scanner(System.in);
		int LanNhap = 0;
		
		do {
		System.out.println("Nhap N:");
		if (sc.hasNextInt()) {
			int N = sc.nextInt();
			if(N>0) {
				return N;
			}else {
                System.out.println("Vui long nhap so nguyen duong");
			}
		}else {
			System.out.println("Hay nhap mot so nguyen");
        	sc.next(); 
		}
			
		LanNhap++;
		}while (LanNhap<5);
		
		return -1;
	}
	
	//bai1
	public static void bai1(int N) {
		if(N%2 == 0) {
			System.out.println("So N vua nhap la :" + N);
			System.out.println("\nSo N vua nhap la boi cua 2");
		}else {
			System.out.println("\nSo N vua nhap la :" + N);
			System.out.println("\nSo N vua nhap khong phai la boi cua 2");
		}
	}
	
	//bai2
	public static boolean bai2(int N) {
		
		if(N==1) {
			return false;
		}else {
		while (N>1) {
			if(N%2 != 0) {
				return false;
			}
			N/=2;
		}
		return true;
		}
	}
	
	//bai3
	public static long bai3(int n) {
        long giaiThua = 1;
        
        if (n == 1) {
            return 1;
        }else {
	        for (int i = 2; i <= n; i++) {
	            giaiThua *= i;
	        }
	
	        return giaiThua;
	    }
	}
	
	//bai5
	public static boolean bai5(int N) {
       if(N<10) {
    	   return false;
       }else {
		String chuoiN = Integer.toString(N);
        int doDai = chuoiN.length();
        for (int i = 0; i < doDai / 2; i++) {
            if (chuoiN.charAt(i) != chuoiN.charAt(doDai - 1 - i)) {
                return false; 
            }
        }
        return true; 
       }
	}
	
	//bai7
	public static String[] bai7(int N) {

        int soBit = (int) Math.floor(Math.log(N) / Math.log(2)) + 1;
        String[] ketQua = new String[soBit];

        for (int i = soBit - 1; i >= 0; i--) {
            ketQua[i] = String.valueOf(N % 2);
            N /= 2;
        }

        return ketQua;
    }
	
	//bai8
	public static boolean bai8(int N) {
        if (N == 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}	
