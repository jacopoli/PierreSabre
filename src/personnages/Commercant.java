package personnages;

public class Commercant extends Humain {
	
	public Commercant (String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous! je te remercie g�n�reux donateur!");
	}
	
	public int seFaireExtorquer() {
		int argent=getArgent();
		setArgent(0);
		parler("J�ai tout perdu! Le monde est trop injuste.");
		return argent;
	}
}
