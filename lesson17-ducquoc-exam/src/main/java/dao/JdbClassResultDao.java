package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import persistence.ClassResult;
import utils.SqlUtils;

public class JdbClassResultDao extends GenericDao implements ClassResultDao {
	
	private static final String Q_GET_STUDENS = ""
			+ "SELECT class.name AS class_name ,\r\n"
			+ "		COUNT(CASE \r\n"
			+ "				WHEN result.subject = \"math\" AND result.score >= 8.0 THEN studens.id END ) AS count_math ,\r\n"
			+ "		COUNT(CASE \r\n"
			+ "				WHEN result.subject = \"Literature\" AND result.score >= 8.0 THEN studens.id END ) AS count_Literature,\r\n"
			+ "                studens.name AS studen_name\r\n"
			+ "        FROM studens JOIN class ON studens.class_id = class.id\r\n"
			+ "        JOIN result ON studens.id = result.studen_id \r\n"
			+ "        GROUP BY class.name;" ;
	@Override
	public List<ClassResult> getAll() {
		List<ClassResult> classResults = new ArrayList();
		
		try {
			st = connection.createStatement();
			rs= st.executeQuery(Q_GET_STUDENS);
			while (rs.next()) {
				 String ClassName = rs.getString("class_name");
				 int countStudenMath = rs.getInt("count_math");
				 int countStudenLiterature = rs.getInt("count_Literature");
				 String StudenName = rs.getString("studen_name");
				 ClassResult classResult = new ClassResult(ClassName,countStudenMath,countStudenLiterature,StudenName);
				 classResults.add(classResult);
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		finally {
			SqlUtils.close(rs,st);
		}
		return classResults;
	}
}
