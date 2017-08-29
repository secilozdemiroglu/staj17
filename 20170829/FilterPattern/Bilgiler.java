
public class Bilgiler {
	
	private String urun;
	private String cinsiyet;
	private String mevsim;

	   public Bilgiler(String urun, String cinsiyet, String mevsim){
	      this.urun = urun;
	      this.cinsiyet = cinsiyet;
	      this.mevsim = mevsim;		
	   }

	   public String getUrun() {
	      return urun;
	   }
	   public String getCins() {
	      return cinsiyet;
	   }
	   public String getMevsim() {
	      return mevsim;
	   }	
}
