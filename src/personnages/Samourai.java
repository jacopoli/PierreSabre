package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai (String seigneur,String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Je suis fier de servir le seigneur "+seigneur+".");
	}
	
	public void boire (String boisson) {
		super.parler("Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du "+ boisson+".");
	}
}
