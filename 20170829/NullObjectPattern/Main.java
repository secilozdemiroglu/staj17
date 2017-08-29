import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> siparis = new ArrayList();
		siparis.add("Ceket");
		siparis.add("Pantolon");
		siparis.add("Ayakkabý");
		siparis.add("T-Shit");
		siparis.add("Gözlük");
		
		for (String s: siparis ) {
			System.out.println(Order.getOrder(s).getproduct());
		}

	}

}
