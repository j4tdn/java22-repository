package view;

import java.util.Arrays;
import java.util.Random;

public class Ex10Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] number = new int[]{20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int k = 5;
        int running = 0;
        int[] picknumber = new int[k];
        while (true) {
            int temp;
            if (Ex10Random.isExists(temp = number[rd.nextInt(number.length)], picknumber)) {
                continue;
            }
            picknumber[running] = temp;
            if (++running == k) break;
        }
        System.out.println("picknumber --> " + Arrays.toString(picknumber));
    }

    private static boolean isExists(int temp, int[] elements) {
        int i = 0;
        while (i < elements.length) {
            if (temp == elements[i]) {
                return true;
            }
            ++i;
        }
        return false;
    }