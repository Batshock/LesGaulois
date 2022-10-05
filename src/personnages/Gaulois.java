package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain brutus = new Romain("Brutus", 4);
		System.out.println(asterix);
		System.out.println(brutus);
//		System.out.println(asterix.prendreParole());
		asterix.parler("Moi, je suis tranquille ! Jamais une femme ne pourra me remplacer. "
						+ "Tailler des menhirs, c'est un travail bien trop délicat !");
		brutus.parler("Les menhirs ne sont rien d'autre que des rochers !");
		asterix.frapper(brutus);
	}
}

