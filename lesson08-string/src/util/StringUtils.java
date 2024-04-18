package util;

public class StringUtils {

	private StringUtils() {
		
	}
	
	public static void print(String varName, CharSequence var) {
		System.out.println(varName + "(value " + var + ", hash= " + System.identityHashCode(var) + ")");

	}
}
