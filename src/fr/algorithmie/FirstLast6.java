package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		/*
		 * Exercice 9 on déclare un tableau d’entiers quelconque On calcule une valeur
		 * booléenne qui contrôle le tableau de la sorte : - elle vaut true si le
		 * tableau a au moins 1 élément et si le premier élément ou le dernier élément
		 * vaut 6. - elle vaut false dans les autres cas • écrire l’algo de valorisation
		 * de cette variable avec le minimum de ligne • Livrez votre code avec un
		 * tableau d’entiers quelconques rendant un résultat positif
		 */

		int[] tab = { 6, 5, 65, 452, 54, 1, 2, 8 };
		boolean b = tab.length > 0 && ((tab[0] == 6) || (tab[tab.length - 1] == 6));

		System.out.println(b);

	}

}
