import java.util.ArrayList;
import java.util.List;

public class FiltreErkek implements Kriter {
	@Override
	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> erkekgiyim = new ArrayList<Bilgiler>();

		for (Bilgiler bilgiler : bilgi) {
			if (bilgiler.getCins().equalsIgnoreCase("Erkek")) {
				erkekgiyim.add(bilgiler);
			}
		}

		return erkekgiyim;
	}

}
