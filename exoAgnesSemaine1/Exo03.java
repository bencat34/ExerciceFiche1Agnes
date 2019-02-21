package exoAgnes1;

//import java.util.Arrays;

class Exo03 {
	/**
	 * 1.Déclarer les deux tableaux ci-dessus:
	 * 2.Créer une fonction permettant d’afficher les éléments de chaque tableau ligne par ligne.
	 * 3.Créer un programme de Test (main).
	 * @param args
	 */
	public static void afficheTableau() {
		int tab1[][] = {{2,4},{3,33,32}};
		int[][] tab2 = {{3},{3,4,5},{3,5},{3,2,0}};
		
		String s ="";
		System.out.println("tab1");
		for(int i = 0; i < tab1.length;i++)
		{
			s += "[";
		
			for (int j = 0; j < tab1[i].length; j++) 
			{
				s += tab1[i][j]; 
				if (j != tab1[i].length - 1) 
				{
					s += ",";
				}
			}
			s += "]";
			s += '\n';
		}
		System.out.print(s+"\n");
		s ="";
		System.out.println("tab2");
		for(int i = 0; i < tab2.length;i++)
		{
			s += "[";
		
			for (int j = 0; j < tab2[i].length; j++) 
			{
				s += tab2[i][j]; 
				if (j != tab2[i].length  - 1) 
				{
					s += ",";
				}
			}
			s += "]";
			s += '\n';
		}
		System.out.println(s+"\n");
	}

	public static void main(String[] args) 
	{
		afficheTableau();
		
	}
}
