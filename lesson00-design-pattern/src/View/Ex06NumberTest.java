package View;

import java.util.Arrays;

import bean.Book;

public class Ex06NumberTest {
	public static int[] main(String[] args) {
		int[] Number = {1,5,7,9,2,33,20,17};
		
		private static int[] Find(int[] number, Intcheck intcheck) {
			int[] result = new int[number.length];
			int count = 0;
			for (int numbers: number) {
				if (intcheck.check(numbers)) {
					result[count++] = numbers;
				}
			}
			return Arrays.copyOfRange(result, 0, count);
		}
	}
}
