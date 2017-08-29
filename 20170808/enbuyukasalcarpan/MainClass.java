package enbuyukasalcarpan;

import java.util.Scanner;

public class MainClass {
	
	static long sayi;
	public static void main(String[] args)
	
	{			
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz: ");
		sayi = input.nextLong();
		long j=2;
		long sayac=0;
		if (sayi<=0)
		{
			System.out.println("sýfýr ve sýfýrdan küçük sayý girilemez");
		}
		for (long i = 2; i != sayi; ++i)
		{
			if (sayi % i == 0)
			{
				sayi/=i;
				j=i;
				sayac++;
			}
			
		}
		System.out.println("En Buyuk Asal Carpan: "+j);
		System.out.println("Deneme sayýsý: "+sayac);
	}

}
