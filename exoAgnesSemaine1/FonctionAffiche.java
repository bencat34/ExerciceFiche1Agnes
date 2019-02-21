package exoAgnes1;

class FonctionAffiche {
	public static void affiche(int []tab)
	{
		System.out.print("[");
		for (int i = 0; i < tab.length; i++) 
		{	
			if (i > 0)
				System.out.print(",");
			System.out.print(tab[i]);	
		}
		System.out.print("]");
	}
	public static int[] tableauRamdom() 
	{
		int [] tab;
		tab = new int[5];
		for (int i = 0; i < tab.length; i++)
		{
			tab[i] = (int) (Math.random()* 100);	
		}
		return tab;
	}
	public static void main(String[] args) {
        affiche(tableauRamdom());
        
    }

}
