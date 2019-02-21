package exoAgnes1;
/**
 * Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux
 * nombres pairs suivis par un nombre impair. Si ce n’est pas le cas, recommencer jusqu’à
 * ce vous ayez la combinaison pair, pair, impair. Afficher ensuite le nombre d’essais
 * nécessaires pour obtenir cette combinaison.
 * Indice : la classe Math propose la méthode statique random qui génère un nombre
 * aléatoire compris entre 0 et 1.
 * Exemple : double nb=Math.random();
 * 
 * @author benjamin
 *
 */

class exo05 {

	public static void main(String[] args) 
	{
		int compt =0;
		boolean verif = true;
		System.out.println("les 2 nombres suivant sont pairs et le dernier impair");
		while (verif)
		{
			int nbr1 = (int) (Math.random()* 1000);
			int nbr2 =(int) (Math.random()* 1000);
			int nbr3 =(int) (Math.random()* 1000);
			int[] tab = {nbr1,nbr2,nbr3};
			for (int i = 0; i < tab.length; i++) 
			{
				if(tab[0] % 2 == 0 && tab[1] % 2 == 0 && tab[2] % 2 == 1)
				{
					System.out.println("{"+tab[i]+"}");
					verif= false;
				}
			}
			compt++;
		}
		System.out.println("Nombre de tours avant la bonne solution "+compt);
	}
}
