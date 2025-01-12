package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import connection.Dbconnection;

public class Ex01Exam {
	public static void main(String[] args) 
	{
	Connection connection;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap class ID:");
	String classID = scanner.nextLine();
	
	connection = Dbconnection.getConnection();

	 String sql = "SELECT name, gender, classid AS student_name, student_gender, student_classid "
				+ "FROM student s "
				+ "JOIN class c ON s.classid = c.id "
				+ "WHERE c.id = ?";
	 
	 try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, classID);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		System.out.println("Danh sach sinh vien trong lop: " + classID );
		while(resultSet.next()) {
			Integer studentID = resultSet.getInt("id");
			String studentName = resultSet.getString("student_name");
			System.out.println("Student id:" + studentID + ", name :" + studentName);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		scanner.close();
	}
	 
		

	}

}
