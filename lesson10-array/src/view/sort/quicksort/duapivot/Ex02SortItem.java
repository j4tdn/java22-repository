package view.sort.quicksort.duapivot;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.SortUtils;

public class Ex02SortItem {
	public static void main(String[] args) {
		// Với hàm sort có sẵn của Java trong class Arrays
		// Khi sort với mảng KDL đối tượng --> Java hỗ trợ 2 cách làm
		
		Item[] items = DataModel.mockItems();
		
		 /*
		  Cách 1: Arrays.sort(T[] elements, Comparator<T> comparator) 
		   + T là generic type(KDL đại diện cho KDL đối tượng)
		   --> Tương tự với class Object(hỗ trợ nhiều tính năng hơn
		   + Comparator<T> tương tự với CompareString, CompareItem
		   --> compare 2 đối tượng với KDL đối tượng bất kỳ
		   
		   Cách 2: Arrays.sort(Object[] object)
		      Yêu cầu:
		      + Lúc compile là Object[]
		      + Lúc runtime(truyền vào KDL con của Object) thì từng 'đối tượng' phải là 
		        con của interface Compareable<T>
		        --> sau đó muốn sort tăng, giảm dần thì phải overide hàm compare của Compareable
		        trong class
		   
		   Nếu cùng sử dụng Comparator<T> và Compareable<T> thì Comparator<T> đc ưu tiên hơn
		   
		   Với cách 2 thì với 1 mảng đối tượng mình sort theo 1 cách, phương pháp duy nhất
		   vì muốn sort thế nào phải overide logic của hàm compareTo ... 1 style
		        
		  */
		// Sắp xếp tăng dần theo id
		//Cách 1
		Arrays.sort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
		SortUtils.printf("1. Sắp xếp tăng dần theo id", items);
		
		Arrays.sort(items, (i1, i2) -> i2.getSalesPrice().compareTo(i1.getSalesPrice()));
		SortUtils.printf("2. Giảm dần theo salesPrice", items);
		
		Arrays.sort(items, (i1, i2) -> {
			int salesPriceInt = i2.getSalesPrice().compareTo(i1.getSalesPrice());
			
			if  (salesPriceInt != 0) {
				return salesPriceInt;
			}
			return i1.getSalesDate().compareTo(i2.getSalesDate());
		});
		SortUtils.printf("3. Giảm dần theo salesPrice, tăng dần theo salesDate", items);
		
		Item[] itemsNull = DataModel.mockItemsWithNullObject();
		SortUtils.bubbleSort(itemsNull, (i1, i2) -> {
			if(i1 == null && i2 != null) {
				return 1;
			}
			if (i2 == null) {
				return -1;
			}
			return i1.getName().compareTo(i2.getName());
		});
		SortUtils.printf("4.Null Last, Tăng dần theo name", itemsNull);
		
		System.out.println("\n====Cách 2: Arrays.sort(Object[] object)====\n");
		Arrays.sort(items);
		SortUtils.printf("1. Tăng dần theo salesPrice", items);
	}

}
