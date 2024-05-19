package view.sort.quicksort.dualpivot;

import java.util.Arrays;

import common.SortOrder;
import utils.SortUtils;


public class Ex01SortInt {
	public static void main(String[] args) {
		int[] elements = {1,5,11,9,4,6};
		// sử dụng thuật toán quicksort
		SortUtils.sort(elements);
		
		System.out.println("Sắp xếp tăng dần" + Arrays.toString(elements));
		SortUtils.sort(elements,SortOrder.DESC);
		System.out.println("Sắp xếp giảm dần" + Arrays.toString(elements));
	}
}
