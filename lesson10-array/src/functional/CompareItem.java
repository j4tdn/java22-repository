package functional;

import bean.Item;

@FunctionalInterface
public interface CompareItem {
	int compareItem(Item i1, Item i2);
}
