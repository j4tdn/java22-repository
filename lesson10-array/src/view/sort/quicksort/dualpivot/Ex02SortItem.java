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
		 * Khi sort với mảng KDL đối tượng --> Java hỗ trợ 2 cách làm
		 * 
		 * Cách 1: Arrays.sort(T[] elements, Comparator<T> comparator) + T là 1 generic
		 * type(KDL đại diện cho KDL đối tượng) --> Tương tự với class Object(hỗ trợ
		 * nhiều tính năng hơn) + Comparator<T> tương tự với CompareString, CompareItem
		 * --> compare 2 đối tượng với KDL đối tượng bất kỳ để suy ra tăng/giảm dần
		 * 
		 * Cách 2: Arrays.sort(Object[] objects) Yêu cầu: + Lúc compile là Object[] +
		 * Lúc runtime(truyền vào KDL con của Object) thì từng 'đối tượng' phải là con
		 * của interface Comparable<T> --> sau đó muốn sort tăng, giảm dần thì phải
		 * overide hàm compareTo của Comparable trong class Nếu KDL của từng phần tử
		 * trong mảng truyền vào ko phải là con của Comparable<T> thì nó sẽ quăng
		 * exception lúc runtime
		 * 
		 * Nếu vừa sử dụng Comparator<T> vừa sử dụng Comparable<T> nó sẽ ưu tiên
		 * Comparator<T> hơn
		 * 
		 * Với cách 2 thì với 1 mảng đối tượng mình sort theo được 1 cách, phương pháp
		 * duy nhất vì muốn sort thế nào phải override logic của hàm compareTo .... 1
		 * style
		 * 
		 */
		// Cách 1
		Arrays.sort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
		SortUtils.printf("1. Sắp xếp tăng dần theo id", items);

		Arrays.sort(items, (i1, i2) -> i2.getSalesPrice().compareTo(i1.getSalesPrice()));
		SortUtils.printf("2. Giảm dần theo salesPrice", items);

		Arrays.sort(items, (i1, i2) -> {
			int salesPriceInt = i2.getSalesPrice().compareTo(i1.getSalesPrice());

			if (salesPriceInt != 0) {
				return salesPriceInt;
			}

			return i1.getSalesDate().compareTo(i2.getSalesDate());
		});
		SortUtils.printf("3. Giảm dần theo salesPrice, tăng dần theo salesDate", items);

		Item[] itemsWithNullObjects = DataModel.mockItemsWithNullObjects();
		Arrays.sort(itemsWithNullObjects, (i1, i2) -> {
			if (i1 == null && i2 != null) {
				return 1;
			}
			if (i2 == null) {
				return -1;
			}
			return i1.getName().compareTo(i2.getName());
		});
		SortUtils.printf("4. Null Last, tăng dần theo name", itemsWithNullObjects);

		System.out.println("\n=============== Cách 2(Arrays.sort(Object[] objects)) =============== \n");

		Arrays.sort(items);
		SortUtils.printf("1. Tăng dần theo salesPrice", items);

		Arrays.sort(items);
		SortUtils.printf("2. Giảm dần theo id", items);

	}
}
