package dao.base;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.DbConnection;

public class GenericDao {
	protected Connection connection;
	protected Statement st; // Thực thi câu sql hoàn chỉnh: createStatement() --> execute...(sql)
	protected PreparedStatement pst;// Thực thi câu sql có tham số, trước khi execute... truyền giá trị cho tham số protected rồi execute
	protected ResultSet rs;
	protected CallableStatement cst; // Thực thi stored procedure, function
	
	public GenericDao() {
		connection = DbConnection.getConnection();
	}

}
