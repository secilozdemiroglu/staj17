package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
Connection con;
	
	public static final String URL = "jdbc:mysql://localhost:3306/cozum_masasivt?verifyServerCertificate=false&useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public Connection baglan() {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException sqle) {
			sqle.getMessage();
		}

		return con;
	}

}
