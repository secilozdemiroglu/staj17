import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> siparis = new ArrayList();
		siparis.add("Ceket");
		siparis.add("Pantolon");
		siparis.add("Ayakkab�");
		siparis.add("T-Shit");
		siparis.add("G�zl�k");
		
		for (String s: siparis ) {
			System.out.println(Order.getOrder(s).getproduct());
		}

	}

}
