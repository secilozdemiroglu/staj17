
public class Main {

	public static void main(String[] args) {

		Forklift forklift = new Forklift();

		Move k= forklift.getfreight("KAMYON");
		k.transport();
	  
		Move o= forklift.getfreight("OTOMOBÝL");
		o.transport();
		
		Move p= forklift.getfreight("PALET");
		p.transport();
  
	}

}
