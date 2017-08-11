import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {
	Connection con;
	ResultSet rs;
	public static final String URL = "jdbc:mysql://localhost:3306/intern_dev?verifyServerCertificate=false&useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public Connection baglan() {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM persons");
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
		return con;
	}
}
