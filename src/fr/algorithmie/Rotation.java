package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		/*
		 * Exercice 11 : Rotation 
		 * Dans cette classe, on d�clare un tableau d�entiers 
		 * � Effectuez une rotation � droite des �l�ments. 
		 * � Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
		 */
		int[] array = { 0, 1, 2, 3 };
		int temp = array[array.length - 1];

		System.out.println("Array : " + Arrays.toString(array));

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		array[0] = temp;

		System.out.println("Rotation array : " + Arrays.toString(array));
	}

}
