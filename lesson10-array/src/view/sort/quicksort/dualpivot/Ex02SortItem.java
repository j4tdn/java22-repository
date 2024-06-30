package view.sort.quicksort.dualpivot;


import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.SortUtils;

public class Ex02SortItem {
	
	public static void main(String[] args) {
		// Với hàm sort có sẵn của Java trong class Arrays
		
		
		Item[] items = DataModel.mockItems();
		
		/*
		Khi sort với mảng kdl đối tượng --> Java hỗ trợ 2 cách làm
		Cách 1: Arrays.sort(T[] elements, Comparator<T> comparator)
		  	 + T là generic type (kdl đại diện cho kdl đối tượng)
			  --> Tương tự với class Object(hỗ trợ nhiều tính năng hơn)
			 + Comparator<T> tương tự CompareString, CompartItem
			  --> compare 2 đối tượng với kdl đối tượng bất kì để suy ra tăng/giảm dần
			
		Cách 2: Arrays.sort(Object[] objects)
				Yêu cầu: 
				+ Lúc compile là Object[]
				+ Lúc runtime(truyền vào kdl con của Object) thì từng đối tượng phải là con 
				của interface Comparable<T>
				--> sau đó muốn sort tăng, giảm dần thì override hàm compareTo của Comparable
					trong class
				Nếu kdl của từng phần tử trong mảng truyền vào ko phải là con của Comparable<T>
					thì nó sẽ quăng exception lúc runtime
		 
		 */
		
		
		// Cách 1:
		Arrays.sort(items, (i1, i2) ->  i1.getId().compareTo(i2.getId()));
		SortUtils.printf("1.Sắp xếp tăng dần theo id", items);
		
		Arrays.sort(items, (i1, i2) ->  i2.getSalesPrice().compareTo(i1.getSalesPrice()));
		SortUtils.printf("2.Sắp xếp giảm dần theo salePrice", items);
		
		Arrays.sort(items, (i1, i2) -> {
			int salesPriceInt = i2.getSalesPrice().compareTo(i1.getSalesPrice());
			if(salesPriceInt != 0) {
				return salesPriceInt;
			}
			return i2.getSalesDate().compareTo(i2.getSalesDate());
		});
		
		SortUtils.printf("3.Sắp xếp giảm dần theo salePrice, tăng dần theo saleDate", items);
		
		Item[] itemsWithNullObjects = DataModel.mockItemsWithNullObjects();
		Arrays.sort(itemsWithNullObjects, (i1, i2) -> {
			if(i1 == null && i2 != null) {
				return 1;
			}
				
			if(i2 == null) {
				return -1;
			}
			
			return i1.getName().compareTo(i2.getName());
		});
		SortUtils.printf("4. Null last, tăng dần theo name", itemsWithNullObjects);
		
		System.out.println("\n==============Cách 2(Array.sort(Object[] objects ==============\n");
		Arrays.sort(items);
		SortUtils.printf("1. Tăng dần theo salePrice", items);
		Arrays.sort(items);
		SortUtils.printf("1. Giảm dần theo ID", items);
		// cách 2 có hạn chế  vì chỉ được sort theo 1 điều kiện duy nhất vì overide chỉ 1 lần
		// nếu sử 2 cách thì ưu tiên Compareto<T>
		

	}

}