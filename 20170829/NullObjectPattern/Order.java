
public class Order {
	
	public static final String[] products = {"Ceket","Pantolon","Ayakkabý"};

	   public static Store getOrder(String product){
	   
	      for (int i = 0; i < products.length; i++) {
	         if (products[i].equalsIgnoreCase(product)){
	            return new InStock(product);
	         }
	      }
	      return new NonStocked();
	   }

}
