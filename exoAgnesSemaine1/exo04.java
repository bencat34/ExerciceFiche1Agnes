package exoAgnes1;



class exo04 {

	/**
	 * Créer un tableau de dix chaînes de caractères puis remplir ce tableau avec des adresses
	 * e-mail. Calculer ensuite, à partir des informations présentes dans le tableau, la part de
	 * marché de chacun des fournisseurs d’accès.
	 * Indice : dans une adresse e-mail, le nom du fournisseur d’accès est la partie située après
	 * le caractère @ de l’adresse e-mail.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String[] tab = new String[10];// Déclaration d'un tableau de 10 String
		int comptGmail = 0, comptOrange = 0,comptHotmail= 0, comptFree = 0, comptInconnue = 0;//Initialisation des compteurs de comptes mails

		tab[0] = "jaune@gmail.com";    
		tab[1] = "bleu@orange.com";
		tab[2] = "vert@gmail.com";
		tab[3] = "violet@hotmail.com";
		tab[4] = "rouge@gmail.com";                        //Tableau rempli 
		tab[5] = "noir@tartufle.com";
		tab[6] = "orange@hotmail.com";
		tab[7] = "blanc@orange.com";
		tab[8] = "rose@gmail.com";
		tab[9] = "sfi.gris@free.com";



		for (int i = 0; i < tab.length; i++) 
		{
			switch (tab[i].substring(tab[i].indexOf("@"),tab[i].lastIndexOf("."))) 
			{
			case "@gmail":comptGmail++;
			break;
			case"@orange":comptOrange++;
			break;
			case "@hotmail":comptHotmail++;
			break;
			case"@free":comptFree++;
			break;
			default:
				comptInconnue++;
				break;
			}
		}
		System.out.println("Il y a " + comptGmail + " comptes Gmail ");
		System.out.println("Il y a " + comptOrange + " comptes Orange");
		System.out.println("Il y a " + comptHotmail + " comptes Hotmail");
		System.out.println("Il y a " + comptFree + " comptes Free");
		System.out.println("Il y a " + comptInconnue + " comptes inconnue");

	}
}

