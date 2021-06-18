package com.first.methods;

import java.util.Arrays;

public class Ex7etAutres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] entiers = { 1, 66 , -9 , 500, -1003 , -12 , 30 , 90 , 8001};
		
		System.out.println(Arrays.toString(triTabEntiers(entiers)));
		System.out.println(Arrays.toString(entiers));
		System.out.println("---------------");
		
		String[] noms  = { "cristina", "alia", "men" ,"men" , "icolas" , "mehdi" , "Adil" , "pachara", "ébastien" };
		System.out.println(pairEtMajj(noms));
		System.out.println("-------------");
		
		premierMinDernierMaj("Anisssss");
		System.out.println("-------------");

		
		System.out.println(plusGrandPair(entiers));
		System.out.println("-------------");
		

	}
	
//	Ex 10: Créer une méthode qui prend en paramètres un tableau d’entiers et qui
	// retourne true si le plus grand élément du tableau est pair
	static boolean plusGrandPair(int[] tab) {
		
		int[] triTab = new int[tab.length];
		int compt =0;
		for (int i : tab) {
			triTab[compt] = i;
			compt++;
		}
		Arrays.sort(triTab);
		if (triTab[triTab.length - 1] % 2 == 0) return true;
		else return false;
	}
		
		
		
		
		
		
		
		
	
//	EX 9: Créer une méthode qui prend en paramètres un String et qui affiche
//		le même string mais son
//		premier char est minuscule et son dernier est majuscule
	static void premierMinDernierMaj (String str) {
		
		String result = Character.toLowerCase(str.charAt(0)) + 
					//	str.substring(0 , 1).toLowerCase()
						str.substring(1, str.length() - 1) +
						str.substring(str.length() - 1).toUpperCase();
		
		System.out.println(str + " devient " + result);
	}
	
	// methode prend string et retourn un string composé avec les 2 premiers char
	// en maj
	static String deuxPremiersMaj (String s) {
		return s.toUpperCase().substring(0, 2);
	}
	
	
	
	
	
	
	
//	Ex 8: Créer une méthode qui prend en paramètres un tableau de string et qui retourne true ou false
//		True si le nombre éléments et paire et qui contient au moins un String qui commence 
//		par un majuscule False si ce n’est pas le cas 
		
	static boolean pairEtMaj (String[] tab) {
		boolean maj = false;
		
		for (String s : tab) {
			if (Character.isUpperCase(s.charAt(0))) {
				maj = true;
				break;
			}
		}
		System.out.println("Maj = " + maj);
		if (maj && tab.length % 2 == 0 ) return true ;
		else return false;
	}
	
	
	// 2 eme version
	static boolean pairEtMajj (String[] tab) {
		
		if (tab.length % 2 == 0 ) {
			boolean maj = false;
			for (String s : tab) {
				if (Character.isUpperCase(s.charAt(0))) {
					maj = true;
					break;
				}
			}
			return maj;
		}
		else return false;

	}
		
		
		
		
		
		
		
		
		
	
	
//	Ex 7: Créer une méthode qui prend en paramètres un tableau d’entiers et 
//	qui retourne un autre tableau d’entier qui contient les mêmes éléments mais triés 
//	du plus petit au plus grand
	
	static int[] triTabEntiers (int[] tab) {
		
		int[] triTab = new int[tab.length];
		int compt =0;
		for (int i : tab) {
			triTab[compt] = i;
			compt++;
		}
		// triTab = tab -> les 2 variables sont deux var pour une seule valeur
		Arrays.sort(triTab);
		return triTab;
	}
	

}
