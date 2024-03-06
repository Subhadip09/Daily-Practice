package march5jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	private static Scanner sc = new Scanner(System.in);
	
	private static Connection con = null;
	
	private static Demo d = new Demo();
	
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
//			Connection con = DriverManager.getConnection(url, username, password);
			con = DriverManager.getConnection(url, username, password);
			boolean flag = true;
			while(flag)
			{
				System.out.println("enter 1 for insert data ");
				System.out.println("enter 2 for get all data ");
				System.out.println("enter 3 for update data ");
				System.out.println("enter 4 for delete data ");
				System.out.println("enter 5 for exit ");
				
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					d.insertdata();
					break;
				case 2:
					d.getAlldata();
					break;
				case 5:
					flag = false;
					System.out.println("Thankyou for visiting 🙏🙏🙏🙏🙏");
					break;
				}
				
			}
////			i want to insert some data into the database with the help of java
//			System.out.println("enter your student id ");
//			int stuid = sc.nextInt();
//			System.out.println("enter student name ");
//			String stuname = sc.next();
//			System.out.println("enter student address ");
//			String stuaddress = sc.next();
////		3rd Step: Create database object
//			// by doing next line you have to change the query again n again
////			PreparedStatement ps = con.prepareStatement("insert into Student values(5656, 'Kali', 'Pitampur')");
//			// another way to write this using position parameter
//			
//			PreparedStatement ps = con.prepareStatement("insert into Student values(?, ?, ?)");
//			ps.setInt(1, stuid);
//			ps.setString(2, stuname);
//			ps.setString(3, stuaddress);
//			//when we updating data
//			int row = ps.executeUpdate();
//			
//			if(row > 0)
//			{
//				System.out.println("data get inserted successfully");
//			}
;		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		i want to get all the data from student table  
	}
	public void insertdata() throws SQLException
	{
// 		i want to insert some data into the database with the help of java
		System.out.println("enter your student id ");
		int stuid = sc.nextInt();
		System.out.println("enter student name ");
		String stuname = sc.next();
		System.out.println("enter student address ");
		String stuaddress = sc.next();
//	3rd Step: Create database object
		// by doing next line you have to change the query again n again
//		PreparedStatement ps = con.prepareStatement("insert into Student values(5656, 'Kali', 'Pitampur')");
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
	}
	
	public void getAlldata() throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("select * from student");
		// to get all the data row is not used. ResultSet use hota hai
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("StudentId");
			String name = rs.getString("StudentName");
			String address = rs.getString("StudentAddress");
			
			System.out.println("Student -->" + id + " " + name + " " + address);
		}
	}
}
