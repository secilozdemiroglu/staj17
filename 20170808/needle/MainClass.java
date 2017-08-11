package needle;
import java.util.Scanner;

public class MainClass {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)
	{

	int secim;
	double olasilik;
	double pi = Math.PI;
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	Scanner s3 = new Scanner(System.in);

	System.out.println("Durum seçiniz");
	System.out.println("1- h=l");
	System.out.println("2- 3h=4l");
	System.out.println("3- 4h=3l");
	System.out.println("4- Çýkýþ");
	secim = s1.nextInt();
	
	while (secim != 4) {
		switch (secim) {
		case 1:
			int h=1;
			int l=1;
			
			olasilik= (2*l)/(pi*h);
			System.out.println("1.durumun olasiliði"+olasilik);			
			break;
			
		case 2:
			int s=4;
			int o=3;
			
			olasilik= (2*o)/(pi*s);
			System.out.println("2.durumun olasiliði"+olasilik);	
			break;
			
		case 3:
			int m=3;
			int n=4;
			
			olasilik= (2*n)/(pi*m);
			System.out.println("3.durumun olasiliði"+olasilik);			
			break;
		default:
			System.out.println("Yanlis Seçim!");
			break;
		}

		System.out.println("1- h=l");
		System.out.println("2- 3h=4l");
		System.out.println("3- 4h=3l");
		
		secim = s1.nextInt();
	}
	System.out.println("Program Bitti!");
}
	}

