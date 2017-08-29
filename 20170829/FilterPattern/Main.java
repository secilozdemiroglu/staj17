/*
 * Filter Pattern 
 * Filter Pattern bu �rnekte oldu�u gibi istenilen verileri kategorize etmekte kullan�labilir.
 * Ya da filtre ile kullan�c�n�n i�lem �ncesi login yapt���n� kontrol edebiliriz. 
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Bilgiler> bilgi = new ArrayList<Bilgiler>();

		bilgi.add(new Bilgiler("Ceket","Erkek", "K��l�k"));
		bilgi.add(new Bilgiler("G�mlek", "Erkek", "Yazl�k"));
		bilgi.add(new Bilgiler("Elbise", "Kad�n", "K��l�k"));
		bilgi.add(new Bilgiler("Bl�z", "Kad�n", "Yazl�k"));
		bilgi.add(new Bilgiler("Pantolon", "Erkek", "K��l�k"));
		bilgi.add(new Bilgiler("Pantolon", "Kad�n", "K��l�k"));

	      Kriter erkek = new FiltreErkek();
	      Kriter kadin = new FiltreKadin();
	      Kriter kis = new FiltreKis();
	      Kriter yaz = new FiltreYaz();
	      Kriter yazlikvekislik = new xORy(yaz, kis);
	      Kriter kadinveyayazlik = new xANDy(kadin, yaz);
	      
	      System.out.println("Erkek Giyim: ");
	      printKosul(erkek.filterpattern(bilgi));

	      System.out.println("\nKad�n Giyim: ");
	      printKosul(kadin.filterpattern(bilgi));
	      
	      System.out.println("\nK��l�klar: ");
	      printKosul(kis.filterpattern(bilgi));
	      
	      System.out.println("\nYazl�klar: ");
	      printKosul(yaz.filterpattern(bilgi));

	      System.out.println("\nYazl�klar Ve K��l�klar : ");
	      printKosul(yazlikvekislik.filterpattern(bilgi));

	      System.out.println("\nKad�n Giyim Veya Yazl�klar: ");
	      printKosul(kadinveyayazlik.filterpattern(bilgi));
	   }

	   public static void printKosul(List<Bilgiler> filtrele){
	   
	      for (Bilgiler bilgi : filtrele) {
	         System.out.println("�r�n : " + bilgi.getUrun() + ", Ciniyet : " + bilgi.getCins() + ", Mevsim : " + bilgi.getMevsim() );
	      }

	}

}
