package view.sort.bubble;

import java.time.LocalDate;

import bean.Item;
import model.DataModel;
import utils.SortUtils;

public class Ex04BubbleSortItemNullValues {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItemsWithNullObjects();

		// Sắp xếp các mặt hàng

		// Tăng dần theo SalesPrice(null first), giảm dần theo salesDate(null first),
		// null last
		SortUtils.bubbleSort(items, (i1, i2) -> {
			if (i1 == null && i2 != null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}

			// null first
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();

			int salePriceInt = sp1.compareTo(sp2);

			if (salePriceInt != 0)
				return salePriceInt * 1;
			return i2.getSalesDate().compareTo(i1.getSalesDate());
		});
		SortUtils.printf("Tăng dần theo SalesPrice(null first), giảm dần theo salesDate(null first), null last", items);

		Item[] item2 = DataModel.mockItemsWithNullAtribute();

		// Sắp xếp các mặt hàng

		// Tăng dần theo SalesPrice(null first), giảm dần theo salesDate(null first),
		// null last
		SortUtils.bubbleSort(item2, (i1, i2) -> {
			if (i1 == null && i2 != null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}

			// null first, salesPrice ascending
			Double sp1 = i1.getSalesPrice();
			Double sp2 = i2.getSalesPrice();
			if (sp1 == null) {
				return -1;
			}
			if (sp2 == null) {
				return 1;
			}

			int salesPriceInt = sp1.compareTo(sp2);

			if (salesPriceInt != 0) {
				return salesPriceInt;
			}

			LocalDate sd1 = i1.getSalesDate();
			LocalDate sd2 = i2.getSalesDate();

			if (sd1 == null) {
				return -1;
			}
			if (sd2 == null) {
				return 1;
			}

			return sd1.compareTo(sd2);

		});
		SortUtils.printf("Tăng dần theo SalesPrice(null first), giảm dần theo salesDate(null first), null last", item2);

	}
}