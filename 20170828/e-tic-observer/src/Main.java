import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Arama a = new Arama();	
		Depo d = new Depo();

		
		ArrayList<Observer> liste = new ArrayList<Observer>();
		liste.add(a);
		liste.add(d);
		
		for(int i=0;i<liste.size(); i++) {
			
			Observer o = liste.get(i);
			o.update();
		}
	

	}
}
