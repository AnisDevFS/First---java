package com.first.serieExsVendredi;

public class Ex6et7 {

	public static void main(String[] args) {

		String[] j2ee = { "Marian", "Caty", "Alexis", "Noussaiba", "Jeremy", "Julie" };

		// Ex6
		if (j2ee.length > 0) {
			String maxString = j2ee[0];
			for (String s : j2ee) {
				if (s.length() > maxString.length())
					maxString = s;
			}
			System.out.println("la plus grande \nstr du tab est " + maxString);
		}

		else System.out.println("le tableau est vide");
		
		// Ex7
		int tab[] = { 2, 6, 9, 88, 77, 103, 56, 8, 4 };
		if (tab.length > 0) {
			int max = tab[0];
			for (int i : tab) {
				if (i > max)
					max = i;
			}
			System.out.println("le plus grand \nnbre du tab est " + max);
		}

		else System.out.println("le tableau est vide");
		
		// bonus min max
		if (tab.length > 0) {
			int max = tab[0] , min = tab[0];
			for (int i : tab) {
				if (i > max)
					max = i;
				else if ( i < min )
					min = i ;
			}
			System.out.println("le plus grand \nnbre du tab est " + max +
					"\nle plus petit \nnbre du tab est " + min);
		}

		else System.out.println("le tableau est vide");
	}

}
