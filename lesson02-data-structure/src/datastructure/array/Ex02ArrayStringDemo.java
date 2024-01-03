package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		
		String [] students = {"xxxxxx,  yyyyyy, zzzzzz, aaaaa, wwwww"};
		//chọn 2 sv ngẫu nhiên từ ds
		
		//hạn chế: 2 sinh viên có thể trùng
		// Khi cần nhiều sv thì phải lặp đoạn code nhiều lần
		
		//TỔng quát: Chọn k sv trong n sv --> ko trùng nhau
	
		//String first = students[rd.nextInt(students.length)];
		//String second = students[rd.nextInt(students.length)];
		
		//input: students, k
		//output: pickedStudents --> length = k
		int k = 3;
		int running = 0;
		//[null, null, null]
		String [] pickedStudents = new String[k];
		
		while(true) {
			//b1: random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
			
			//b2: kiểm tra xem phần tử này đã được random, chọn trước đó chưa
			// == xem thử phần tử temp đã thuộc trong mảng pickedStudents chưa
			if (isExists(temp, pickedStudents	)) {
				continue;
			}	
			//2.1 nếu đã tồn tại rồi - bỏ qua --> random mới
			
			pickedStudents[running] = temp;
			running ++ ;
			
			//2.2 nếu chưa tồn tại --> gán vào phần tử tiép theo trong pickedStudents
			
			//	--> khi số lượng đưa vào = k = students.length --> dừng lại
			if (running == k) {
				break;
			}
		}
		
		System.out.println("pickedStudents --> " + Arrays.toString(pickedStudents));
		
		
	}
	private static boolean isExists(String checkingElements, String [] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElements == elements[i]) {
				return true;
				// == so sánh giá trị ở STACK --> thay thế bằng cách sử dụng giá trị ở HEAP
			}
		}
		return false;
	}

}
