
/*
Singleton Design Pattern
Ama�: singleton nesnesinin sistem i�erisinde yaln�zca bir kez olu�turulmas�d�r. 
Buna �rnek olarak bir web sayfas�n�n ilk kez y�klenirken yapmas� gereken veritaban� i�lemleri verilebilir.

Singleton iskeleti, farkl� implementasyonlar ile olu�turulabilse de temel olarak 3 operasyon her zaman yap�lmal�d�r.
1)Singleton s�n�f�na, ayn� s�n�f ad� ile static �ye de�i�ken tan�mlanmal�d�r.
2)Kurucu metot(Constructor) private tan�mlanmal�d�r.
3)Singleton nesnesini d�nd�ren public static bir metot tan�mlanmal�d�r.
*/
public class Main {

	public static void main(String[] args) {

		// Kullan�labilecek olan tek kay�d� �a��rma i�lemi;
		DefterKayit kayit = DefterKayit.getInstance();
		kayit.showMessage();

	}

}
