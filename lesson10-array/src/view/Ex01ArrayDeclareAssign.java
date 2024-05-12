package view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import bean.Item;

public class Ex01ArrayDeclareAssign {

	/*
	 Tinh chat cua mang
	 --> fixed length: muốn thêm , xoá phần tử trong mảng --> trả về mảng mới
	 --> mảng 1, 2, n chiều 
	 	: mảng 1 chiều 1 phần tử là 1 giá trị (KDL nguyên thuỷ/ đối tượng)
	 	: mảng n chiều 1 phần tử là 1 mảng n-1 chiều 
	 --> Mỗi phần tử có thể là KDL nguyên thuỷ hoặc KDL đối tượng
	    VD: int[] --> Mỗi phần tử là int 
	    	String[] --> mỗi phần tử là String 
	 --> nhưng một mảng luôn luôn là KDL đối tượng --> giá trị lưu trữ ở HEAP
	 sử dụng các hàm trong class Object
	 
	 Khai báo mảng: có 2 cachs
	 --> sử dụng từ khoá new 
	 --> gán giá trị trực tiếp với {}
	 */
	
	public static void main(String[] args) {
		
		int[] n1 = new int[8]; //{0,0,0,0,0,0,0,0}
		int[] n2 = new int[] {1, 6, 7, 2, 5};
		int[] n3 = new int[] {1, 6, 7, 2, 5};  //BẮT vuộc dùng new Int
		int[] n4 = mockInts();
		
		// mảng 2 chiều 
		//row = 3
		//col = 4
		int[][] n11 = {
				{1, 2, 3, 5},
				{4, 5, 6, 7},
				{7, 8, 9, 9},
		};
		
		for (int rowI = 0 ; rowI < 3; rowI++) {
			for (int colI = 0; colI < 4; colI++) {
				System.out.print(n11[rowI][colI] + " ");
			}
			System.out.println();
		}
		
		int[][] n12 = {n1, n2, n3, n4};
		System.out.println("--- In mảng n12 ---");
		for (int rowI = 0 ; rowI < n12.length; rowI++) {
			for (int colI = 0; colI < n12[rowI].length; colI++) {
				System.out.print(n12[rowI][colI] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n------------------------\n");
		
		Item[] items = mockAutoItem(8);
		System.out.println("--- In mảng items ---");
		
		for (Item item: items) {
			System.out.println(item);
		}
		
		
		Random rd = new Random();		
		//Lỗi thường gặp NPE với mảng 
		 items = new Item[4]; //{null, null, null ,null}
		System.out.println("items --> " + items);
		System.out.println("items elements -->" + Arrays.toString(items));
		for (Item item: items) {
			item.setId(rd.nextInt(10)); //NPE
		}
	}
	
	private static Item[] mockAutoItem(int n) {
		Item[] items = new Item[n];
		for (int i = 0; i < n; i++) {
			items[i] = new Item(i, "Item A" + i, 12d * i, LocalDate.now().plusDays(i) );
		}
		return items;
	}
	
	private static Item[] mockItems() {
		return new Item[] {
				new Item(1, "Item A1", 12d, LocalDate.of(2024, 5, 5)),
				new Item(2, "Item A2", 12d, LocalDate.of(2024, 6, 6)),
				
		};
	}
	
	private static int[] mockInts() {
		return new int[] {1, 6, 7, 2, 5};
	}
}
