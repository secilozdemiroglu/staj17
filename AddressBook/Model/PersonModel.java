package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entity.Person;

public class PersonModel extends Model {

public int addPerson(Person prsn) throws SQLException {

		int lastId = 0;
// insert into ifadesi
		return lastId;
	}
	
public ArrayList<Person> readAll() {
		ArrayList<Person> list = new ArrayList();
// Select * From ifadesi
		return list;
	}

public void deletePerson(int id) throws SQLException {
//Delete ifadesi
	System.out.println("Silindi");
}
}
