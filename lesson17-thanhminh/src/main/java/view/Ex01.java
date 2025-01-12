package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.DbConnection;

public class Ex01 {
	public static void main(String[] args) {
		try (Connection connection = DbConnection.getConnection()) {
			String ex01 = "SELECT STUDENT.STUDENT_NAME,\r\n"
					+ "           STUDENT.STUDENT_CLASS_ID\r\n"
					+ "    FROM STUDENT\r\n";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(ex01);
			
			while (rs.next()) {
				String name = rs.getString("STUDENT_NAME");
				Integer class_id = rs.getInt("STUDENT_CLASS_ID");
				System.out.println("Tên học sinh: " + name + ", Class_id: " + class_id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
