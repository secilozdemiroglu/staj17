
public class Main {

	public static void main(String[] args) {

		MotorFactory motorfactory = new MotorFactory();

		Forklift k= motorfactory.getfreight("KAMYON");
		k.transport();
	  
		Forklift o= motorfactory.getfreight("OTOMOB�L");
		o.transport();
		
		Forklift p= motorfactory.getfreight("PALET");
		p.transport();

		
		
	}

}
