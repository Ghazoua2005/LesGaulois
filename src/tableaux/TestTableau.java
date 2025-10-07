package tableaux;

public class TestTableau {

	public static void main(String[] args) {
		int[] tableauEntiers = { 5, 7, 2, 5, 3 };
		String[] tableauChaines = new String[5];
		int nbchaines = 0;

		System.out.println(tableauEntiers);

		for (int entier : tableauEntiers) {
			System.out.println(entier + " ");

		}
		for (int i = 0; i < tableauEntiers.length; i++) {
			int entier = tableauEntiers[i];
			System.out.print(entier);
			if (i < tableauEntiers.length - 1) {
				System.out.println(",");

			}

		}
		for (String chaine : tableauChaines) {
			System.out.println(chaine + "");

		}
		tableauChaines[nbchaines] = "Hello";
		nbchaines++;
		tableauChaines[nbchaines] = "World";
		nbchaines++;
		for (int i = 0; i < nbchaines; i++) {
			System.out.print(tableauChaines[i] + " ");

		}
		tableauChaines[3] = " !";
		for (String chaine : tableauChaines) {
			if (chaine != null) {
				System.out.println(chaine + " ");

			}

		}
	}

}
