package view.sort.bubble;

import java.time.LocalDate;

import bean.Item;
import functional.CompareItem;
import model.DataModel;

public class Ex03BubbleSortItem {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		/*
		 Sắp xếp danh sách mặt hàng theo các yêu cầu sau đây:
		 1. Tăng dần theo id
		 2. Tăng dần theo name
		 3. Giảm dần theo salesPrice
		 4. Tăng dần theo salesPrice, giảm dần theo salesDate
		 5. Giảm dần theo salesDate, giảm dần theo name, tăng dần theo id
		 */
		bubbleSort(items, (i1, i2) -> {
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			return id1 - id2;
		});
		printf("1. Tăng dần theo id", items);
		bubbleSort(items, (i1, i2) -> {
			String name1 = i1.getName();
			String name2 = i2.getName();
			return name1.compareTo(name2);
		});
		printf("2. Tăng dần theo name", items);
		bubbleSort(items, (i1, i2) -> {
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			return sp2.compareTo(sp1);
		});
		printf("3. Giảm dần theo salesPrice", items);
		bubbleSort(items, (i1, i2) -> {
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			int salesPriceInt = sp1.compareTo(sp2);
			if (salesPriceInt != 0) {
				return salesPriceInt;
			}
			return i2.getSalesDate().compareTo(i1.getSalesDate());
		});
		printf("4. Tăng dần theo salesPrice, giảm dần theo salesDate", items);
		bubbleSort(items, (i1, i2) -> {
			LocalDate sd1 = i1.getSalesDate();
			LocalDate sd2 = i2.getSalesDate();
			int salesDateInt = sd2.compareTo(sd1);
			if (salesDateInt != 0) {
				return salesDateInt;
			}
			String name1 = i1.getName();
			String name2 = i2.getName();
			int nameInt = name2.compareTo(name1);
			if (nameInt != 0) {
				return nameInt;
			}
			return i1.getId().compareTo(i2.getId());
		});
		printf(" 5. Giảm dần theo salesDate, giảm dần theo name, tăng dần theo id", items);
	}
	private static void bubbleSort(Item[] elements, CompareItem cpItem) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (cpItem.compare(elements[j], elements[j+1]) > 0) {
					Item temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	private static void printf(String sortDesc, Item[] items) {
		System.out.println(sortDesc + " --> {");
		for (Item item: items) {
			System.out.println("   " + item);
		}
		System.out.println("}\n");
	}

}
