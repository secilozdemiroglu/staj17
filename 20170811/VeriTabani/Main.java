import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		
		eklesilistele dene = new eklesilistele();
		
		//dene.insanekle("ad1", "sad1", 1, "email");
		
		//dene.insansil(13);
		dene.insanguncelle(13, "g�ncelle1", "g�ncelle2");
		dene.insanlistele();
	}
}