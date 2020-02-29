//exercice 2
package fr.algorithmie;

public class Inversioncontenu {
	public static void main(String[] args) {
//Soit le tableau suivant :
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Créer un tableau arrayCopy et copier tous les éléments de array dans
		// arrayCopy mais dans l’ordre inverse.
		int[] arrayCopy = new int[array.length];

		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {

			arrayCopy[j] = array[i];
			j--;
		}

		// Afficher l’ensemble des éléments des 2 tableaux
		System.out.println("array :");
		for (int nombres : array) {
			System.out.println(nombres);
		}

		System.out.println("arrayCopy :");
		for (int nombres : arrayCopy) {
			System.out.println(nombres);
		}
	}
}