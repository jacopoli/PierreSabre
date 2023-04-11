package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent; 
	protected int nbConnaissance=0;
	protected Humain[] memoire = new Humain[30];


	public Humain(String nom, String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}

	public String getNom() {
		return nom;
	}


	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+")-"+texte);

	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boisson+"." );
	}

	public void boire() {
		parler("Suuui, un bon verre de "+ boisson + "! GLOUPS!");
	}
	
	
	protected void gagnerArgent(int gain) {
		assert gain>0;
		argent=argent+gain;
	}
	
	protected void perdreArgent(int perte) {
		assert perte>0;
		argent=argent-perte;
	}
	
	protected void setArgent(int argent) {
		this.argent=argent;
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
	
	public void faireConnaissanceAvec(Humain rencontre) {
		direBonjour();
		rencontre.repondre(this);
		memoriser(rencontre);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance<30) {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}else {
			for (int i = 0; i < nbConnaissance-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[nbConnaissance-1]=humain;
		}
	}
	
	private void repondre(Humain homme) {
		direBonjour();
		this.memoriser(homme);
	}
	
	public void listerConnaissance() {
		System.out.print("Je connais beaucoup de monde dont :");
		for (int i = 0; i < nbConnaissance-1; i++) {
			System.out.print(memoire[i].getNom()+",");
		}
		System.out.println(memoire[nbConnaissance-1].getNom()+".");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
