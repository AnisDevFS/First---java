package com.first.tab2d;

import java.util.Arrays;

public class TriTabEx9 {

	public static void main(String[] args) {

		int[] tabDeInt = { 1000 , 2 , 3000 , 41 , -9};
		int[] tabDeIntFinal = new int[tabDeInt.length];
		
		System.out.println("Before sort");
		System.out.println(Arrays.toString(tabDeInt));
		
		System.out.println("After sort");
		
		
		// 
		
		Arrays.sort(tabDeInt);

		char c = 'a';
//		
//		String C = c + "";
//		
//		C = C.toUpperCase();
//		
		char cMaj = Character.toUpperCase(c);
		
		
		
		System.out.println(Arrays.toString(tabDeInt));
		
		int compteur = 0;
		for (int i = (tabDeInt.length - 1) ; i >= 0 ; i--) {
			tabDeIntFinal[compteur] = tabDeInt[i];
			compteur++;
		}
		
		tabDeInt = tabDeIntFinal;
		System.out.println(Arrays.toString(tabDeInt));

	}

}
