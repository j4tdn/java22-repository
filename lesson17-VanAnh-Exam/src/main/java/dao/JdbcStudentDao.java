package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import connection.DbConnection;
import persistence.Student;

public class JdbcStudentDao implements StudentDao {

	private static final String Q_GET_STUDENTS_BY_CLASS_ID = "" + "SELECT *\n" + "  FROM student \n"
			+ " WHERE CLASS_ID = ?";

	private static final String Q_GET_AMOUNT_OF_STUDENT_PER_CLASS = ""
			+ "SELECT st.CLASS_ID, COUNT(st.CLASS_ID) AS AMOUNT_OF_STUDENTS \n" + "  FROM class c \n"
			+ "	JOIN student st \n" + " ON st.CLASS_ID = c.ID \n" + " GROUP BY st.CLASS_ID ";

	private Connection connection;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<Student> getAllStudentByClassId(int id) {
		List<Student> result = new ArrayList<>();

		try {
			pst = connection.prepareStatement(Q_GET_STUDENTS_BY_CLASS_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getInt("ID"), rs.getString("NAME"), rs.getString("GENDER"),
						rs.getInt("CLASS_ID"));
				result.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pst.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return result;

	}

	@Override
	public Map<Integer, Integer> getAmountOfStudentPerClass() {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_AMOUNT_OF_STUDENT_PER_CLASS);
			while (rs.next()) {
				int id = rs.getInt("CLASS_ID");
				int amount = rs.getInt("AMOUNT_OF_STUDENTS");
				result.put(id, amount);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pst.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return result;
	}
}
