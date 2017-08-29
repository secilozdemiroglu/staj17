import java.util.List;


public class xORy implements Kriter {
	
	private Kriter anakriter;
	private Kriter sonrakikriter;
	
	public xORy(Kriter anakriter, Kriter sonrakikriter) {
		this.anakriter = anakriter;
		this.sonrakikriter = sonrakikriter;
	}

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> ilkKriterİcerik = anakriter.filterpattern(bilgi);
		List<Bilgiler> sonrakikriterİcerik = sonrakikriter.filterpattern(bilgi);
		
		for (Bilgiler bilgiler : sonrakikriterİcerik) {
			if (!ilkKriterİcerik.contains(bilgiler)) {
				ilkKriterİcerik.add(bilgiler);
			}
		}
		return ilkKriterİcerik;
	}

}




	
	



