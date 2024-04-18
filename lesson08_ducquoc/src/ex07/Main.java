package ex07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLength = 0;
        int currentLength = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
                sb = sb.append(i).append(" ");
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
        String str = sb.toString();
        String[] Array = str.split(" ");
        System.out.println(Arrays.toString(Array));
        String[] longestConsecutive = findLongestConsecutive(Array);
        String[] shortestConsecutive = findShortestConsecutive(Array);
        
        if (longestConsecutive.length > 0) {
        	int a = Integer.parseInt(longestConsecutive[0]);
        	int b =  Integer.parseInt(longestConsecutive[longestConsecutive.length - 1]);
            String sLong = s.substring(a, b);
            System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength + " vị trí bắt đầu " + longestConsecutive[0]
                    + " " + sLong);
        } else {
            System.out.println("Không có dãy con đúng dài nhất.");
        }

        if (shortestConsecutive.length > 0) {
        	int c = Integer.parseInt(shortestConsecutive[0]);
        	int d = Integer.parseInt(shortestConsecutive[shortestConsecutive.length - 1]);
            String sShort = s.substring(c,d);
            System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + shortestConsecutive.length + " vị trí bắt đầu " + shortestConsecutive[0]
                    + " " + sShort);
        } else {
            System.out.println("Không có dãy con đúng ngắn nhất.");
        }
    }

    public static String[] findLongestConsecutive(String[] arr) {
        int maxLength = 0;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == Integer.parseInt(arr[i - 1]) + 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i;
                }
            } else {
                currentLength = 1;
            }
        }

        String[] longestConsecutive = new String[maxLength];
        for (int i = 0; i < maxLength; i++) {
            longestConsecutive[i] = arr[endIndex - maxLength + 1 + i];
        }

        return longestConsecutive;
    }

    public static String[] findShortestConsecutive(String[] arr) {
        int minLength = Integer.MAX_VALUE;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == Integer.parseInt(arr[i - 1]) + 1) {
                currentLength++;
            } else {
                if (currentLength < minLength) {
                    minLength = currentLength;
                    endIndex = i - 1;
                }
                currentLength = 1;
            }
        }

        String[] shortestConsecutive = new String[minLength];
        for (int i = 0; i < minLength; i++) {
            shortestConsecutive[i] = arr[endIndex - minLength + 1 + i];
        }

        return shortestConsecutive;
    }
}
