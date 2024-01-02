package Exercise;

import java.util.Arrays;
import java.util.Random;

public class Bai10 {

	public static void main(String[] args) {
        int[] array  = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int Number;
            do {
                Number = random.nextInt(11) + 20; 
                } while (kiemTraTrung(array, Number, i));//True la trung --> tiep tuc random

            array[i] = Number;
        }

        System.out.println("5 so ngau nhien khong trung : " + Arrays.toString(array));

	}
	private static boolean kiemTraTrung(int[] arr, int so, int x) {
        for (int i = 0; i < x; i++) {
            if (arr[i] == so) {
                return true; 
            }
        }
        return false;
    }

}
