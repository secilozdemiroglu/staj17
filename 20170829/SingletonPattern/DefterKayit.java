
public class DefterKayit {

	   private static DefterKayit instance = new DefterKayit();

	   //Buradaki ama� manuel olarak instance olu�turulmas�n� engellemek
	   private DefterKayit(){}

		// Kullan�labilecek olan tek kay�d� �a��r�r
	   public static DefterKayit getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Kay�t Yap�ld� !");
	   }
	
}
