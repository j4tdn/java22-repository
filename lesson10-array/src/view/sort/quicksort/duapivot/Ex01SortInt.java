package view.sort.quicksort.duapivot;

import java.util.Arrays;

import common.SortOrder;
import utils.SortUtils;

public class Ex01SortInt {
	public static void main(String[] args) {
		// Sử dụng thuật toán quicksort có sẵn trong Java code
		int[] elements = {1, 5, 11, 9, 4, 6};
		// KDL nguyên thuỷ, chỉ hổ trợ sắp xếp tăng dần
		// Muốn giảm dần --> reverse
		SortUtils.sort(elements, SortOrder.DESC);
		
		System.out.println("Sắp xếp giảm dần: " + Arrays.toString(elements));
	}
}
