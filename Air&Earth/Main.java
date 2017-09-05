
public class Main {

	public static void detectElement(Object o) {
		switch (o.getClass().getName()) {
		case "Air":
			System.out.println("Take a deep breath");
			break;
		case "Earth":
			System.out.println("Walk of life");
			break;

		default:
			System.out.println("Why do we exist?");
			break;
		}

	}

	public static void main(String[] args) {
		Air a = new Air();
		Earth e = new Earth();

		detectElement(a);
		detectElement(e);
	    detectElement(args);
	}

}
