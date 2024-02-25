package ex03;

public class Main03 {
	public static void main(String[] args) {
		int[] arr1 = {2, 3};
        int[] arr2 = {2, 3, 4};
        
        System.out.println("BCNN của mảng arr1: " + getLCMArr(arr1));
        System.out.println("BCNN của mảng arr2: " + getLCMArr(arr2));
		
	}
	public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	public static int getLCM(int a, int b) {
	   int gcd = getGCD(a, b);
       return (a * b) / gcd;
    }
	public static int getLCMArr(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }
        return lcm;
    }

}
