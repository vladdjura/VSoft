package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConection {

	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/store?useSSL=false";
	
	private static final String username = "root";
	private static final String password = "";
	
	public static Connection getConection(){
		Connection c = null;
		try {
			c = DriverManager.getConnection(jdbcUrl,username, password);
			System.out.println("You are succsefully conected to database");
			return c;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
}
