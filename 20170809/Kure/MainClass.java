import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Object> liste = new ArrayList<Object>();
		Kup k = new Kup(1);
		Piramit p = new Piramit(1);
		kure kur = new kure(1);
		liste.add(k);
		liste.add(p);
		liste.add(kur);

		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
			Object o = liste.get(i);
			if (o instanceof kure) {

			} else if (o instanceof Piramit) {

			} else if (o instanceof Kup) {

			}
		}
	}
}
