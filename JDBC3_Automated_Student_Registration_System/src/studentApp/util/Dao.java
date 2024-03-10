package studentApp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static Connection provideConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/automated_student_registration_system", "root", "Subha@2001");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	
}
