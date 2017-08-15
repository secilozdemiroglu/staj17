package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.Tags;

public class TagModel extends Model {

	public void addTag(Tags tag) throws SQLException {

		stmt = con.prepareStatement("INSERT INTO tags VALUE(NULL,?)");
		stmt.setString(1, tag.getTag());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Tag eklendi");

	}

	public void updateTag(Tags tag) throws SQLException {

		stmt = con.prepareStatement("UPDATE tags SET tag=? WHERE TagID=?");
		stmt.setString(1, tag.getTag());
		stmt.setInt(2, tag.getTagID());
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Tag guncellendi");

	}

	public void deleteTag(int tagid) throws SQLException {

		stmt = con.prepareStatement("Delete FROM tags WHERE TagID=?");
		stmt.setInt(1, tagid);
		@SuppressWarnings("unused")
		int rs = stmt.executeUpdate();
		System.out.println("Tag silindi");

	}

	public ArrayList<Tags> readbyid(int remarkid) throws SQLException {

		stmt = con.prepareStatement("SELECT* FROM tags WHERE TagID=?");
		stmt.setInt(1, remarkid);
		ResultSet rs = stmt.executeQuery();
		ArrayList<Tags> list = new ArrayList<Tags>();

		while (rs.next()) {
			Tags tg = new Tags();
			tg.setTagID(rs.getInt("TagID"));
			tg.setTag(rs.getString("tag"));
			list.add(tg);
		}
		return list;
	}
	
	public int readBytagname(Tags tag) throws SQLException {
		PreparedStatement stmt2;
		int control=0;
		stmt2=con.prepareStatement("SELECT Count(*) FROM tags WHERE tag=?");
		stmt2.setString(1, tag.getTag());
		ResultSet rs= stmt2.executeQuery();
		
		while (rs.next()) {
			control=rs.getInt(1);
		}		
		return control;
	}
}
