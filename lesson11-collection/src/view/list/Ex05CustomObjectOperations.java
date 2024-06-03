package view.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Ex05CustomObjectOperations {
	
	public static void main(String[] args) {
		// loop, get, set, add, remove, contains, subList
		List<Item> items = mockData();
		printf("Dữ liệu đầu vào --> ", items);
		
		/*
		 List<T> list = ... --> list.remove(item)
		 
		 Cơ chế: Duyệt từng phần tử trong list, kiểm tra xem có phần tử nào 'equals' với item hay không
		         Nếu có phần tử equals --> xóa(1 phần tử đầu tiên gặp phải)
		 
		 equals
		 + T chưa override hàm equals --> sử dụng mặc định của Object -> so sánh == (địa chỉ)
		 + T nên override lại equals để so sánh theo giá trị của các thuộc tính bên trong T
		 
		 Về nhà: Xem trước cấu trúc dữ liệu
		 + danh sách liên kết đơn
		 +                    đôi
		 +                    đa
		 --> cách khởi tạo, thêm, sửa, xóa, lấy ra ...
		 --> so sánh với mảng
		 
		 */
		
		Item itemA2 = new Item(2, "Item A2", 72d, 101);
		items.remove(itemA2);
		printf("Xóa phần tử 'Item A2' --> ", items);
		
		boolean isExists = items.contains(new Item(3, null, null, null));
		System.out.println("Tồn tại 'Item A3' không --> " + isExists);
	}
	
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + " {");
		for (int i = 0; i < items.size(); i++) {
			System.out.println("    " + i + ". " + items.get(i));
		}
		System.out.println("}\n");
	} 
	
	private static List<Item> mockData() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Item A1", 28d, 101));
		items.add(new Item(2, "Item A2", 72d, 101));
		items.add(new Item(3, "Item A3", 16d, 101));
		items.add(new Item(4, "Item B1", 54d, 102));
		items.add(new Item(5, "Item B2", 33d, 102));
		items.add(new Item(6, "Item C1", 77d, 103));
		return items;
	}
}
