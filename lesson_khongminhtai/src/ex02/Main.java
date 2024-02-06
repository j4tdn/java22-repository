package ex02;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] randomNumbers = generateRandomNumbers(11, 5, 100);

        System.out.println("Dãy số ngẫu nhiên:");
        printArray(randomNumbers);

        int[] divisible7Numbers = filterAndOrder(randomNumbers);
        print("Dãy số chia hết cho 7", divisible7Numbers);
    }

    public static int[] generateRandomNumbers(int length, int min, int max) {
        int[] numbers = new int[length];
        Random randomGenerator = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = randomGenerator.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    public static int[] filterAndOrder(int[] numbers) {
        int[] result = new int[numbers.length];
        int countDivisible7 = 0;
        int countOther = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 7 != 0) {
                result[countOther++] = numbers[i];
            }

            if (numbers[i] % 7 == 0 && numbers[i] % 5 != 0) {
                result[countDivisible7++] = numbers[i];
            }
        }

        int countBothOrNeither = numbers.length - countDivisible7 - countOther;

        System.out.println("Số lượng các số chia hết cho 5: " + countOther);
        System.out.println("Số lượng các số chia hết cho 7: " + countDivisible7);
        System.out.println("Số lượng các số chia hết cho cả 5 và 7 hoặc không chia hết cho cả 5 và 7: " + countBothOrNeither);

        // Thêm các số còn lại vào mảng kết quả
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 5 != 0 && numbers[j] % 7 != 0 || (numbers[j] % 5 == 0 && numbers[j] % 7 == 0)) {
                result[countDivisible7 + countOther] = numbers[j];
                countDivisible7++;
            }
        }

        return result;
    }

    public static void print(String prefix, int[] numbers) {
        System.out.println(prefix + " {");
        for (int number : numbers) {
            System.out.println("  + " + number);
        }
        System.out.println("}\n");
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}
