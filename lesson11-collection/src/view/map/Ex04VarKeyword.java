package view.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;
import bean.ItemGroup;

public class Ex04VarKeyword {
	public static void main(String[] args) {
		/*
		 
		 Mục đích: Giúp việc khai báo KDL của biến lúc compile gọn hơn
		 
		 Dựa vào giá trị bên phải(sau dấu =) để quy ước KDL của var lúc compile, runtime
		 
		 Lưu ý: 
		 + block scope
		 + dựa vào giá trị bên phải để xác định KDL
		   --> giá trị khởi tạo ko thể là NULL
		 + hạn chế
		   --> làm mất đi khả năng sử dụng của Đa hình trong đối tượng
		   --> KDL của var luôn chính xác là KDL bên phải
		 */
		int a1 = 5;
		var a2 = 5;
		
		Integer b1 = 5;
		BigDecimal b2 = new BigDecimal(22);
		{
			var b3 = new BigDecimal(22);
			System.out.println("b3 -> " + b3);
		}
		var s1 = "hello";
		// var s2 = null;
		
		List<String> list1 = new ArrayList<String>(); // -> KDL String
		// ko khai báo list2(Object)
		// list1 --> nhận vào List hoặc con của list
		
		var list2 = new ArrayList<>();
		// var list2 --> luôn là ArrayList
		
		// Map<ItemGroup, List<Item>> groups = new HashMap<>();
		var groups = new HashMap<ItemGroup, List<Item>>();
		groups.put(null, List.of());
		
		// Set<Entry<ItemGroup, List<Item>>> entries = groups.entrySet();
		var entries = groups.entrySet();
		
		System.out.println("entries size --> " + entries.size());
	}

}
