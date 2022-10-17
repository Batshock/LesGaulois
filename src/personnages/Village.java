package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageoisMax;
	public int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMax) {
	this.nom = nom;
	this.villageois = new Gaulois[nbVillageoisMax];
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	public String getNom() {
	return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois];
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
		Chef chefVillage = new Chef("Abraracourcix", 6, 1, village);
		Gaulois asterix = new Gaulois("Asterix", 8);
		
	}
}
