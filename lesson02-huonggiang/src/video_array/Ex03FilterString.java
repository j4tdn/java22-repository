package video_array;

import java.util.Arrays;

public class Ex03FilterString {

	public static void main(String[] args) {
		int[] numbers = {15,16,17,18,19};
		int[] copied = Arrays.copyOfRange(numbers, 0, 3);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copied));
		
		System.out.println("==================");
		String[] students = {"Peter Croud","KaKa", "Valdes","Patrick Veira"};

	}
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
	
		for(String element: elements) {
			if (element.startsWith("P")) {
				int count=0;;
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result,0,2);
	}

}
