package ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
        int[] sortedNumbers = sortNumbers(numbers);
        System.out.print("Output: ");
        for (int num : sortedNumbers) {
            System.out.print(num + ", ");
        }
    }

    public static int[] sortNumbers(int[] arr) {
        List<Integer> divisibleBy7 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 7 == 0 && num % 5 != 0) {
                divisibleBy7.add(num);
            } else if (num % 5 == 0 && num % 7 != 0) {
                divisibleBy5.add(num);
            } else {
                otherNumbers.add(num);
            }
        }
        List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(divisibleBy7);
        sortedList.addAll(otherNumbers);
        sortedList.addAll(divisibleBy5);

        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < sortedList.size(); i++) {
            sortedArray[i] = sortedList.get(i);
        }
        return sortedArray;
    }
}
