import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass 
{

	public static void main(String[] args )
	{
		String[] array1= {"a","b","c"} ;
		int[] array2= {1,2,3,5} ;
		String[] array3= {"Mazhsar","Fuat","Özkan"} ;
		int[] array4=new int[array2.length];
		
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
		
		HashMap<String,String> newHashMap= new HashMap<String,String>();
		
		newHashMap.put("Harfler1", array1[0]);
		newHashMap.put("Harfler2", array1[1]);
		newHashMap.put("Harfler3", array1[2]);
				
		newHashMap.put("Sayilar1", String.valueOf(array2[0]));
		newHashMap.put("Sayilar2", String.valueOf(array2[1]));
		newHashMap.put("Sayilar3", String.valueOf(array2[2]));
		newHashMap.put("Sayilar4", String.valueOf(array2[3]));
		
		newHashMap.put("Ustalar1", array3[0]);
		newHashMap.put("Ustalar2", array3[1]);
		newHashMap.put("Ustalar3", array3[2]);
		
		for(Map.Entry gosterici : newHashMap.entrySet())
		{
			System.out.println(gosterici.getKey()+" "+gosterici.getValue());
		}
		
}
	
	
}
