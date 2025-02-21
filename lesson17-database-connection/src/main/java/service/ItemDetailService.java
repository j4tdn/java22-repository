package service;

public interface ItemDetailService {
	
	/**
	 * Update amount of given item details
	 * @param itd1 id of item detail 1
	 * @param itd2 id of item detail 2
	 * @param value +- value
	 */
	void updateAmounts(int itd1, int itd2, int value);

}
