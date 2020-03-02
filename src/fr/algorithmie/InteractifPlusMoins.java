package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// Exercice 17 : plus moins 

		int reponse = 0;
		int compteur = 1;
		int secretNb = new Random().nextInt(100) + 1;
		Scanner saisie = new Scanner(System.in);

		while (reponse != secretNb) {

			System.out.print("Entrez un nombre compris entre 1 et 100 pour trouver le nombre secret : ");
			reponse = saisie.nextInt();

			if (reponse == secretNb) {
				System.out.println("Bravo! vous avez trouvé en " + compteur + " coups ");
			} else if (reponse > secretNb) {
				System.out.println("Le nombre secret est < à " + reponse + ".");
			} else {
				System.out.println("Le nombre secret est > à " + reponse + ".");
			}

			compteur++;
		}

		saisie.close();

	}

}
