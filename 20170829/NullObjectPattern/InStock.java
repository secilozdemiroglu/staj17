
public class InStock extends Store{
		
	public InStock(String product) {
		this.product= product;
	}
	
	public String getproduct() {
		return product+"  Sipariþiniz alýndý";
	}
	
	public boolean IsNull() {
		return false;
	}

}
