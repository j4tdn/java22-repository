package view;

import bean.CustomInt;

public class Ex01SwapTest {
       public static void main(String[] args) {
		CustomInt ci1 = new CustomInt(12);
		CustomInt ci2 = new CustomInt(24);
		SwapInt(ci1,ci2);
		System.out.println("ci1----> "+ ci1);
		System.out.println("ci2----> "+ ci2);
		System.out.println("================");
	}
       public static void SwapInt( CustomInt a, CustomInt b) {
		   int temp = a.value;
		   a.value =b.value;
		   b.value =temp;
    	   
       }
       
}
