package exoAgnes1;

import java.util.Scanner;
/**
 * Écrire un programme qui récupère deux entiers sur la "ligne de commande" et qui en
 * affiche la somme en fenêtre console, comme dans cet exemple :
 * 							23 + 25 = 48
 * On vérifiera que les arguments fournis sont formés uniquement de chiffres, dans le cas
 * contraire, le programme s’interrompra.
 * 
 * @author benjamin
 *
 */
class exo1 {

	public static void main(String[] args)
	{
		String nbr1 =" ",nbr2 = " ";
		int i = 0,j=0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while(flag != true ) 
		{
			System.out.println("boucle");
			System.out.println("rentre le chiffre 1:)");
			nbr1 = sc.nextLine();
			System.out.println("rentre le chiffre 2:)");
			nbr2 = sc.nextLine();
			
				if(nbr1.charAt(i) <= '0' && nbr1.charAt(i)>= '9' && (nbr2.charAt(j) <= '0' && nbr2.charAt(j)>= '9'))
				{
					System.out.println("un nombre stp;");
					
				}
				
				else if (nbr1.charAt(i) >= '0' && nbr1.charAt(i)<= '9' && (nbr2.charAt(j) >= '0' && nbr2.charAt(j)<= '9'))
				{
					int nbr1i=Integer.parseInt(nbr1) ;
					int nbr2i= Integer.parseInt(nbr2);
					int resultat=(nbr1i + nbr2i);
					System.out.println(nbr1+" + "+ nbr2+" = "+ resultat);
					flag=true;
				}
				
		}
		sc.close();
	}

}
