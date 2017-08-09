import java.util.Scanner;

public class kure {
	public int hesapla;
	Scanner input = new Scanner(System.in);
	int yaricap;
	
	void hesapla( ) {	
		

		System.out.print("Kürenin yarýçapýný giriniz");
		yaricap = input.nextInt();
		System.out.println("Hacim = " +Hacim(yaricap));
		};
		
	public int Hacim(int a)
	{			
		
			int hacim=(int) ((4*(3.14)*(a*a*a))/3);
			return hacim;
	}
}
