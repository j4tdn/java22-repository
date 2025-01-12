
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.undo.StateEditable;

import connection.DbConnection;

public class GenericDao {
	protected Connection connection;
	protected Statement st;
	protected PreparedStatement pst;
	protected CallableStatement cst;
	protected ResultSet rs;
	public GenericDao() {
		connection = DbConnection.getConnection();
	}
}
