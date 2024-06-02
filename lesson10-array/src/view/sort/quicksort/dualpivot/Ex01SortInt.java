package view.sort.quicksort.dualpivot;

import java.util.Arrays;

import common.SortOrder;
import utils.SortUtils;

public class Ex01SortInt {
	
	public static void main(String[] args) {
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		
		// Sử dụng thuật toán quick sort có sẵn trong Java code
		
		
		// Với KDL nguyên thủy, chỉ hỗ trợ sắp xếp tăng dần
		// Muốn giảm dần --> reverse
		SortUtils.sort(elements, SortOrder.DESC);
		
		System.out.println("Sắp xếp giảm dần --> " + Arrays.toString(elements));
		
	}
	
}
