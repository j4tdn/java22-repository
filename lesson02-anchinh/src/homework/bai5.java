package homework;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

/*
 * Viết chương trình kiểm tra N có phải là số đối xứng hay không
Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
 */
public class bai5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip;
		do {
			System.out.print("Nhập n có tối thiểu(ít nhất) 2 chữ số : ");
		    ip = sc.nextLine();
		}while(!checkNumber(ip));
		sc.close();
		
		int n = Integer.parseInt(ip);
		if(checkSĐX(n)) {
			System.out.println(n + "-> true");
		}else {
			System.out.println(n + "-> false");
			
		}
	}
	public static boolean checkNumber(String N) {
		String number = String.valueOf(N);
		if(number.length() < 2) {
			System.out.println("->");
			return false;
		}
		else if(!number.matches("\\d+")) { //kiểm tra chữ cái
			System.out.println("lỗi số không hợp lệ");
			return false;
		}
		return true;
		
	}
	public static boolean checkSĐX(int number) {
		int reverse = 0;
        int temp = number;
        
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }        
        return reverse == number;
    }			
}

