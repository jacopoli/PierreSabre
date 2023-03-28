package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza (String nom, String boisson, int argent, String clan, int reputation) {
	super(nom, boisson, argent);
	this.clan=clan;
	this.reputation=reputation;
	}
	
	public int perdre() {
		
		int perte=getArgent();
		parler("J’ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de "+clan+".");
		setArgent(0);
		if (reputation!=0) {
			reputation--;
		}
		return perte;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+ "?");
		parler("Je l'ai dépouillé de ses "+gain+" sous.");
		gagnerArgent(gain);
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J’ai piqué les "+gain+" sous de Marco, ce qui me fait "+ getArgent() +" sous dans ma poche. Hi ! Hi !");
	}
}
