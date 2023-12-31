package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {

	public static void main(String[] args) {
		//1--> khai báo, khơi tạo mảng
		
		//Mảng là kdl đối tượng, giá trị lưu ở Heap
		//Mảng: có số lượng phần tử cố định
		//     --> khai báo phần tử cho nó
		//     :chỉ số bắt đầu từ 0 -->length-1 
		//		:giá trị mặc định phụ thuộc vào kdl của từng phần tử trong mảng
				
		//Cách 1
		int[] digits = new int[8];
		
		//gán, cập nhật giá trị cho phần tử trong mảng
		digits[2]=123;
		digits[4]=852;
		
		
		//in nhanh 1 mảng
		System.out.println("digits-->"+Arrays.toString(digits));
		System.out.println("digit length:" + digits.length);
		System.out.println("digits[5]--> "+digits[5]);
		
		System.out.println("=============================\n");
		
		//Cách 2: khai báo và khởi tạo giá trị cho mảng
//		int[] numbers = fetchData();
//		int[] numbers = new int[] {47,86,95,15,34};
		int[] numbers = {47,86,95,15,34};
		//bt0 -->Tìm những phần tử lẻ trong mảng
		for(int i=0; i<numbers.length;i++) {
			int currentNumber=numbers[i];
			if(currentNumber % 2 != 0) {
				System.out.println("lẻ --> " + currentNumber);
			}
		}
		
		
		//bt1 --> lấy 1 phần tử ngẫu nhiên trong mảng numbers
		Random rd=new Random();
//		int index=rd.nextInt(numbers.length);
//		numbers[index];
		int randomvalue = numbers[rd.nextInt(numbers.length)];
		System.out.println("randomvalue-->"+randomvalue);
		
	}
	public static int[] fetchData() {
		return new int[] {47,86,95,15,34};
	}

}
