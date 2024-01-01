package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		String[] students = {"Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh"};
		//BT1: Chọn 2 sinh viên ngẫu nhiên trong danh sách để làm...
		Random rd = new Random();
		/*String first = students[rd.nextInt(students.length)];
		String second = students[rd.nextInt(students.length)];
		System.out.println("first --> " + first);
		System.out.println("second --> " + second);*/
		//Hạn chế: 2 sv có thể trùng
		//       : khi cần nhiều sv thì phải lặp lại đoạn code nhiều lần
		// Tổng quát: Chọn k sv trong n(lenght) sv --> ko trùng nhau
		
		//input: students, k
		//output: pickedStudents --> lenght = k
		
		int k= 3;
		int running = 0;
		String[] pickedStudents = new String[k];
		
		while(true) {
			//B1: random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
			
			//B2: kt xem phần tử này đã đc random, chọn trước đó chưa
			//  = xem thử phần tử temp đã thuộc trong mảng pickedStudents chưa
			if (isExists(temp, pickedStudents)) {
			//2.1 Nếu đã tồn tại rồi --> bỏ qua --> random mới
				continue;
			} 
			//2.2 Nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickedStudents
			pickedStudents[running] = temp;
			running++;
			//  --> khi số lượng đưa vào = k(lenght) --> dừng lại
			if (running == k) {
				break;
			}
		}
		System.out.println("pickedStudents --> " + Arrays.toString(pickedStudents));
		
	}
	private static boolean isExists(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			// == so sánh giá trị ở STACK --> thay thế bằng cách sử dụng so sánh giá trị ở HEAP
			//if (checkingElement == elements[i]) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}

}
