package exoAgnes1;

import java.util.Scanner;

class ex07
{
	/**
	 * Ajouter au jeu de l’exercice 6 l’affichage du temps mis par l’utilisateur pour obtenir la
	 * bonne réponse
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
		long debTemp = System.currentTimeMillis();
		while(verif)
		{
			System.out.println(nbral);
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
			if (verif)
			{
				System.out.println("recommence \n");
			}
			else 
			{
				 
				long finTemp = System.currentTimeMillis();
				float seconde= (finTemp - debTemp) / 1000F;
				float seconderest =  seconde % 60;
				float minute =(seconde - seconderest) /60;
				System.out.println(count+ " "+  (int)minute+  " Minute et "+ (byte)seconderest+" seconde" );//+ " "+Float.toString(seconde)
			}
			
			count++;
		}
		
		
		
		sc.close();
	}

}


