package dao;

import dao.base.GenericDao;
import utils.SqlUtils;

public class JdbcItemDetailDao extends GenericDao implements ItemDetailDao{
	
	private static String Q_ADD_AMOUNT = " "
			+ "UPDATE T03_ITEM_DETAIL\n"
			+ "  SET C03_AMOUNT = C03_AMOUNT + ?\n"
			+ "WHERE C03_ITEM_DETAIL_ID = ?";
	
	private static String Q_SUB_AMOUNT = " "
			+ "UPDATE T03_ITEM_DETAIL\n"
			+ "  SET C03_AMOUNT = C03_AMOUNT + ?\n"
			+ "WHERE C03_ITEM_DETAIL_ID = ?";
			              
	@Override
	public void updateAmounts(int itd1, int itd2, int value) {
		try {
			connection.setAutoCommit(false);
			
			pst = connection.prepareStatement(Q_ADD_AMOUNT);
			pst.setInt(1, value);
			pst.setInt(2, itd1);
			pst.executeUpdate();
			
			System.out.println("Thao tác lỗi --> " + 1/0);
			
			pst = connection.prepareStatement(Q_SUB_AMOUNT);
			pst.setInt(1, value);
			pst.setInt(2, itd2);
			pst.executeUpdate();
			
			connection.commit();
		} catch (Exception e) {
			SqlUtils.rollback(connection);
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}		
	}

}
