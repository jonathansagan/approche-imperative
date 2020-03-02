package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// Exercice 8 : Somme de deux tableaux différents

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayb = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int[] arraySomme = array.clone();

		for (int i = 0; i < arrayb.length; i++) {
			arraySomme[i] += arrayb[i];
		}

		System.out.println("arraySomme : ");
		for (int entiers : arraySomme) {
			System.out.println(entiers);
		}
	}

}
