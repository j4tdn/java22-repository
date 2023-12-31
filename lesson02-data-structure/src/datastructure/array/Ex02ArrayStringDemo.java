package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {

	public static void main(String[] args) {
		Random rd=new Random();
		String[] students = {"Le Teo","Hoang A","Van Nam","Ngoc Tai","Dao Anh"};
		
		//bt1: chọn 3(k) sinh viên ngẫu nhiên trong danh sách để làm
		
		//hạn chế: 2 sinh viên có thể trùng
		//		:khi cần nhiều sv thì phải lặp đoạn code nhiều lần	
		
		//tổng quát: chọn 'k' sv trong n(length) sv --> ko trùng nhau
		
		
		//input: students, k
		//output: pickedStudents --> length = k
		int k = 3; //[null,null,null] 
		int running = 0;
		String[] pickedStudent = new String[k]; 
		
		while(true) {
			//B1: random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
			
			//B2:kiểm tra phần tử đã được random, chọn trước đó chưa
			// 	== xem thử phần tử temp đã thuộc mảng pickStudents chưa
			if(isExists(temp,pickedStudent)) {
				//2.1. Nếu đã tồn tại->bỏ qua -> random mới
				continue;
			}		
			
			//2.2. Nếu chưa tồn tại->đưa/gán vào phần tử tiếp theo trong pickedStudent
			pickedStudent[running++] = temp;
			
			// 	--> khi số lượng đưa vào = k = student.length -->dừng lại
			if(running==k) {
				break;
			}
		}
		System.out.println("pickedStudent-->"+ Arrays.toString(pickedStudent));
		
	}
	private static boolean isExists(String checkingElements,String[] elements) {
		for(int i=0; i < elements.length; i++) {
			// == so sánh ở STACK
			//if(checkingElements == elements[i]) {
			if (checkingElements.equals(elements[i])) {
				 return true;				 
			}
		}
		return false;
	}

}