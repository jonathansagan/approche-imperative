package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		/*
		 * Exercice 9 on d�clare un tableau d�entiers quelconque On calcule une valeur
		 * bool�enne qui contr�le le tableau de la sorte : - elle vaut true si le
		 * tableau a au moins 1 �l�ment et si le premier �l�ment ou le dernier �l�ment
		 * vaut 6. - elle vaut false dans les autres cas � �crire l�algo de valorisation
		 * de cette variable avec le minimum de ligne � Livrez votre code avec un
		 * tableau d�entiers quelconques rendant un r�sultat positif
		 */

		int[] tab = { 6, 5, 65, 452, 54, 1, 2, 8 };
		boolean b = tab.length > 0 && ((tab[0] == 6) || (tab[tab.length - 1] == 6));

		System.out.println(b);

	}

}
