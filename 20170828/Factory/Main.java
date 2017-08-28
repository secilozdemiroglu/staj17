
public class Main {

	public static void main(String[] args) {

		MovableFactory mfactory = new MovableFactory();

		Move k= mfactory.getfreight("KAMYON");
		k.transport();
	  
		Move o= mfactory.getfreight("OTOMOBÝL");
		o.transport();
		
		Move p= mfactory.getfreight("PALET");
		p.transport();
  
	}

}
