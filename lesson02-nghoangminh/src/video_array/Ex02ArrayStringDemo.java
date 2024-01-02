package video_array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		String s1 = "hello"; //H1
		String s2 = "hello"; //H1
		String s3 = "halla";
		System.out.println("--- s1==s2 --- " + (s1==s2));
		System.out.println("--- s1==s3 --- " + (s1==s3));

		 Random rd = new Random();
		
		String[] students = {"Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh"};
		
		// BT1: Chọn 3(k) sinh viên ngẫu nhiên trong danh sách để làm ...
		// Tổng quát: Chọn k sv trong n(length) sv --> ko trùng nhau
		// String first = students[rd.nextInt(students.length)];
		// String second = students[rd.nextInt(students.length)];
		
		// input: students, k
		// output: pickedStudents --> length = k
		
		int k = 3;
		int running = 0;
		String[] pickedStudents = new String[k];
		
		while(true) {
			// B1: Random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
			
			// B2: Kiểm tra xem phần từ này đã được random, chọn trước đó chưa
			//  == xem thử phần tử temp đã thuộc trong mảng pickedStundets chưa
			if(isExists(temp, pickedStudents)) {
				// 2.1 Nếu đã tồn tại --> bỏ qua --> random thằng mới
				continue;
			}
			// 2.2 nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickedStudents
			pickedStudents[running++] = temp;
	
			// 		--> khi số lượng đưa vào = k = students.length --> dừng lại
			if(running == k) {
				break;
			}
		}
		System.out.println("pickedStundets --> " + Arrays.toString(pickedStudents));
		
		// String[] --> lưu những tên đã được chọn --> length = k
	}
	private static boolean isExists(String checkingElement, String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			// if(checkingElement == elements[i]) {
			if(checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
		
	}
}
