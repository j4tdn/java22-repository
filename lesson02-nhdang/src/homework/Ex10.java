
package homework;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("10. Random 5 số từ 20 đến 30");
        Random rd = new Random();
        int x = 5;
        int[] num = new int[x];
        int check = 0;
//        int d[]=new int[rd.nextInt(20,31)];
        while (check < x) {
            int temp = rd.nextInt(20,31);
            if (isExists(temp, num)) {
                continue;
            }
            num[check] = temp;
            check++;
        }

        System.out.println(Arrays.toString(num));
    }

    public static boolean isExists(int checkNum, int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (checkNum == elements[i]) {
                return true;
            }
        }
        return false;
    }
}

