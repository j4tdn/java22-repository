package view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import bean.Item;

public class Ex01ArrayDeclareAssign {
	/*
	 Tính chất của mảng:
	 --> fixed-length: muốn thêm, xóa phần tử trong mảng -> trả về mảng mới
	 --> mảng 1, 2, n chiều
	 	: mảng 1 chiều 1 phần tử là 1 giá trị(KDL nguyên thủy/ đối tượng)
	 	: mảng n chiều thì 1 phần tử là 1 mảng n - 1 chiều
	 --> mỗi phần tử có thể là kdl nguyên thủy hoặc kdl đối tượng
	 VD: int[] --> mỗi phần tử là kiểu int
	 	 String[] --> mỗi phần tử là kiểu string
	 	 
	 --> nhưng 1 mảng luôn là kdl đối tượng --> giá trị lưu ở HEAP
	 	 sử dụng các hàm trong class Object
	 	 
	 Khai báo mảng: có 2 cách
	 --> sử dụng từ khóa new
	 --> gán giá trị trực tiếp với {}
	 
	 
	 
	 */
	public static void main(String[] args) {
		int[] n1 = new int[8]; //{0,0,0,0,0,0,0,0}
		int[] n2 = {1, 6, 7, 2, 5};
		int[] n3 = new int[] {1, 6, 7, 2, 5}; //bắt buộc dùng new int[] {..} khi return
		int[] n4 = mockInts();
		
		System.out.println("n1-eq-n2 --> " + n1.equals(n2));
		System.out.println("n2 class--> " + n2.getClass());
		
		//mảng 2 chiều
		// rows = 3, columns = 4
		// mỗi dòng số cột = nhau
		int[][] n11 = {
				{1,2,3,5},
				{4,5,6,7},
				{7,8,9,9},
		};
		System.out.println(">>>In mảng n11>>>");
		for(int rowI = 0; rowI < 3; rowI++) {
			for(int colm = 0; colm < 4; colm++) {
				System.out.print(n11[rowI][colm] + " ");
				
			}
			System.out.println();
		}
		
		//mảng 2 chiều có row = 4 (4 phần tử), col ko xác định
		
		int[][] n12 = {n1, n2, n3, n4};
		System.out.println(">>>In mảng n12>>>");
		for(int rowI = 0; rowI < n12.length; rowI++) {
			for(int colm = 0; colm < n12[rowI].length; colm++) {
				System.out.print(n12[rowI][colm] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("\n----------------------\n");
		
		Item[] items = mockAutoItems(8);

		System.out.println(">>>In mảng Items>>");
		for(Item item : items) {
			System.out.println(item);
		}
		
		//--> Lỗi thường gặp với mảng ->NPE
		Random rd = new Random();  //{null, null, null, null}
		items =  new Item[4];
		System.out.println("items-->" + items);
		System.out.println("items elements-->" + Arrays.toString(items));
		
		for(Item item : items) {
			item.setId(rd.nextInt(10)); //--> NPE
		}
	}
	private static Item[] mockAutoItems(int n) {
		Item[] items = new Item[n];
		for(int i = 0; i < n; i++) {
			items[i] = new Item(i, "Item a" + i, 12d * i, LocalDate.now().plusDays(i));
					
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
		return new int[] {1, 6, 7}; 
	}
}
