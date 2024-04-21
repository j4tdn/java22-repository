package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = "01a2b3456cde478";
		String s1 = s.replaceAll("[a-z]", " ");
//		StringBuilder sb = new StringBuilder();
		String[] strArray = s1.split("\\s+");
		int max = 0;
		
		for(int i =0 ; i<strArray.length; i++) {
			String s2 = strArray[i];
			int a =Integer.parseInt(s2);
			if(a >= max ) {
				max = a;
			}
		}
		System.out.println(max);
	}
	}
