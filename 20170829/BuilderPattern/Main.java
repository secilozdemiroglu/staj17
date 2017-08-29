
public class Main {

	public static void main(String[] args) {

		ArabaUret uret = new ArabaUret();

		System.out.println("AlfaCentauri Çeþitleri");
		Modeller alfa1 = uret.Model1Uret();
		alfa1.showItems();
		Modeller alfa2 = uret.Model2Uret();
		alfa2.showItems();

		System.out.println("Andromeda Çeþitleri");
		Modeller andro1 = uret.Model3Uret();
		andro1.showItems();
		Modeller andro2 = uret.Model4Uret();
		andro2.showItems();

		System.out.println("MilkyWay Çeþitleri");
		Modeller milky1 = uret.Model5Uret();
		milky1.showItems();
		Modeller milky2 = uret.Model6Uret();
		milky2.showItems();

		System.out.println("Total Cost: " + (alfa1.getCost() +alfa2.getCost()+ andro1.getCost()+ andro2.getCost() + milky1.getCost()+ milky2.getCost()));
	}

}
