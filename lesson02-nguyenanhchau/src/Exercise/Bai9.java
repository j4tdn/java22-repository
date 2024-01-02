package Exercise;

public class Bai9 {

	public static void main(String[] args) {
	        System.out.println("So nguyen to thu 200 la: " + TimSNTThu200());
	    }

	private static boolean kiemtraSNTo(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}

		return true;
	}
	    private static int TimSNTThu200() {
	        int dem = 0;
	        int Numcheck = 1;

	        while (dem < 200) {
	            Numcheck++;
	            if (kiemtraSNTo(Numcheck)) {
	                dem++;
	            }
	        }

	        return Numcheck;
	    }
	
	

}
