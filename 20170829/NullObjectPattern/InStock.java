
public class InStock extends Store{
		
	public InStock(String product) {
		this.product= product;
	}
	
	public String getproduct() {
		return product+"  Sipari�iniz al�nd�";
	}
	
	public boolean IsNull() {
		return false;
	}

}
