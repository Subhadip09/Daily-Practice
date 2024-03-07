// Project on layered architecture system
package customerApp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Dao - Data Access Object Layer
// this is a separate class which provide connection
public class Dao {
	public static Connection provideConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/march5", "root", "Subha@2001");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
