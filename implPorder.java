package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import Model.porder;

public interface implPorder {
	static Connection getDb()
	{
		String url = "jdbc:mysql://127.0.0.1:3306/food";
		String user = "root";
		String password = "Aa1234..";
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
		return conn;
	}
	
	//create
	void add(Object o);
	//read
	String query(int porderId);
	List<porder> queryAll();
	//update
	void update(Object o);
	//delete
	void delete(int porderId);
}
