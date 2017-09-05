package Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import Entity.Person;
import Model.PersonModel;

public class PersonController {
	
public PersonModel pm= new PersonModel();

public int addPerson(Person prsn) {
	int result = 0;	
	prsn.setName(prsn.getName());	//örnekte sadece isim eklenmiþtir. Yaþ,Sokakve þehir seçenekleri de eklenebilir.
	try {
		result = pm.addPerson(prsn);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
}

public ArrayList<Person> readAll() {
	return pm.readAll();
}

public void deletePerson(int prsn) {
	try {
		pm.deletePerson(prsn);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	
}
