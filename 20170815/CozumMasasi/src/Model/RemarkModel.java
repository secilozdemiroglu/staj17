package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.Remarks;

public class RemarkModel extends Model {

	public void addremark(Remarks rmrk) throws SQLException {

		stmt = con.prepareStatement("INSERT INTO remarks VALUE(NULL,?)");
		stmt.setString(1, rmrk.getRemark());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Not eklendi");

	}

	public void updateRemark(Remarks rmrk) throws SQLException {

		stmt = con.prepareStatement("UPDATE remarks SET remark=? WHERE RemarkID=?");
		stmt.setString(1, rmrk.getRemark());
		stmt.setInt(2, rmrk.getRemarkID());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Notunuz guncellendi");

	}

	public void deleteremark(int remarkid) throws SQLException {

		stmt = con.prepareStatement("Delete FROM remarks WHERE RemarkID=?");
		stmt.setInt(1, remarkid);
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Not silindi");

	}

	public ArrayList<Remarks> readbyid(int remarkid) throws SQLException {

		stmt = con.prepareStatement("SELECT* FROM remarks WHERE ProblemID=?");
		stmt.setInt(1, remarkid);
		ResultSet rs = stmt.executeQuery();
		ArrayList<Remarks>list=new ArrayList<Remarks>();

		while (rs.next()) {
			Remarks remark = new Remarks();
			remark.setProblemID(rs.getInt("ProblemID"));
			remark.setRemark(rs.getString("remark"));
			list.add(remark);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getRemark()+"	");
		}
		return list;		
	}
}
