package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import persistence.Student;

public class StudentDao implements StudentDaoI {
	private static final String Q_GET_ALL = "SELECT * \r\n"
			+ "FROM Student\r\n"
			+ "ORDER BY class_id;";
	
	private Connection connection;
	private Statement st;
	private ResultSet rs; 
	
	@Override
	public List<Student> allStudent() {
		List<Student> students = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL); 
			
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				Integer classID = rs.getInt("class_id");
				Student student = new Student(id,name,gender,classID);
				students.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					st.close();
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		return students;
		
	}
}
