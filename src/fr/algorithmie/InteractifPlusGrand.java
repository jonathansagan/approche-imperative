package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// Exercice 14 : EXERCICE INTERACTIFPLUSGRAND
		/*
		 * Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le
		 * plus grand de ces nombres.
		 */
		Scanner saisie = new Scanner(System.in);

		System.out.println("Entrez un nombre : ");
		int max = saisie.nextInt();
		

		for (int i = 1; i < 10; i++) {

			System.out.println("Entrez un nombre : ");
			int nb = saisie.nextInt();
			if (max < nb) {

				max = nb;

			}

		}

		System.out.println("Le nombre le plus grand est : " + max);

	}

}
