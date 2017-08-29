import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args )
	{
		String[] array1= {"a","b","c"} ;
		String[] array2= {"1","2","3","5"} ;
		String[] array3= {"Mazhsar","Fuat","Özkan"} ;
		String[] array4=new String[array2.length];
		
		ArrayList<String> Array = new ArrayList<String>();
				
		for(int i=0;i<3;i++)
		{
			Array.add(array1[i]);
		}
		System.out.println("1.liste :  "+ Array.get(0)+Array.get(1)+Array.get(2));
		
		int k= array2.length -1;
		
		for(int j=0;j<array2.length;j++)
		{
			array4[j]=array2[k];
			k--;
		}
		
		k=0;
		for(int j=0;j<array2.length;j++)
		{
			array2[j]=array4[k];
			k++;
		}
		System.out.println("2.liste :  "+ array2[1]+","+array2[2]+","+array2[3]);
		 
		HashMap<String, Object> newHashMap= new HashMap<String,Object>();
		
		
		newHashMap.put("harfler", array1);
		newHashMap.put("sayilar", array2);
		newHashMap.put("ustalar", array3);
		
				
		for(Map.Entry gosterici : newHashMap.entrySet())
		{
			System.out.println(gosterici.getKey()+" "+gosterici.getValue());
		}
		
}
	
	
}
