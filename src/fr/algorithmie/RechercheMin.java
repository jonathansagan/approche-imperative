package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// Rechercher le Min du tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int min = array[0];
		for (int nombres : array) {
			if (nombres < min) {
				min = nombres;

			}

		}
		System.out.println("le minimum est : "+min);
	}
}
