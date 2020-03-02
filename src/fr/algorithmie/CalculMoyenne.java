package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// Quelle est la moyenne des éléments du tableau?

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int somme = 0;
		for (int i : array) {
			somme += i;
		}

		System.out.println("La somme est : " + somme);

		int moyenne = somme / array.length;
		System.out.println("La moyenne tu tableau est :" + moyenne);
	}

}
