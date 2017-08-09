
public class Fruit extends PlantIMPL{
	
	
	public String getName() {
		String gonder="Sweet"+this.getClass().getName();
		return gonder;
	}

}
