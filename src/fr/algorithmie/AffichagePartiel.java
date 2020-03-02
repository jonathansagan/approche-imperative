package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		/*
		 * Combiner une boucle et un test de manière à n’afficher que les entiers
		 * supérieurs à 3
		 */
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		System.out.println("les entiers supérieurs à 3 sont :");
		for (int nombres : array) {

			if (nombres > 3) {
				System.out.println(nombres);
			}
		}
		/*
		 * Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		 */
		System.out.println("les entiers pairs sont :");
		for (int nombres : array) {

			if (nombres % 2 == 0) {
				System.out.println(nombres);
			}
		}

		/*
		 * Combiner une boucle et un test de manière à n’afficher que les valeurs
		 * correspondant aux index pairs
		 */

		System.out.println("les valeurs correspondants aux index pairs sont :");
		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		/*
		 * Combiner une boucle et un test de manière à n’afficher que les entiers
		 * impairs
		 */
		System.out.println("les entiers impairs sont : ");
		for (int nombres : array) {

			if (nombres % 2 != 0) {
				System.out.println(nombres);
			}
		}

	}
}
