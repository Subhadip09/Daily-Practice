package march5jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	private static Scanner sc = new Scanner(System.in);
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
			System.out.println("enter your student id ");
			int stuid = sc.nextInt();
			System.out.println("enter student name ");
			String stuname = sc.next();
			System.out.println("enter student address ");
			String stuaddress = sc.next();
//		3rd Step: Create database object
			// by doing next line you have to change the query again n again
//			PreparedStatement ps = con.prepareStatement("insert into Student values(5656, 'Kali', 'Pitampur')");
			// another way to write this using position parameter
			
			PreparedStatement ps = con.prepareStatement("insert into Student values(?, ?, ?)");
			ps.setInt(1, stuid);
			ps.setString(2, stuname);
			ps.setString(3, stuaddress);
			//when we updating data
			int row = ps.executeUpdate();
			
			if(row > 0)
			{
				System.out.println("data get inserted successfully");
			}
;		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		i want to insert some data into the database with the help of java
		
	}
}
