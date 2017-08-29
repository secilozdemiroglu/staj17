/*
 * Filter Pattern 
 * Filter Pattern bu örnekte olduðu gibi istenilen verileri kategorize etmekte kullanýlabilir.
 * Ya da filtre ile kullanýcýnýn iþlem öncesi login yaptýðýný kontrol edebiliriz. 
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Bilgiler> bilgi = new ArrayList<Bilgiler>();

		bilgi.add(new Bilgiler("Ceket","Erkek", "Kýþlýk"));
		bilgi.add(new Bilgiler("Gömlek", "Erkek", "Yazlýk"));
		bilgi.add(new Bilgiler("Elbise", "Kadýn", "Kýþlýk"));
		bilgi.add(new Bilgiler("Blüz", "Kadýn", "Yazlýk"));
		bilgi.add(new Bilgiler("Pantolon", "Erkek", "Kýþlýk"));
		bilgi.add(new Bilgiler("Pantolon", "Kadýn", "Kýþlýk"));

	      Kriter erkek = new FiltreErkek();
	      Kriter kadin = new FiltreKadin();
	      Kriter kis = new FiltreKis();
	      Kriter yaz = new FiltreYaz();
	      Kriter yazlikvekislik = new xORy(yaz, kis);
	      Kriter kadinveyayazlik = new xANDy(kadin, yaz);
	      
	      System.out.println("Erkek Giyim: ");
	      printKosul(erkek.filterpattern(bilgi));

	      System.out.println("\nKadýn Giyim: ");
	      printKosul(kadin.filterpattern(bilgi));
	      
	      System.out.println("\nKýþlýklar: ");
	      printKosul(kis.filterpattern(bilgi));
	      
	      System.out.println("\nYazlýklar: ");
	      printKosul(yaz.filterpattern(bilgi));

	      System.out.println("\nYazlýklar Ve Kýþlýklar : ");
	      printKosul(yazlikvekislik.filterpattern(bilgi));

	      System.out.println("\nKadýn Giyim Veya Yazlýklar: ");
	      printKosul(kadinveyayazlik.filterpattern(bilgi));
	   }

	   public static void printKosul(List<Bilgiler> filtrele){
	   
	      for (Bilgiler bilgi : filtrele) {
	         System.out.println("Ürün : " + bilgi.getUrun() + ", Ciniyet : " + bilgi.getCins() + ", Mevsim : " + bilgi.getMevsim() );
	      }

	}

}
