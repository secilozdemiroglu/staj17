
public class MovableFactory {

	 public Move getfreight  (String freightType){
	      if(freightType == null){
	         return null;
	      }		
	      if(freightType.equalsIgnoreCase("KAMYON")){
	         return new Kamyon();
	         
	      } else if(freightType.equalsIgnoreCase("OTOMOBÝL")){
	         return new Otomobil();
	         
	      } else if(freightType.equalsIgnoreCase("PALET")){
	         return new Palet();
	      }
	      
	      return null;
	   }
	
}
