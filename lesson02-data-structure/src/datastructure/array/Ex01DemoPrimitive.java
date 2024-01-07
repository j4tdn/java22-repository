package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01DemoPrimitive {
	
public static void main(String[] args) {
		
		//1 --> Khai báo, khởi tạo mảng
		
		//Mảng: là kiểu dữ liệu đối tượng --> giá trị lưu ở HEAP
		//	  : Số lượng phần tử cố định 
		//    --> khai báo thì phải khai báo số lượng phần tử cho nó 
		//    : chỉ số bắt đầu từ 0 -->length-1
		//    : giá trị mặc định phụ thuộc vào KDL của từng phần tử trong mảng 
		
		//Cách 1: Khai báo và khởi tạo mảng với giá trị mặc định
		int[] digits = new int[8];  //vì mảng trong java là kiểu đối tượng nên phải để [] ngay sau int 
		
		//gán, cập nhật giá trị cho phần tử trong mảng
		digits[2] = 123;
		digits[4] = 852;
		
		
		//In nhanh 1 mảng
		System.out.println("digits --> " + Arrays.toString(digits));
		
		System.out.println("digits length: " + digits.length);
		System.out.println("digits[5] --> " + digits[5]);
		
		//Cách 2: Khai báo và khởi tạo giá trị cho mảng
		//int[] numbers = fetchData();
		//int[] numbers = new int[] {47, 86, 95, 15, 34};
		int[] numbers = {47, 86, 95, 15, 34};
		
		//BT1 --> Lấy 1 phần tử ngẫu nhiên trong mảng numbers
		Random rd = new Random();
		int randomValue = numbers[rd.nextInt(numbers.length)];
		System.out.println("randomValue --> " + randomValue);
		
	}
	
	public static int[] fetchData() {
		return new int[] {47, 86, 95, 15, 34};
	}
}
