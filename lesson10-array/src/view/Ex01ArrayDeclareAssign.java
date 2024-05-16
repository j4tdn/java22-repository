package view;

import bean.Item;

public class Ex01ArrayDeclareAssign {
	
	
	public static void main(String[] args) {
		int[] n1 = new int[8];
		int[] n2 = new int[] {1,6,7,2,5};// bắt buộc dùng khi dùng return...
		int[] n3 = {1,6,7,2,5};
		
		int[][] n11 = {
				{1,2,3,5},
				{4,5,6,7},
				{7,8,9,9},
		};
		
		for(int rowI = 0; rowI <3 ; rowI++) {
			for(int colI = 0; colI <4 ; colI++) {
				System.out.println(n11[rowI][colI]);
			}
			System.out.println();
		}
		
		int[][] n12 = {n1,n2,n3};
		
		for(int rowI = 0; rowI <n12.length ; rowI++) {
			for(int colI = 0; colI <n12[rowI].length ; colI++) {
				System.out.println(n12[rowI][colI]);
			}
			System.out.println();
		}
		
		System.out.println("\n ======================");
		
		Item[] items = new Item[4];
		
	}
	
	private static int[] mockInt(){
		return new int[] {1,6,7,2,5};
	}
	
	
}
