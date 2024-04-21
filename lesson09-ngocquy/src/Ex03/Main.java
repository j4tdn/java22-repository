package Ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = "Welcome  to    JAVA10   class";
		s = s.strip().replaceAll("\\s{1,}", " ");
		String[] elements = s.split("\s");
            StringBuilder reversedString = new StringBuilder();
            for(int i = elements.length - 1; i >= 0; --i) {
                reversedString.append(elements[i]);
                if (i != 0) {
                    reversedString.append(" ");
                }
            }
            for(int i = reversedString.length() - 1; i >= 0; --i) {
                System.out.print(reversedString.charAt(i));
            }
        }
	}

