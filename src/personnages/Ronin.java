package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don=getArgent()/10;
		parler(beneficiaire.getNom()+"prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}
	
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouv� vermine, tu vas payer pour ce que tu as fait � ce pauvre marchand!");
		if (adversaire.getReputation()>2*honneur) {
			adversaire.gagner(getArgent());
			setArgent(0);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur++;
		}
		else
		{
			parler("Je t�ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
		}
	}
}
