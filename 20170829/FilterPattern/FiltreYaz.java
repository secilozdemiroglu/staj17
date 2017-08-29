import java.util.ArrayList;
import java.util.List;

public class FiltreYaz implements Kriter {

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> yaz = new ArrayList<Bilgiler>();

		for (Bilgiler bilgiler : bilgi) {
			if (bilgiler.getMevsim().equalsIgnoreCase("Yazlýk")) {
				yaz.add(bilgiler);
			}
		}

		return yaz;
	}

}