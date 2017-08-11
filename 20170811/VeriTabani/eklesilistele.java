import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class eklesilistele {

	public void insanekle(String ad, String sad, int cins, String mail) {
		try {
			baglanti add = new baglanti();
			Statement stmt = add.baglan().createStatement();
			int rs = stmt.executeUpdate(
					"INSERT INTO persons VALUE(NULL,'" + ad + "','" + sad + "'," + cins + ",'" + mail + "')");

		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public void insanlistele() {
		try {
			baglanti add = new baglanti();
			java.sql.Statement stmt = add.baglan().createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
			while (rs.next()) {
				int id = rs.getInt("Id");
				String ad = rs.getString("Name");
				String sad = rs.getString("Surname");
				int cins = rs.getInt("Gender");
				String mail = rs.getString("Email");

				System.out.println(
						"ID: " + id + " Ýsim: " + ad + " Soyad: " + sad + " Cinsiyet: " + cins + " Email: " + mail);

			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public void insansil(int id) {
		try {
			baglanti add = new baglanti();
			Statement stmt = add.baglan().createStatement();
			int rs = stmt.executeUpdate("Delete FROM persons WHERE Id=" + id + " ");

		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public void insanguncelle(int id, String ad, String sad) {
		try {
			baglanti add = new baglanti();
			Statement stmt = add.baglan().createStatement();
			int rs = stmt.executeUpdate("Update persons SET Name='"+ad+"',Surname='"+sad+"' WHERE Id=" + id +"   ");

		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
}
