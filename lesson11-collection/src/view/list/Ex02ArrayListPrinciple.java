package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListPrinciple {
	// Array
	// --> Tạo mảng có kích thước n 
	// --> Khi add mới 1 phần tử vào Array --> luôn tạo mảng mới(copy các ptu cũ qua + ptu mới)
	// length
	
	// ArrayList(Object[] elementData)
	// --> Dùng hàm khởi tạo rỗng(new ArrayList<>()) tạo mảng(elementData) có kích thước là 0
	// --> khi add mới phần tử đầu tiên vào ArrayList
	// 	   --> tạo mảng mới có default length = 10 --> gán cho elementData 
	// 	   --> gán elementData[0] = value
	
	// --> khi add mới các phần tử tiếp theo
	//	   --> nếu size chưa vượt quá length của elementData --> đưa phần tử mới đó vào elementData và tăng lên 1 đơn vị
	// 	   -->	   size vượt quá --> grow tạo mảng mới với newLength, copy phần tử cũ vào elementData
	
	// size = 5
	// elementData.length = 10
	
	// size: số lượng phần tử của ArrayList(thật sự chứa trong elementData)
	// capacity: sức chứa có thể lưu trữ của ArrayList chính là length của elementData
	// size <= elementData.length(capacity)
	
	// 1. Hỗ trợ các hàm xử lý
	// 2. Khi thêm mới phần tử vào ArrayList
	// 	 B1: Kiểm tra size đã = capacity chưa
	//	   : nếu chưa = --> đưa phần tử mới đó vào elementData, tăng size
	//	   : nếu rồi 	--> tạo mảng mới với capacity mới, copy mảng cũ qua, đưa ptu mới vào, tăng size
	
	// Hạn chế việc tạo mảng mới liên tục khi add như Array
	// Dynamic size
	 
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("A1"); // size = 1
		elements.add("B1"); // size = 2
		elements.add("C1"); // size = 3
		elements.add("D1"); // size = 4
		elements.add("E1"); // size = 5
		elements.add("F1"); // size = 6
		elements.add("G1"); // size = 7
		elements.add("H1"); // size = 8
		elements.add("I1"); // size = 9
		elements.add("K1"); // size = 10
		
		elements.add("w1");
		
		System.out.println("element has size = " + elements.size());
		
		// Phân biệt cách hoạt động của Array và ArrayList khi
		// + khởi tạo
		// + thêm mới phần tử
		
	}

}
