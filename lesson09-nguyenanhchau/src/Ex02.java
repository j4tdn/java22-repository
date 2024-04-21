import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		String a = "01a23456cde477";
		String b ="aa6b546c6e22h";
		String c ="aa6b364c6e22h";
		
		getLargestNumbers(a,b,c);
	}
	public static void getLargestNumbers(String ...s) {
		String[] resultMax = new String[5] ;
		for( String x : s) {
			String[] text = x.strip().replaceAll("[a-z]+", " ").split(" ");
			//System.out.print(Arrays.toString(text));
				for(int i = 0 ; i < text.length ; i++) {
					resultMax[i] = maxNumber(text);	
					
				}
				System.out.print(Arrays.toString(resultMax));
		}		//return resultMax;
	}

	public static String maxNumber(String[] arr) {
		String maxNumber = "";
		for (int i = 1; i < arr.length; i++) {
			maxNumber = arr[i - 1];
			if (Integer.parseInt(maxNumber) < Integer.parseInt(arr[i])) {
				maxNumber = arr[i];
			}
		}

		return maxNumber;
	}

}
