import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {

		String text = "Welcome      to  jAVA10   class";
		revert(text);

	}

	public static void revert(String s) {
		String Result = "";
		s = s.strip().replaceAll("\\s{1,}", " ");
		String[] arr = s.split(" ");
		for (String x : arr) {
			for (int i = x.length() - 1; i >= 0; i--) {

				System.out.print(x.charAt(i));
			}
			System.out.print(" ");

		}

	}
}
