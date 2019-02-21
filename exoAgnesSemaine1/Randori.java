package exoAgnes1;

import java.util.ArrayList;

class Randori {

	public static ArrayList<Integer> Difference(int[] tabA, int[] tabB) {
        ArrayList<Integer> tabC = new ArrayList<Integer>();
        for (int i = 0; i < tabA.length; i++) {
            //tester l element i 
            boolean flag = true ;
            for (int j = 0 ; j < tabB.length; j++) {
                if (tabA[i] == tabB[j]) {
                    flag = false;
                }
            }
            //fin test i
            if (flag) {
                tabC.add(tabA[i]);
            }
        }
        return tabC;
    }

    public static void main(String[] args) {
        int[] tabA = {1,2,2,2,3,3};
        int[] tabB = {3,1};
        System.out.println(Difference(tabA, tabB));
    }

}