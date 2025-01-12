package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistance.Student;

public class JdbcStudentDao implements StudentDao{

	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	private static String Q_GET_STUDENT = "" + "SELECT * FROM STUDENT = ?";
	
	private static String Q_GET_AMOUNT = "" + "select count(id) from student where student.class_id = ?";
	
	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Student> getStudent(int id) {
		List<Student> result = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(Q_GET_STUDENT);
			pst.setInt(1, id);
			while(rs.next()) {
				Integer idd = rs.getInt("ID");
				String name = rs.getString("NAME");
				String gender = rs.getString("GENDER");
				Integer classId = rs.getInt("CLASS_ID");
				
				result.add(new Student(null, name, gender, classId));
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
	public Integer amountOfStudent(int id) {
		int value = 0;
		try {
			pst = connection.prepareStatement(Q_GET_AMOUNT);
			pst.setInt(1, id);
			value = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(rs, pst);
		return value;
		
	}

	public static void close(AutoCloseable ... objectsTobeClosed) {
		try {
			for(AutoCloseable object: objectsTobeClosed) {
				if(object != null) {
					object.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
