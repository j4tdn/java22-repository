package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListPrinciple {
	public static void main(String[] args) {
		// Phân biệt cách hoạt động của Array và ArrayList
		// + khởi tạo
		// + thêm mới phần tử
		
		// Array --> Tạo 1 mảng có kích thước n
		// --> khi add mới 1 phần tử vào array --> luôn tạo mảng mới(copy các ptu cũ qua + ptu mới)
		
		
		// ArrayList(Object[] elementsData)
		// --> Dùng hàm khởi tạo rỗng tạo mảng rỗng(new ArrayList<>()) có kích thước là 0
		// --> Khi add mới phần tử đầu tiên vào ArrayList
		//    --> tạo mảng mới có default length = 10 --> gán cho elementsData
		//    --> gán elementData[0] = value
		// --> Khi add mới các phần tử tiếp theo
		//    --> nếu size chưa vượt quá length của elementData --> đưa phần tử mới đó vào elementData
		//    -->          vượt quá --> grow tọa mảng mới với newLength, copy phần tử cũ của elementData
		
		// size: số lượng ptu của ArrayList
		// capacity: sức chứa có thể lưu trữ của ArrayList chính là length của elementsData
		// size =
		
		// 1. Hỗ trợ xác hàm xử lý
		// 2. Khi thêm mới phần tử vào ArrayList
		//   Kiểm tra sĩe đã = capacity chưa
		//     Nếu chưa = --> đưa phần tử mới đó vào elementData, tăng size
		//     Nếu rồi    --> tạo mảng mới vs capacity mới, copy mảng cũ, đưa ptu mới vào, tăng size
		
		// Hạn chế việc tạo mảng mới liên tực khi add như là array
		
		List<String> elements = new ArrayList<>();
		elements.add("A1");//size = 1
		elements.add("B1");//size = 2
		elements.add("C1");//size = 3
		elements.add("D1");//size = 4
		elements.add("E1");//size = 5
		elements.add("F1");//size = 6
		elements.add("G1");//size = 7
		elements.add("H1");//size = 8
		elements.add("I1");//size = 9
		elements.add("K1");//size = 10
		
		elements.add("W1");
		
		System.out.println("elements size --> " + elements.size());
		
	}

}
