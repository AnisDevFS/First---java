package com.first.tab2d;

import java.util.Arrays;

public class TriTabEx9PermutationPatjaf {

	public static void main(String[] args) {

		int[] tabDeInt = { 1000, 2, 3000, 41, -9 };

        // tableau original
        for (int i : tabDeInt) {
            System.out.println(i);
        }
        System.err.println("__");

        // tri décroissant
        for (int i = 0; i < tabDeInt.length - 1; i++) {

            // on récupère i pour boucle suivante
            int index = i;

            for (int j = i + 1; j < tabDeInt.length; j++) {

                // decroissant
                if (tabDeInt[j] > tabDeInt[index]) {
                    // si c'est plus grand on récupère dans l'index
                    index = j;
                }
                System.out.println(Arrays.toString(tabDeInt));
                System.err.println("__");
            }

            // ensuite: permutation
            int max = tabDeInt[index];
            tabDeInt[index] = tabDeInt[i];
            tabDeInt[i] = max;
            System.out.println(Arrays.toString(tabDeInt));
            System.err.println("__");
        }

        // vérification
        for (int i : tabDeInt) {
            System.out.println(i);
        }
        System.err.println("__");
	}

}














// Permutation

//int a = 5 ;
//int b = 10 ;
//int temp = a ;
//a = b ;
//b = temp;
//System.out.println("a = " + a + " et b = " + b);