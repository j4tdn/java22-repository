package view.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.List;

import bean.Item;
import bean.ItemGroup;

public class Ex04VarKeyword {

	public static void main(String[] args) {
		/*
		 let, var ,const
		 let , const : block scope
		 var : global  function scope
		 
		 var date = new Date();
		 
		 Dựa vào giá trị bên phải ( sau dấu = ) để quy ước KDL của Var
		 
		 Mục đích: giúp khai báo KDL của biến lúc compile gọn hơn
		 \
		 lưu ý :
		  + Vẫn là bock scope
		  + Dựa vào giá trị bên phải để xác định KDL 
		    --> giá trị khởi tạo không thể là NULL
		 Hạn chế : làm mất đi khả năng sử dụng của Đa Hình trong Đối tượng
		 
		 */
		int a1 = 5;
		var a2 = 5;
		
		Integer b1 = 5;
		var b2 = new BigDecimal(22);
		
		List<String> list1 = new ArrayList<>();
		// có thể là List hoặc con của List
		
		
		var list2 = new ArrayList<String>();
		// var list2 --> luôn là arrayList
		
		//Map<ItemGroup, List<Item>> groups = new HashMap<>();
		var groups = new HashMap<ItemGroup, List<Item>>();
		
		groups.put(null, List.of());
		
		//Set<Entry<ItemGroup, List<Item>>> entries = groups.entrySet();
		var entries = groups.entrySet();
		
		System.out.println("entries size ==> " + entries.size());
	}
}
