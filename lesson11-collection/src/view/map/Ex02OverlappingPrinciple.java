package view.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.ItemGroup;

public class Ex02OverlappingPrinciple {

	public static void main(String[] args) {
		// cơ chế kiểm tra entry đã tồn tại trong map chưa

		// --> Kiểm tra key của entry đã tồn tại trong map chưa
		// 		--> duyệt qua các key trong map hiện tại
		// 		--> kiểm tra nếu có key nào equals với newKey và key.hashcode() newKey.hashcode()
		//			--> báo đã tồn tại
		// 			--> nếu ko thì chưa tồn tại
		
		// equals mặc định: so sánh theo == địa chỉ
		// hashcode mặc định(Object): địa chỉ của biến kdl đối tượng

		// thường thì kiểm tra newEntry, newKey đã tồn tại trong map chưa
		// ứng dụng hay so sánh theo giá trị của newKey đã nằm trong map chưa
		// thay vì dùng equals và hashcode mặc định theo địa chỉ
		// override equals theo thuộc tính của newKey cần so sánh
		// --> danh sách các thuộc tính sử dụng trong equals và hash code phải giống nhau
		
		
		// Lưu map với
		// Key: loại hàng
		// Value: Danh sách mặt hàng thuộc loại hàng đó
		Map<ItemGroup, List<Item>> groups = new HashMap<>();

		Item item101 = new Item(101, "Item 101", 10d, 77);
		Item item102 = new Item(101, "Item 102", 20d, 77);
		Item item203 = new Item(203, "Item 203", 30d, 77);
		
		
		groups.put(new ItemGroup(1, "Group 1"), List.of(item101, item102));
		groups.put(new ItemGroup(2, "Group 2"), List.of(item101, item102, item203));
		groups.put(new ItemGroup(3, "Group 1"), List.of()); // group 3, chưa có item nào
		
		System.out.println("size --> " + groups.size());
		
		groups.put(new ItemGroup(3, "Group 1"), List.of(item101, item102, item203));
		
		System.out.println("size after put group 3--> " + groups.size());

		// put thành công --> size = 4
		
		// ghi đè group 3 --> size = 3
		System.out.println("group3 values size --> " + groups.get(new ItemGroup(3, "Group 3")).size());
	}
}
