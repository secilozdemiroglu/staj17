
public class DefterKayit {

	   private static DefterKayit instance = new DefterKayit();

	   //Buradaki amaç manuel olarak instance oluþturulmasýný engellemek
	   private DefterKayit(){}

		// Kullanýlabilecek olan tek kayýdý çaðýrýr
	   public static DefterKayit getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Kayýt Yapýldý !");
	   }
	
}
