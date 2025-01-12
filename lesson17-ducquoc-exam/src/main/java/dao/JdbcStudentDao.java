package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import persistence.Students;
import utils.SqlUtils;

public class JdbcStudentDao extends GenericDao implements studenDao {
	
	private static final String Q_GET_STUDENS_BY_ID = ""
			+ "SELECT * FROM STUDENS WHERE CLASS_ID = ? " ;
	
	@Override
	public List<Students> get(int id) {
		List<Students> studes = new ArrayList();
		Students studen = null ;
		try {
			pst = connection.prepareStatement(Q_GET_STUDENS_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if(rs.next()) {
				
				int studen_id = rs.getInt("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				int class_id = rs.getInt("class_id");
				studen = new Students(studen_id,name,gender,class_id);
				studes.add(studen);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,pst);
		}
		return studes;
	}
}
