package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// Exercice 15 : Tant que
		/*
		 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être
		 * obligatoirement compris entre 1 et 10 : - Tant que ce nombre n’est pas
		 * compris entre 1 et 10, le programme redemande un nombre à l’utilisateur. - Si
		 * le nombre est compris entre 1 et 10, le programme affiche ce nombre et se
		 * termine.
		 */
		int nbre = 0;
		Scanner saisie = new Scanner(System.in);

		System.out.println("Entrez un nombre compris entre 1 et 10 ");
		nbre = saisie.nextInt();
		while (nbre < 1 || nbre > 10) {
			System.out.println("Le nombre n'est pas compris entre 1 et 10");
			
		}
		if (nbre > 1 || nbre < 10) {
			System.out.println("Le nombre est bien compris entre 1 et 10, bravo!");
			
		}

	}

}
