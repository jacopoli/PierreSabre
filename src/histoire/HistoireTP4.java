package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", 15);
		Yakuza yaku=new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4);
		Ronin roro=new Ronin("Roro", "shochu", 60);
		roro.provoquer(yaku);
	}

}
