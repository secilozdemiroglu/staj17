
import java.util.ArrayList;
import java.util.List;

public class FiltreKis implements Kriter {

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> kis = new ArrayList<Bilgiler>();

		for (Bilgiler bilgiler : bilgi) {
			if (bilgiler.getMevsim().equalsIgnoreCase("Kışlık")) {
				kis.add(bilgiler);
			}
		}

		return kis;
	}

}