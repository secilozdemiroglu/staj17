import java.util.List;


public class xORy implements Kriter {
	
	private Kriter anakriter;
	private Kriter sonrakikriter;
	
	public xORy(Kriter anakriter, Kriter sonrakikriter) {
		this.anakriter = anakriter;
		this.sonrakikriter = sonrakikriter;
	}

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> ilkKriter�cerik = anakriter.filterpattern(bilgi);
		List<Bilgiler> sonrakikriter�cerik = sonrakikriter.filterpattern(bilgi);
		
		for (Bilgiler bilgiler : sonrakikriter�cerik) {
			if (!ilkKriter�cerik.contains(bilgiler)) {
				ilkKriter�cerik.add(bilgiler);
			}
		}
		return ilkKriter�cerik;
	}

}




	
	



