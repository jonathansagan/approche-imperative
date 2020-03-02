package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// Exercice 16 table de multiplication
		/*
		 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être
		 * compris entre 1 et 10. Une fois que le nombre est bien entre 1 et 10, le
		 * programme affiche la table de multiplication de ce nombre
		 */
		
		int nombre = 0;
		Scanner saisie = new Scanner(System.in);

		while(nombre < 1 || nombre > 10) {

			System.out.print("Entrez un nombre compris entre 1  et 10 : ");
			nombre = saisie.nextInt();

			if(nombre < 1 || nombre > 10) System.out.println("Recommencez svp ...");
		}

		saisie.close();
		
		System.out.println("La table de "+nombre+" :");

		for(int i = 1 ; i <= 10 ; i++) {

			System.out.println(nombre+" * "+i+" = "+(nombre*i));
		} 
	}

}
