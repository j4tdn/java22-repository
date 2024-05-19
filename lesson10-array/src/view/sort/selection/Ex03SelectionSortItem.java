package view.sort.selection;

import java.time.LocalDate;

import bean.Item;
import functional.CompareItem;
import model.DataModel;

public class Ex03SelectionSortItem {
	
	//Item --> id, name
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		// 1. Tăng dần theo id
		selectionSort(items, (i1, i2) -> {
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			return id1 - id2;
			
		});
		printf("1. Tăng dần theo id", items);
		
		// 2. Tăng dần theo name
		selectionSort(items, (i1, i2) -> {
			String name1 = i1.getName();
			String name2 = i2.getName();
			return name1.compareTo(name2);
			
		});
		printf("2. Tăng dần theo name", items);
		
		// 3. Giảm dần theo salesPrice
		selectionSort(items, (i1, i2) -> {
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			return sp2.compareTo(sp1);
			
		});
		printf("3. Giảm dần theo salesPrice", items);
		
		// 4. Tăng dần theo salesPrice, giảm dần theo salesDate
		selectionSort(items, (i1, i2) -> {
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			int salesPriceInt = sp1.compareTo(sp2);
			
			// khi sp1 >< sp2 --> return +- để hoán vị tăng dần, giảm dần
			if(salesPriceInt != 0) {
				return salesPriceInt;
			}
			
			// sp1 = sp2 --> cân nhắc saleDate
			//Khi salesPrice bằng nhau, giảm dần cho salesDate
			return i2.getSalesDate().compareTo(i1.getSalesDate());
			
		});
		printf("4. Tăng dần theo salesPrice, giảm dần theo salesPrice", items);
		// 5. Giảm dần theo salesDate, name,  tăng dần theo id
		selectionSort(items, (i1, i2) -> {
			LocalDate sd1 = i1.getSalesDate();
			LocalDate sd2 = i2.getSalesDate();
			int salesDateInt = sd2.compareTo(sd1);
			
			// khi sp1 >< sp2 --> return +- để hoán vị tăng dần, giảm dần
			if(salesDateInt != 0) {
				return salesDateInt;
			}
			String name1 = i1.getName();
			String name2 = i2.getName();
			int nameInt = name2.compareTo(name1);
			
			if(nameInt != 0) {
				return nameInt;
			}
			return i1.getId().compareTo(i2.getId());
			
		});
		printf("5. Giảm dần theo salesDate, name/ tăng dần theo id", items);
	
		Item[] itemsWithNullObjects = DataModel.mockItemsWithNullObjects();
		selectionSort(itemsWithNullObjects, (i1, i2) -> {
			if(i1 == null) {
				return -1;
			}
				
			if(i2 == null) {
				return 1;
			}
			
			return i1.getName().compareTo(i2.getName());
		});
	printf("6. Null first, tăng dần theo name", itemsWithNullObjects);
	}
	
	private static void selectionSort(Item[] elements, CompareItem cpItem) {
		int length = elements.length;
		for(int i = length - 1 ; i > 0; i--) {
				for(int j = 0; j < i ; j++) { 		/////// { /////
					if (cpItem.compare(elements[j], elements[i]) > 0) { 
						Item temp = elements[j];
						elements[j] = elements[i];
						elements[i]=temp;
					}
			}
		}
	}
	
	private static void printf(String sortDesc, Item[] items) {
		System.out.println(sortDesc + " --> {");
		for(Item item: items) {
			System.out.println("  " + item);
		}
		System.out.println("}\n");
	}

}
