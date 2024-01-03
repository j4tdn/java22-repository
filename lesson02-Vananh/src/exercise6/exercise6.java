package exercise6;

import java.util.Iterator;
import java.util.Scanner;

public class exercise6 {
  public static int checkSoNguyen(String s) {
	  Scanner sc = new Scanner(System.in);
	  int number = 0;
	  while(true) {
		  System.out.println(s);
		  String input = sc.next();
         try {
        	 number = Integer.parseInt(input);
        	 if( number >=0 && number <20) {
        		 break;
        	 }else{
                 System.out.println("nhap tu 0-19");
             }
        	 
		} catch (NumberFormatException e) {
			System.err.println("Khong dung dinh dang so");

			continue;
			
	  }
  }
	  return number ;
}
  public static int checkMax(int[] numbers) {
	 int  maxNum =numbers[0];
	 for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] > maxNum) {
             maxNum = numbers[i];
         }
     }
     return maxNum;
 }
	  
  public static int checkMin(int[] numbers) {
      int minNum = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] < minNum) {
              minNum = numbers[i];
          }
      }
      return minNum;
  }
public static void main(String[] args) {
	  int[] numbers = new int[3];

      for (int i = 0; i < numbers.length; i++) {
          numbers[i] = checkSoNguyen("Nhập số thứ " + (i + 1) + ": ");
      }

      int maxNum = checkMax(numbers);
      int minNum = checkMin(numbers);
      System.out.println("Số lớn nhất là " + maxNum);
      System.out.println("Số nhỏ nhất là " + minNum);
  }
}


