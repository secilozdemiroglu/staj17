package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.Problems;

public class ProblemModel extends Model {

	public void add(Problems prblm) throws SQLException {

		stmt = con.prepareStatement("INSERT INTO problems VALUE(NULL,?,NOW())");
		stmt.setString(1, prblm.getProblem());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Probem eklendi");

	}

	public void update(Problems prblm) throws SQLException {

		stmt = con.prepareStatement("UPDATE problems SET problem=? WHERE ProbID=?");
		stmt.setString(1, prblm.getProblem());
		stmt.setInt(2, prblm.getProbID());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Probem guncellendi");

	}

	public Problems readbyid(int id) throws SQLException {

		stmt = con.prepareStatement("SELECT* FROM problems WHERE ProbID=?");
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			Problems problem = new Problems();
			problem.setProbID(rs.getInt("ProbID"));
			problem.setProblem(rs.getString("problem"));
			return problem;
		}
		return null;
	}

	public void readall(Problems prblm) throws SQLException {

		ArrayList<Problems> list = new ArrayList<Problems>();
		ResultSet rs;
		stmt = con.prepareStatement("SELECT* FROM problems");
		rs = stmt.executeQuery();

		while (rs.next()) {
			Problems p = new Problems();
			p.setProblem(rs.getString("problem"));
			p.setDate(rs.getDate("date"));
			list.add(p);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getProblem()+"	"+list.get(i).getDate());
		}

	}

	public void delete(int id) throws SQLException {

		stmt = con.prepareStatement("Delete FROM problems WHERE ProbID=?");
		stmt.setInt(1, id);
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Probem silindi");

	}

}
