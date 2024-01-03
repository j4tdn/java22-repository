import java.util.Random;
public class ex10 {
	

	    public static void main(String[] args) {
	        Random random = new Random();

	        System.out.println("5 số nguyên ngẫu nhiên từ 20 đến 30:");
	        for (int i = 0; i < 5; i++) {
	            int soNgauNhien = random.nextInt(11) + 20; 
	            System.out.println(soNgauNhien);
	        }
	    }
	}



