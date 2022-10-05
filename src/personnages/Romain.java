package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force+"]";
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
		brutus.recevoirCoup(4);
	}
}
