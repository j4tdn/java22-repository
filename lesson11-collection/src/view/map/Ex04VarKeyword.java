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
		 JavaScript: let, var, const
		 let, var, const
		 let, const: block scope{}
		 var	   : global function scope
		  
		 var date = new Date();
		 Java -> ~10
		 
		 Mục đích: giúp việc khai báo kdl của biến lúc compile gọn hơn
		 
		 Dựa vào giá trị bên phải(sau dấu =) để quy ước KDL của var lúc compile, runtime
		 
		 
		 Lưu ý:
		 + block scope
		 + dựa vào giá trị bên phải để xác định kdl
		 --> giá trị khởi tạo ko thể là null
		 hạn chế:
		  + làm mất khả năng sử dụng đa hình trong đối tượng
		 */
		
		int a1 = 5;
		var a2 = 5;
		
		Integer b1 = 5;
		BigDecimal b2 = new BigDecimal(22);
		{
			var b3 = new BigDecimal(22);
			System.out.println("b3 --> " + b3);
		}
		var s1 = "hello";
//		var s2 = null;
		
		List<String> list1 = new ArrayList<>();
		// list1.add(String);
		// list1 -> nhận vào List or con của List
		
		var list2 = new ArrayList<String>(); 
		// var list2 --> luôn là ArrayList
//		list2.add(Object);
//		list2.add(String);
		
		
//		Map<ItemGroup, List<Item>> groups = new HashMap<>();
		var groups = new HashMap<ItemGroup, List<Item>>();
	    groups.put(null, List.of());
		
//		Set<Entry<ItemGroup, List<Item>>> entries = groups.entrySet();
		var entries = groups.entrySet();
		
		System.out.println("entries size --> " + entries.size());
		
	}

}
