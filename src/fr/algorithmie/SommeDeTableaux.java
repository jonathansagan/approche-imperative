package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// Calculer la somme de deux tableaux
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayb = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
		if (array.length == arrayb.length)

		{
			System.out.println("Le tableau résultant de la somme des tableaux a et b est :");
			int[] sommedestableaux = new int[array.length];
			for (int i = 0; i < array.length; i++) {

				sommedestableaux[i] = array[i] + arrayb[i];
				System.out.println(sommedestableaux[i]);

			}

		} else {
			System.out.println("Les tableaux n'ont pas la même taille");
		}
	}
}