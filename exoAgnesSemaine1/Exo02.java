package exoAgnes1;

import java.util.Scanner;

public class Exo02 {
	/**
	 * Écrire un programme permettant de lire le nom et le prénom d'un étudiant, ensuite
	 * transforme le nom en majuscule, la première lettre du prénom en majuscule et le reste en
	 * minuscule.
	 * 
	 * @param args
	 */

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir votre NOM SVP ");
		String Nom = sc.nextLine().toUpperCase();
		 
		 
		 System.out.println("veuillez saisir votre Prenom SVP ");
			String Prenom = sc.nextLine();
		 Prenom = Prenom.substring(0,1).toUpperCase() + Prenom.substring(1).toLowerCase();
		 
		System.out.println("Votre nom est "+ Nom);
		System.out.println("Votre Prenom est "+ Prenom);
		sc .close();
	}
}
