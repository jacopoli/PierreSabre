package personnages;

public class Traitre extends Samourai {
	private int niveauTraitrise;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconner=(commercant.getArgent())*(1/5);
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner); 
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi "  + argentRanconner +" sous ou gare à toi!");
			commercant.parler("Tout de suite grand "+ getNom() + ".");
		}else
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer!");
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
		parler("je ne peux faire ami mi avec personne car je ne connais personne! Snif");
		}else {
			int don=getArgent()*(1/20);
			Humain ami=memoire[0];
			String nomAmi=ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami mi avec "+ nomAmi +".");
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant " + don+" sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci "+getNom()+". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise>1) {
				niveauTraitrise--;
			}
		}
	}

}
