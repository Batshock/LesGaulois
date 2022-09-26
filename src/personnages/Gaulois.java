package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion;
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		
	}
	public void parler(String texte) {
		prendreParole();
	}
	private void prendreParole() {
		// TODO Auto-generated method stub
		
	}
}
