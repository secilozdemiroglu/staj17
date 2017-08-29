import java.util.ArrayList;
import java.util.List;

public class FiltreKadin implements Kriter {

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> kadingiyim = new ArrayList<Bilgiler>();

		for (Bilgiler bilgiler : bilgi) {
			if (bilgiler.getCins().equalsIgnoreCase("Kad�n")) {
				kadingiyim.add(bilgiler);
			}
		}

		return kadingiyim;
	}

}