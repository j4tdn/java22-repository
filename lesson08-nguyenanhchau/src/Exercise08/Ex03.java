package Exercise08;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi tieng viet:");
        String string = scanner.nextLine();
        
        String output = removeMark(string);
        System.out.println("Chuoi khong dau: " + output);
    }
    public static String removeMark(String input) {
        String removeMarkstring = Normalizer.normalize(input, Normalizer.Form.NFD);
        return removeMarkstring.replaceAll("[^\\p{ASCII}]", "");
    }
    
}
