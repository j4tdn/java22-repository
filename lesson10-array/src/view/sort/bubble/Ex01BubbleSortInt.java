package view.sort.bubble;

import java.util.Arrays;

import functional.CompareInt;

public class Ex01BubbleSortInt {
	
	public static void main(String[] args) {
		
		/*
		 Sắp xếp là sự kết hợp giữa duyệt và hoán vị
		 
		 Thuật toán sắp xếp nổi bọt:
		 --> Mảng có N phần tử 
		 --> Cho 1 vòng lặp chạy từ 0 < N --> từng round
		 --> Trong mỗi round, cho duyệt từ 0 < N - i - 1, so sánh từng cặp giá trị kề nhau
		 nếu chưa nằm đúng vị trí, hoán vị
		 nếu đã đúng vị trí, tiếp tục phần tử khác
		 Đúng: nếu tăng dần trước < sau
		  	 : 	   giảm dần		  >
		 + cứ sau mỗi round là đc 1 phần tử lớn, nhó nhất nằm bên phải
		 + duyệt các phần tử ko cần phải so sánh với các phần tử
				
		 */
		int[] elements = {1,5,11,9,4,6};
		
		bubbleSort(elements, (e1,e2) -> {
			//tăng dần, trước > sau --> Hoán vị
			if(e1 > e2) {
				return 1; // > 0
			}
			return -1;	  // <= 0
		});
		
//		bubbleSortAsc(elements);
		System.out.println("bubble sort(asc)--> " + Arrays.toString(elements));
		
		bubbleSort(elements, (e1,e2) -> {
			//giảm dần, trước < sau --> Hoán vị
			if(e1 < e2) {
				return 1;
			}
			return -1;
		});
//		bubbleSortDsc(elements);
		System.out.println("bubble sort(dsc)--> " + Arrays.toString(elements));
	}
		
		// (elements[j] > elements[j+1])
		// (elements[j] < elements[j+1])
		//--> boolean compare(int e1, int e2)
		
		// (elements[j] - elements[j+1]) > 0 (chọn mặc định tăng dần)
		// (elements[j] - elements[j+1]) < 0 
		//-->int compare(int e1, int e2)
	
	//nếu thỏa mãn > 0 ==> Hoán vị
	private static void bubbleSort(int[] elements, CompareInt cpInt) {
		int length = elements.length;
		for(int i = 0; i <length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (cpInt.compare(elements[j], elements[j+1]) > 0) { /////
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}
	
	private static void bubbleSortAsc(int[] elements) {
		int length = elements.length;
		for(int i = 0; i <length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (elements[j] > elements[j+1]) { /////
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}

	private static void bubbleSortDsc(int[] elements) {
		int length = elements.length;
		for(int i = 0; i <length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (elements[j] < elements[j+1]) {   ////
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}
	

}
