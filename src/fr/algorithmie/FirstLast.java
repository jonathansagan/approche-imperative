package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// Exercice 10 FirstLast
		/*
		 * Dans cette classe, on d�clare un tableau d�entiers o {4,3,6,1,4}
		 * � On calcule une valeur bool�enne qui contr�le le tableau de la sorte : 
		 *  o elle vaut true si le tableau est de longueur
		 * strictement sup�rieure � 1 et que le premier et le dernier �l�ment du tableau
		 * ont la m�me valeur 
		 *  o elle vaut false dans les autres cas 
		 * � �crire l�algo de valorisation de cette variable avec le minimum de ligne 
		 * � Livrez votre code avec un tableau d�entiers quelconques rendant un r�sultat positif.
		 */

		int [] tab = {4,3,6,1,4};
		boolean b = tab.length > 1 && ((tab[0] == tab[tab.length-1]));

		System.out.println(b);
	}

}
