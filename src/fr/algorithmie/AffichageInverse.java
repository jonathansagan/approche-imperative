//exercice 1

package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
// affiche bon ordre
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
// affichage inverse
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
// copier un tableau dans un autre tableau
		 
		int[] arrayCopy = array.clone();  // t2 pointe sur un nouveau tableau copie de t1        
		arrayCopy[ 0 ] = 1; // on affecte 1 à la première cellule de t2                         
		System.out.println(arrayCopy[ 0 ]); // affiche toujours 1. t1 n'est pas modifié
		

	}

}
