import java.util.ArrayList;
import java.util.List;

public class Modeller {
	
  private List<Item> items = new ArrayList<Item>();
  
  public void addItem(Item item){
		items.add(item);
	}

  public float getCost(){
    float cost = 0.0f;
    
    for (Item item : items) {
       cost += item.fiyat();
    }		
    return cost;
 }
  

  public void showItems(){
  
     for (Item item : items) {
        System.out.print("Model : " + item.name());
        System.out.print(", Renk : " + item.imalat().imal());
        System.out.println(", Fiyat : " + item.fiyat());
     }		
  }	
}



