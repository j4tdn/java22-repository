package util;

public class StringUtils {
	private StringUtils(){
		
	}
	public static void print ( String varName, String var) {
		System.out.println(varName + "(value =" + var + ", hash =" +System.identityHashCode(var)+ ")" );
	}
	public static void print ( String varName, StringBuilder var) {
		System.out.println(varName + "(value =" + var + ", hash =" +System.identityHashCode(var)+ ")" );
	}

}