package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent; 




	public String getNom() {
		return nom;
	}


	protected int getArgent() {
		return argent;
	}
	
	public Humain(String nom, String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	public void gagnerArgent(int gain) {
		assert gain>0;
		argent=argent+gain;
	}
	
	protected void setArgent(int argent) {
		this.argent=argent;
	}
	
	public void perdreArgent(int perte) {
		assert perte>0;
		argent=argent-perte;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+")-"+texte);

	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boisson+"." );
	}

	public void boire() {
		parler("Suuui, un bon verre de "+ boisson + "! GLOUPS!");
	}
	
	public void acheter(String achat, int prix) {
		if (prix>argent) {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un " +achat+" à "
					 +prix+" sous.");
		}
		else {
			parler("J'ai "+ argent+ " sous en poche. Je vais pouvoir m'offrir un "+ achat+" à " + prix+ " sous.");
			perdreArgent(prix);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
