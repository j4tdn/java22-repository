package view.sort.bubble;

import java.awt.desktop.PrintFilesEvent;
import java.time.LocalDate;

import bean.Item;
import functional.CompareItem;
import functional.CompareString;
import model.DataModel;

public class Ex03BubbleSortItem {
	
	// Item --> id, name, salePrice, saleDate
	public static void main(String[] args) {
		Item[] item = DataModel.mockItems();
		
		// Sắp xếp danh sách mặt hàng theo yêu cầu sau đây
		//1. tăng dần theo id
		bubbleSort(item, (i1,i2)->{
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			return id1-id2;
		});
		printf("tăng dần theo id", item);
		
		//2. Tăng dần theo tên
		bubbleSort(item, (i1,i2)->{
			String name1 = i1.getName();
			String name2 = i2.getName();
			return name1.compareTo(name2);
		});
		printf("tăng dần theo tên", item);
		
		//3. Giảm dần theo salePrice
		bubbleSort(item, (i1,i2)->{
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			return sp2.compareTo(sp1);
		});
		printf("Giảm dần theo salePrice", item);
		
		//4. Tăng dần theo salePrice, giảm dần theo sales Date
		bubbleSort(item, (i1,i2)->{
			LocalDate sd1 = i1.getSalesDate();
			LocalDate sd2 = i2.getSalesDate();
			
			int saleDateInt = sd2.compareTo(sd1);
			if(saleDateInt!=0) return saleDateInt;
			
			String name1 = i1.getName();
			String name2 = i2.getName();
			int nameInt = name2.compareTo(name1);
			
			if(nameInt!=0) return nameInt;
			return i1.getSalesDate().compareTo(i2.getSalesDate());
		});
		printf("Tăng dần theo saleDate, giảm dần theo saleDate", item);
		
		
		//5. Giảm dần theo salePrice, giảm dần theo name, tăng dần theo id
		bubbleSort(item, (i1,i2)->{
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			
			int salePriceInt = sp1.compareTo(sp2);
			
			if(salePriceInt!=0) return salePriceInt*1;
			return i2.getSalesDate().compareTo(i1.getSalesDate());
		});
		printf("Tăng dần theo salePrice, giảm dần theo sales Date", item);
		
	}
	
	private static void bubbleSort(Item[] elements, CompareItem cpItem) {
		int length = elements.length;
		for(int i = 0; i< length; i++) {
			for (int j=0; j< length-i-1;j++ ) {
				if(cpItem.compareItem(elements[j], elements[j+1])>0) { 
					Item temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	private static void bubbleSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for(int i = 0; i< length; i++) {
			for (int j=0; j< length-i-1;j++ ) {
				if(cpString.compare(elements[j], elements[j+1])>0) { 
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
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
