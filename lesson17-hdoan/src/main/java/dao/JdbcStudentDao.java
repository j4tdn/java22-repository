package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Student;
import utils.SqlUtils;

public class JdbcStudentDao implements StudentDao{
	
	private static final String Q_GET_ALL = ""
			+"SELECT * FROM STUDENT\n"
			+ "  WHERE CLASS_ID = ?\n";
	
	private static final String Q_AMOUNT_OF_STUDENTS = ""
			+ "SELECT COUNT(ID) FROM STUDENT WHERE CLASS_ID = ?";
	
	private static final String Q_STUDENTS_SCORES = ""
			+ "SELECT * FROM STUDENT s"
			+ "JOIN RESULT r ON s.ID = r.STUDENT_ID\n"
			+ "WHERE r.SCORE >= ?";
	
	private Connection connection;
	private PreparedStatement pst; 
	
	private ResultSet rs;
	
	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Student> getAll(Integer id) {
		List<Student> students = new ArrayList<>();
		try {
			pst = connection.prepareStatement(Q_GET_ALL); 
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getInt("ID"), rs.getString("NAME"), rs.getString("GENDER"), rs.getInt("class_id"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return students;
	}

	@Override
	public Integer AmoutOfStudent(Integer id) {
		int val = 0;
		try {
			pst = connection.prepareStatement(Q_AMOUNT_OF_STUDENTS); 
			pst.setInt(1, id);
			val = pst.executeUpdate();
		} catch (Exception e) {
		} finally {
			SqlUtils.close(rs, pst);
		}
		return val;
	}

	@Override
	public List<Student> getStudentByScore(Double score) {
		List<Student> students = new ArrayList<>();
		try {
			pst = connection.prepareStatement(Q_STUDENTS_SCORES); 
			pst.setDouble(1, score);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getInt("ID"), rs.getString("NAME"), rs.getString("GENDER"), rs.getInt("class_id"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return students;
	}

}
