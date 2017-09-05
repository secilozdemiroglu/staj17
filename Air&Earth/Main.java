
public class Main {

	public static void detectElement(Object o) {
		

		if (o instanceof Air) {
			System.out.println("Take a deep breath");
		} else if (o instanceof Earth) {
			System.out.println("Walk of life");
		} else {
			System.out.println("Why do we exist?");
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
