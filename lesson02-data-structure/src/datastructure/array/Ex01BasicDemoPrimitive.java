package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
   public static void main(String[] args) {
	// 1- khai bao mang
	   // mang la kieu du lieu doi tuong==> luu tru o HEAP
	   //: so luong phan tu co dinh, phai khai bao so luong phan tu cho no
	   // gia tri mac dinh phu thuoc KDL cua tung phan tu trong mang
	   // cach 1: khai bao va khoi tao 
	   // digits --> 0,0,0,0,0
	   int[] digits = new int[8];
	   // gan, cap nhat gia tri cho phan tu trong mang
	   digits[2] =123;
	   digits[4] = 852;
	   // in nhanh 1 mang
	   System.out.println("digits--->"+ Arrays.toString(digits));
	  
	  System.out.println("\n==================\n");
	  
	  // cach 2: khai bao va tao gia tri cho mang
		/* int[] number = new int[] {37,86,95,15,34}; */
	  // int[ numbers = fetchData();
	  int[] number = {37,86,95,15,34};
	  
	  // BT1 --> Lay 1 phan tu ngau nhien trong mang numbers
	  Random rd = new Random();
	 int  randomValue = number[rd.nextInt(number.length)];
	 System.out.println("randomValue---->"+ randomValue);
	 
}
   private static int[] fetchData() {
	   return new int[] {37,86,95,15,34};
   }
}
