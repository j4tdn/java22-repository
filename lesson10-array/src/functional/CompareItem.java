package functional;

import bean.Item;

@FunctionalInterface
public interface CompareItem {
	int compare(Item i1, Item i2);

}
