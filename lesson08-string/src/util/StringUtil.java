package util;

public class StringUtil {
	private StringUtil() {
		
	}
	
	//charSequence là interface cha của String và StringBuilder
	public static void print(String VarName, CharSequence var) {
		System.out.println(VarName + "(value = " + var + ", hash = "+ System.identityHashCode(var)+ ")" );
	}
}
