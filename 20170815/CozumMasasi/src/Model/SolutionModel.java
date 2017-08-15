package Model;

import java.sql.SQLException;

import Entity.Solutions;


public class SolutionModel extends Model {
	public void addsolution(Solutions sltion) throws SQLException {

		stmt = con.prepareStatement("INSERT INTO solutions VALUE(NULL,?)");
		stmt.setString(1, sltion.getSolution());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Not eklendi");

	}
	
	public void updatesolution(Solutions sltion) throws SQLException {

		stmt = con.prepareStatement("UPDATE solutions SET solution=? WHERE SolutionID=?");
		stmt.setString(1, sltion.getSolution());
		stmt.setInt(2, sltion.getSolutionID());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Notunuz guncellendi");

	}

	public void deletesolution(int id) throws SQLException {

		stmt = con.prepareStatement("Delete FROM solutions WHERE SolutionID=?");
		stmt.setInt(1, id);
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Not silindi");

	}

}
