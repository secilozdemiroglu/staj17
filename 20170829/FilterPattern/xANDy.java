import java.util.List;

public class xANDy implements Kriter{
	
	private Kriter anakriter;
	private Kriter sonrakikriter;
	
	public xANDy(Kriter anakriter, Kriter sonrakikriter) {
		this.anakriter = anakriter;
		this.sonrakikriter = sonrakikriter;
	}

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> ilkKriter = anakriter.filterpattern(bilgi);
		return sonrakikriter.filterpattern(ilkKriter);
	}

}

