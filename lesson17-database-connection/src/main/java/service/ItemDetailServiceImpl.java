package service;

import dao.ItemDetailDao;
import dao.JdbcItemDetailDao;

public class ItemDetailServiceImpl implements ItemDetailService{
	
	private ItemDetailDao itemDetailDao;
	
	public ItemDetailServiceImpl() {
		this.itemDetailDao = new JdbcItemDetailDao();
	}

	@Override
	public void updateAmounts(int itd1, int itd2, int value) {
		itemDetailDao.updateAmounts(itd1, itd2, value);
	}
	
}
