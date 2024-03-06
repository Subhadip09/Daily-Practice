package march5practice_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Basic {
	private static Scanner sc = new Scanner(System.in);
	
	private static Connection con = null;
	
	private static Basic bs = new Basic();
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/march5";
		String username = "root";
		String password = "Subha@2001";
		try {
			con= DriverManager.getConnection(url,  username, password);
			
			boolean flag = true;
			
			while(flag)
			{
				System.out.println("enter 1 for insert data");
				System.out.println("enter 2 for get all data");
				System.out.println("enter 3 for update data");
				System.out.println("enter 4 for delete data");
				System.out.println("enter 5 for exit");
				
				int choice = sc.nextInt();
				
				switch(choice)
				{
					case 1:
						bs.insertdata();
						break;
					case 2:
						bs.getAlldata();
						break;
					case 5:
						flag = false;
						System.out.println("Thank you for visiting 🙏🙏🙏🙏🙏");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertdata() throws SQLException
	{
		System.out.println("enter student id ");
		int stuid = sc.nextInt();
		System.out.println("enter student name");
		String stuname = sc.next();
		System.out.println("enter student address ");
		String stuaddress = sc.next();
		
		PreparedStatement ps = con.prepareStatement("insert into Student values(?, ?, ?)");
		ps.setInt(1, stuid);
		ps.setString(2, stuname);
		ps.setString(3, stuaddress);
		
		int row = ps.executeUpdate();
		if(row > 0)
		{
			System.out.println("data inserted successfully");
		}
	}
	public void getAlldata() throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("select * from Student");
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("StudentId");
			String name = rs.getString("StudentName");
			String address = rs.getString("StudentAddress");
			
			System.out.println("Student ---> " + id + " " + name + " " + address);
		}
	}
}
