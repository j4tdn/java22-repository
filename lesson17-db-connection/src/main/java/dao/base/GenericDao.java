package dao.base;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.DbConnection;

public class GenericDao {
	protected Connection connection;
	protected Statement st;
	protected PreparedStatement pst;// câu truy vấn có tham số
	protected ResultSet rs;
	protected CallableStatement cst;
	
	public GenericDao() {
		connection = DbConnection.getConnection();
	}

}
