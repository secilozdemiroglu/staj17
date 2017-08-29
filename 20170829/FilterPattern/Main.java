/*
 * Filter Pattern 
 * Filter Pattern bu örnekte olduğu gibi istenilen verileri kategorize etmekte kullanılabilir.
 * Filtre ile kullanıcının işlem öncesi login yaptığını kontrol edebiliriz ya da hata ayıklamada kullanabiliriz. 
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Bilgiler> bilgi = new ArrayList<Bilgiler>();

		bilgi.add(new Bilgiler("Ceket","Erkek", "Kışlık"));
		bilgi.add(new Bilgiler("Gömlek", "Erkek", "Yazlık"));
		bilgi.add(new Bilgiler("Elbise", "Kadın", "Kışlık"));
		bilgi.add(new Bilgiler("Blüz", "Kadın", "Yazlık"));
		bilgi.add(new Bilgiler("Pantolon", "Erkek", "Kışlık"));
		bilgi.add(new Bilgiler("Pantolon", "Kadın", "Kışlık"));

	      Kriter erkek = new FiltreErkek();
	      Kriter kadin = new FiltreKadin();
	      Kriter kis = new FiltreKis();
	      Kriter yaz = new FiltreYaz();
	      Kriter yazlikvekislik = new xORy(yaz, kis);
	      Kriter kadinveyayazlik = new xANDy(kadin, yaz);
	      
	      System.out.println("Erkek Giyim: ");
	      printKosul(erkek.filterpattern(bilgi));

	      System.out.println("\nKadın Giyim: ");
	      printKosul(kadin.filterpattern(bilgi));
	      
	      System.out.println("\nKışlıklar: ");
	      printKosul(kis.filterpattern(bilgi));
	      
	      System.out.println("\nYazlıklar: ");
	      printKosul(yaz.filterpattern(bilgi));

	      System.out.println("\nYazlıklar Ve Kışlıklar : ");
	      printKosul(yazlikvekislik.filterpattern(bilgi));

	      System.out.println("\nKadın Giyim Veya Yazlıklar: ");
	      printKosul(kadinveyayazlik.filterpattern(bilgi));
	   }

	   public static void printKosul(List<Bilgiler> filtrele){
	   
	      for (Bilgiler bilgi : filtrele) {
	         System.out.println("Ürün : " + bilgi.getUrun() + ", Ciniyet : " + bilgi.getCins() + ", Mevsim : " + bilgi.getMevsim() );
	      }

	}

}
