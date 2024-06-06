package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListPrinciple {
	/*
	 Array:
	  - Tạo 1 mảng kích thước n
	  - Khi add mới 1 phần tử vào Array --> luôn tạo mảng mới(copy các ptu cũ qua + ptu mới)
	  
	 ArrayList(Object[] elementData)
	  - Dùng hàm khởi tạo rỗng(new ArrayList<>()) tạo mảng(elementData) có kích thước là 0
	  --> Khi add mới phần tử đầu tiên vào ArrayList
	  	--> tạo mảng mới có default length = 10 --> gán cho elementData
	  	--> gán elementData[0] = value
	  --> Khi add mới các phần tử tiếp theo
	    --> nếu size chưa vượt quá length của elementData --> đưa phần tử mới đó vào elementData
	    --> nếu size vượt quá							  --> grow tạo mảng mới với newLength, copy phần tử cũ của elementData
	    
	   size: số lượng phần tử của ArrayList(ở trong elementData)
	   capacity: sức chứa có thể lưu trữ của ArrayList chính là length của elementData
	   * size <= elementData.length(capacity)
	   
	  1. Hỗ trợ các hàm xử lý
	  2. Khi thêm mới phần tử vào ArrayList
	     -> kiểm tra size = capacity chưa
	     	--> chưa thì đưa phần tử mới đó vào elementData, tăng size
	     	--> rồi thì tạo mảng mới với capacity mới, copy mảng cũ qua, đưa phần tử mới vào, tăng size
	  
	  Hạn chế đc việc tạo mảng mới liên tục khi add như là Array   	
	  Dynamic size
	  
	  
	  
	 */
	
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("a1");
		elements.add("b1");
		
		System.out.println("elements have size = " + elements.size());
	}
}
