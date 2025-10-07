package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, int nbHabitants, Gaulois chef) {
		this.nom = nom;
		villageois = new Gaulois[nbHabitants];
		this.chef = chef;
		chef.setVillage(this);

	}

	public Gaulois getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			gaulois.setVillage(this);
		}

	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 0 && numVillageois < nbVillageois) {
			return villageois[numVillageois];

		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village");
			return null;
		}

	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		Gaulois gaulois = village.trouverVillageois(30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);

	}
}
