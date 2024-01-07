package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = {"Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh"};
		
		//BT1: Chọn 3(k) sinh viên ngẫu nhiên trong danh sách để làm ...
		
		//Hạn chế: 2 sinh viên có thể trùng
		//         : khi cần nhiều sinh viên thì phải lặp lại đoạn code nhiều lần
		
		//Tổng quát: Chọn 'k' sv trong n(length) sv --> ko trùng nhau 
		
//		String first = students[rd.nextInt(students.length)];
//		String second = students[rd.nextInt(students.length)];
		
		//input: students, k, 
		//output: pickedStudents --> length = k
		
		int k = 3;
		int running = 0;
		// [null, null, null] -->
		String[] pickedStudents = new String[k];
		
		while(true) {
			// B1: random ra 1 phần tử 
			String temp = students[rd.nextInt(students.length)];
			
			//B2: kiểm tra xem phần tử này đã dc random, chọn trước đó chưa 
			//  == xem thử phần tử temp đã thuộc trong mảng pickedStudents chưa
			
			if (isExists(temp, pickedStudents)) {
				continue;
			}
			
			//2.1 Nếu đã tồn tại rồi --> bỏ qua --> random thằng mới
			
			//2.2 Nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickedStudents
			pickedStudents[running++] = temp;
			
			
			if (running == k) {
				break;
			}
			// --> khi số lượng đưa vào = k = students.length --> dừng lại  
			
		}
		System.out.println("pickedStudents --> " + Arrays.toString(pickedStudents));
		
		
		//String[] --> Lưu những tên đã dc chọn --> length = k
		
		
	}
	
	private static boolean isExists(String checkingElement, String []elements) {
		for (int i = 0; i < elements.length ; i++ ) {
			// == so sánh giá trị ở STACK --> thay thế bằng cách sử dụng so sánh giá trị ở HEAP
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
}
