package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffreSuivant {

	public static void main(String[] args) {
		// Exercice 12 : Intéractif chiffre suivant
		/*
		 * Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche
		 * les 10 nombres suivants. 
		 * Par exemple si l’utilisateur saisit 5, 
		 * le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.
		 */

		Scanner saisie = new Scanner(System.in);

		System.out.print("Veuillez entrer un nombre : ");
		int nombre = saisie.nextInt();

		System.out.println("Les 10 nombres suivants sont : ");

		for (int i = 1; i <= 10; i++) {

			System.out.println(nombre + i);
		}

	}
}
