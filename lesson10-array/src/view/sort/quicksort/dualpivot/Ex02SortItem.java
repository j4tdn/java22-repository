package view.sort.quicksort.dualpivot;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.SortUtils;

public class Ex02SortItem {
	
	public static void main(String[] args) {
		// với hàm sort có sẵn của java trong class Arrays
		
		Item[] items = DataModel.mockItems();
		
		/*
			khi sort với mảng KDL đối tượng --> Java hỗ trợ 2 cách làm
			Cách 1: Arrays.sort(T[] elements, Comparator<T> comparator)
					+ T là 1 generic type(KDL đại diện cho KDL đối tượng)
					  --> Tương tự với class Object(hỗ trợ nhiều tính năng hơn)
					+ Comparator<T> tượng tự với CompareString, CompareItem
					  --> compare 2 đối tượng với KDL đối tượng bất kỳ để suy ra tăng/giảm dần
					  
			Cách 2: Arrays.sort(Object[] objects)		
					Yêu cầu: 	
					+ Lúc compile là Object[]
					+ Lúc runtime(truyền vào KDL con của Object) thì từng 'đối tượng' phải là con
					  của interface Comparable<T>
					  --> sau đó muốn sort tăng, giảm dần thì phải override hàm compareTo của Comparable
					  	  trong class
					  Nếu KDL của từng phần tử trong mảng truyền vào ko phải là con của Comparable
					  thì nó sẽ quăng 	  
		 
		 	Nếu vừa sử dụng Comparator<T> vừa sử dụng Comparable<T> nó sẽ ưu tiên Comparator<T> hơn
		 */
		// sắp xếp tăng dần theo id
		Arrays.sort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
		SortUtils.printf("1. tăng dần theo id", items);
		
		// sắp xếp giảm dần theo salsPrice
		Arrays.sort(items, (i1, i2) -> i2.getSalesPrice().compareTo(i1.getSalesPrice()));
		SortUtils.printf("2. giảm dần theo salsPrice", items);
		
		// sắp xếp giảm dần theo salsPrice, tăng dần theo salesDate
		Arrays.sort(items, (i1, i2) -> {
			int salesPrice = i2.getSalesPrice().compareTo(i1.getSalesPrice());
			if(salesPrice != 0) {
				return salesPrice;
			}
			return i1.getSalesDate().compareTo(i2.getSalesDate());
		});
		SortUtils.printf("3. giảm dần theo salsPrice, tăng dần theo salesDate", items);
		
		Item[] itemWithNullObjects = DataModel.mockItemsWithNullObjects();
		Arrays.sort(itemWithNullObjects, (i1, i2) -> {
			if(i1 == null && i2 != null) {
				return 1;
			}
			
			if(i2 == null) {
				return -1;
			}
			
			return i1.getName().compareTo(i2.getName());
		});
		SortUtils.printf("4. Null First, Tăng dần theo name", itemWithNullObjects);
		
		System.out.println("\n=============== Cách 2(Arrays.sort(Object[] objects))=================\n");
		Arrays.sort(items);
		SortUtils.printf("1. Tăng dần theo salesPrice", items);
		Arrays.sort(items);
		SortUtils.printf("2. Giảm dần theo id", items);
	}
	
}
