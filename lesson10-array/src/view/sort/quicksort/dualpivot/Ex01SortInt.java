package view.sort.quicksort.dualpivot;

import java.util.Arrays;

import common.SortOrder;
import utils.SortUtil;

public class Ex01SortInt {

	public static void main(String[] args) {
		int[] elements = { 1, 5, 11, 9, 4, 6};
		
		//dùng quick sort của java
		//KDL nguyen thuy chi ho tro sắp xếp tăng dần
		//Arrays.sort(elements);
		
		//Muốn giảm dần -->
		SortUtil.sort(elements, SortOrder.DESC);
		
		
		System.out.println("Sắp xếp tăng dần --> " + Arrays.toString(elements));
	}
}
