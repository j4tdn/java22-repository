package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListPrinciple {

	public static void main(String[] args) {
		// Array
		// --> Tạo 1 mảng có kích thược n
		// --> Khi add mới 1 phần tử vào Array --> luôn tạo mảng mới(copy các ptu cũ qua + ptu mới)
		// length
		
		
		// ArrayList(Object[] elementData)
		// --> Dùng hàm khởi tạo rỗng(new ArrayList<>()) tạo mảng(elementData) có kích thước là 0
		// --> Khi add mới phần tử đầu tiên vào ArrayList
		//     --> tạo mảng mới có default length = 10 --> gán cho elementData
		//     --> gán elementData[0] = value
		// --> Khi add mới các phần tử tiếp theo
		//     --> nếu size chưa vượt quá length của elementData --> đưa phần tử mới đó vào elementData và tăng length 1 đơn vị
		//     -->     size vượt quá --> grow tạo mảng mới với newLength, copy phần tử củ của elementData đưa sang + null
		
		// size = 5
		// elemntData.length = 10
		
		// size: số lượng phần tử của ArrayList(thật sự chưa trong elementData)
		// capacity: sức chứa có thể lưu trữ của ArrayList chính là length của elementData
		// size <= elementDate.length(capacity)
		
		// elementData = {A1, B1, C1, D1, E1, null, null, null, null, null}
		
		// 1. Hỗ trợ các hàm xử lý
		// 2. Khi thêm mới phần tử vào ArrayList
		///   Kiểm tra size đã = capacity chưa
		//        Nếu chưa = --> đưa phần tử mới đó vào elementData, tăng size
		//        Nếu rồi    --> tạo mảng mới vs capacity mới, copy mảng cũ qua, đưa ptu mới vào, tăng size
		
		// Hạn chế việc tạo mới mảng liên tục khi add như là Array
		// Dynamic size
		
		List<String> elements = new ArrayList<>(2);
		elements.add("A1"); // size = 1
		elements.add("B1"); // size = 2
		elements.add("C1"); // size = 3
//		elements.add("D1"); // size = 4
//		elements.add("E1"); // size = 5
		
		System.out.println("elements has size = " + elements.size());
		
		elements.add(3, "W1");
		
		System.out.println("elements has size = " + elements.size());
		
		// Phân biệt cách hoạt động của Array và ArrayList khi
		// + khởi tạo
		// + thêm mới phần tử
	}
	
}