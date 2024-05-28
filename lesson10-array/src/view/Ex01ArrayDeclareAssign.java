package view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import bean.Item;

public class Ex01ArrayDeclareAssign {
	/*
	 Tính chất của mảng:
	 --> fixed length: muốn thêm, xóa phần tử trong mảng --> trả về mảng mới
	 --> mảng 1,2,..,n chiều
	     : mảng 1 chiều 1 phần tử là 1 giá trị(KDL nguyên thủy/đối tượng)
	     : mảng n chiều 1 phần tử là mảng n-1 chiều
	 --> mỗi phần tử có thể là KDL nguyên thủy/đối tượng
	     VD: int[]    --> mỗi phần tử là int
	         String[] --> mỗi phần tử là String
	 --> nhưng một mảng luôn luôn là KDL đối tượng --> giá trị lưu trữ ở HEAP
	     sử dụng các hàm trong class Object
	 Khai báo mảng : có 2 cách
	 --> sử dụng từ khóa new
	 --> gán giá trị trực tiếp với {}
	 */
	public static void main(String[] args) {
		int[] n1 = new int[8]; // {0, 0, 0, 0, 0, 0, 0, 0}
		int[] n2 = {1, 6, 7, 2, 5};
		int[] n3 = new int[] {1, 6, 7, 2, 5}; // bắt buộc khi return
		int[] n4 = mockInts();
		
		System.out.println("n2/eq/n3 --> " + n2.equals(n3));
		System.out.println("n2 class: " + n2.getClass());
		
		// mảng 2 chiều
		// rows = 3, cols = 4 --> mỗi dòng số cột = nhau
		int[][] n11 = {
			{1, 2, 3, 5},
			{4, 5, 6, 7},
			{7, 8, 9, 9},
		};
		System.out.println("--In mảng n11--");
		for (int rowI = 0; rowI < 3; rowI++) {
			for (int colI = 0; colI < 4; colI++) {
				System.out.println(n11[rowI][colI] + " ");
			}
			System.out.println();
		}
		// mảng 2 chiều
		// rows =4(4 phần tử), cols = ?
		int[][] n12 = {n1, n2, n3, n4};
		System.out.println("--In mảng n12--");
		for (int rowI = 0; rowI < n12.length; rowI++) {
			for (int colI = 0; colI < n12[rowI].length; colI++) {
				System.out.println(n12[rowI][colI] + " ");
			}
			System.out.println();
		}
		System.out.println("\n================\n");
		Item[] items = mockAutoItems(8);
		System.out.println("--In mảng items--");
		for (Item item: items) {
			System.out.println(item);
		}
		Random rd = new Random();
		items = new Item[4];// {null, null, null, null}
		System.out.println("Item --> " + items);
		System.out.println("items elements --> " + Arrays.toString(items));
		for (Item item: items) {
			item.setId(rd.nextInt(10));
		}
		
	}
	private static Item[] mockAutoItems(int n) {
		Item[] items = new Item[n];
		for (int i = 0; i < n; i++) {
			items[i] = new Item(i, "Item A" + i, 12d * i, LocalDate.now().plusDays(i));
		}
		return items;
	}
	private static Item[] mockItems() {
		return new Item[] {
				new Item(1, "Item A1", 12d, LocalDate.of(2024, 5, 5)),
                new Item(2, "Item A2", 24d, LocalDate.of(2024, 6, 6))
     };
	}
	private static int[] mockInts() {
		return new int[]{1, 6, 7, 2};
	}

}
