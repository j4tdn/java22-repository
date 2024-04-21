
public class Ex02 {

	public static void main(String[] args) {
		
		String[] ss = { "01a2b3456cde478", "6b326c6e22h"};
		
		
		iterateArray(ss);
	}
	
	
	public static void iterateArray(String[] ss) {
		
		for (String str : ss) {
			findLargestNumberOfString(str);
			
		}
	}
	
	public static void findLargestNumberOfString(String s) {
		String[] element = s.split("[a-z]+");
		int[] temp = new int[element.length];
		for (int i = 0 ; i < element.length ; i++) {
			
			if (element[i].equals("") || (element[i].startsWith("0") && element[i].length() > 1) ) {
				System.out.println("Độ dài chuỗi số này bằng 0");
			}
			else {
				temp[i] = Integer.parseInt(element[i]);
				System.out.println("số hợp lệ -->" + element[i]);
			}
			
		}
		
		System.out.println("Số lớn nhất trong chuỗi -->" + findMax(temp));
//		findMax(temp);
	}
	
	public static int findMax(int[] arr) {    //hàm tìm max trong mảng tạm
		int max = 0;
		for (int i = 0 ; i < arr.length-1 ; i++) {
			if (arr[i] < arr[i+1] ) {
				max = arr[i+1];
			}
		}
		return max;
	}
}
