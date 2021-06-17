package com.first.cours;

import java.util.Arrays;

public class Methodes {

	public static void main(String[] args) {
		
		String[] j2ee = { "ADiL", "inGa" , "daliA" , "séBasTien", "imEn" , "PacHara" };

			
		System.out.println(soustraction( 6 , 10));
		
		System.out.println("----------");
		
		produit(8, 4);
		System.out.println("----------");
		afficheStrCommenceParMaj(j2ee);
		System.out.println("----------");
		System.out.println(Arrays.toString(tabIntFromTabStr(j2ee)) );
		System.out.println("----------");
		System.out.println(ValeurAbsProduit(-9, 2));
	}
	
	// une méthode qui prend en param un tableau de string et qui affiche les strings 
	// qui commencent par une Maj
	static void afficheStrCommenceParMaj(String[] tabStr) {
		for (String s : tabStr) {
			if (Character.isUpperCase(s.charAt(0))) {
				System.out.println(s);
			}
		}
	}
	
	// une méthode qui prend en param un tableau de string et qui retourne un tableau 
	// d'entiers qui contient dans le bon ordre les longeurs des strings
	static int[] tabIntFromTabStr(String[] tabStr) {
		
		int[] tab = new int [tabStr.length];
		
		for (int i = 0 ; i < tabStr.length ; i++) {
			tab[i] = tabStr[i].length();
		}
		return tab;
	}
	

	static int soustraction(int i, int j) {	
		return i - j;
	}
	
	static void produit(int i, int j) {	
		System.out.println(i * j); 
	}
	
	static int ValeurAbsProduit(int i, int j) {	
		return (ValeurAbs(i) * ValeurAbs(j));
	}
	
	static int ValeurAbs(int i) {	
		if (i < 0)
			return i* -1;
		else return i;
	}
	

}
