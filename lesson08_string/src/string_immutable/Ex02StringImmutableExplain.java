package string_immutable;
import static utils.String_utils.*;
public class Ex02StringImmutableExplain {
	public static void main(String[] args) {
		String l1 = " he lo";
		String l2 = " xin chao";
		String l3 = " he lo";
		String l4 = " xin chao";
		
		
		
		System.out.println("hash s3 = " + System.identityHashCode(l1));
		System.out.println("hash s3 = " + System.identityHashCode(l3));
		print("l1" , l1);
		print("l2" , l2);
		print("l3" , l3);
		print("l4" , l4);
		System.out.println("\n ========================");
		String s1 = "cooking";
		String s2 = "cooking";
		System.out.println("hash s1 = " + System.identityHashCode(s1));
		System.out.println("hash ss = " + System.identityHashCode(s2));
	}
}
