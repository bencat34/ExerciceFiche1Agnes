package exoAgnes1;

import java.util.Scanner;

class exo06 {
	/**
	 * Générer un nombre aléatoire compris entre 0 et 1000. Demander ensuite à l’utilisateur de
	 * deviner le nombre choisi par l’ordinateur. Il doit saisir un nombre compris entre 0 et 1000
	 * lui aussi. Comparer le nombre saisi avec celui choisi par l’ordinateur et afficher sur la
	 * console « c’est plus » ou « c’est moins » selon le cas. Recommencer jusqu’à ce que
	 * l’utilisateur trouve le bon nombre. Afficher alors le nombre d’essais nécessaires pour
	 * trouver la bonne réponse.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int nbral = (int) (Math.random()* 1000);
		boolean verif =true;
		Scanner sc = new Scanner(System.in);
		int nbrutil;
		int count = 0;
		System.out.println("Rentre un nombre entre 0 et 1000");

		while(verif)
		{
			nbrutil =  sc.nextInt();	
			if(nbral == nbrutil)
			{
				System.out.println("bravo");
				verif = false;
			}
			else if (nbral > nbrutil )
				System.out.println("C'est plus \n ");
			else if (nbral < nbrutil )
			{
				System.out.println("C'est moins \n");
			}
			if (verif == true)
			{
				System.out.println("recommencez \n");
			}
			count++;
		}
		System.out.println("Il vous a fallu "+count+" tours pour reussir");
		sc.close();
	}

}
