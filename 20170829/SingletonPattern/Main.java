
/*
Singleton Design Pattern
Amaç: singleton nesnesinin sistem içerisinde yalnýzca bir kez oluþturulmasýdýr. 
Buna örnek olarak bir web sayfasýnýn ilk kez yüklenirken yapmasý gereken veritabaný iþlemleri verilebilir.

Singleton iskeleti, farklý implementasyonlar ile oluþturulabilse de temel olarak 3 operasyon her zaman yapýlmalýdýr.
1)Singleton sýnýfýna, ayný sýnýf adý ile static üye deðiþken tanýmlanmalýdýr.
2)Kurucu metot(Constructor) private tanýmlanmalýdýr.
3)Singleton nesnesini döndüren public static bir metot tanýmlanmalýdýr.
*/
public class Main {

	public static void main(String[] args) {

		// Kullanýlabilecek olan tek kayýdý çaðýrma iþlemi;
		DefterKayit kayit = DefterKayit.getInstance();
		kayit.showMessage();

	}

}
