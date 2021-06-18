package com.first.methods;

import java.util.Arrays;

public class ExsOverlaod {

	public static void main(String[] args) {
		
		String[] noms  = { "cristina", "alia", "men" , "icolas" , "mehdi" , "Adil" , "pachara", "ébastien" };

		strMaj("hmlvb");
		strMaj(noms);
		int[] entiers = { 1, 66 , -9 , 500, -1003 , -12 , 30 , 90 , 8001};
		
		strMaj(entiers);
	}
	
	
//	la 3 eme prend un tableau d'entiers et qui le convertit en tableau de STring et les affiche
	static void strMaj(int[] tab) {
		String[] entiersEnString = new String[tab.length];
		
		for (int i = 0 ; i < tab.length ; i++ ) {
			
			entiersEnString[i] = Integer.toString(tab[i]) ;
		}
		
		System.out.println(Arrays.toString(entiersEnString));
	}
	
	
	
	
	
//	la 2eme prend un tableau de STring et affiche tout les String en majuscule	
	static void strMaj(String[] tab) {
		
		for (String s : tab) {
			
			strMaj(s);
		}
	}
	
	
	
//	la premiere prend un STring et affiche le String en Majuscule
	static void strMaj(String s) {
		System.out.println(s.toUpperCase());
	}


}
