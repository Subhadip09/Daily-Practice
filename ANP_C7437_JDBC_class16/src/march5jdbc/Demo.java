package march5jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
//		there are 5 steps to connect database with java
//		1st step
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		2nd step
		String url = "jdbc:mysql://localhost:3306/march5";
		String username = "root";
		String password = "Subha@2001";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
//		3rd Step: Create database object
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		i want to insert some data into the database with the help of java
		
	}
}
