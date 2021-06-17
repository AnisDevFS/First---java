package com.first.methods;

public class Ex1a6 {

	public static void main(String[] args) {

		divisible(19, 3);
		System.out.println("-----------");
		
		System.out.println(majStr("anis"));
		System.out.println("-----------");
		
		int[] entiers = { 1, 66666 , -9 , 500, -1003 , -12 , 30 , 90 , 8000};
		System.out.println(plusGrandEntierTab(entiers));
		System.out.println("-----------");
		
		plusLongStringSup10("�erao");
		System.out.println("-----------");
		
		String[] noms  = { "cristina", "Dalia", "Imen" , "Inga" , "Nico" 
				, "mehdi" , "adil" , "pach", "S�ba" };
		System.out.println(quatreChars(noms));
		
		
	}
	
	
//	Ex 5: Cr�er une m�thode qui prend en param�tres un tableau de String et 
//		qui retourne le nombre de Strings compos�s par 4 caract�res
	
	static int quatreChars(String[] tabStr) {
		
		int compt = 0;
		for (String s : tabStr) {
			
			if (s.length() == 4) compt++;
		}
		return compt;
	}
	
	
	
	
	
	
	
	
	
//	Ex 4: Cr�er une M�thode qui prend un String et qui affiche le nombre de 
//	caract�res et afficher si ce String et Long ou pas (String long d�passe 10 caract�res)
	static void plusLongStringSup10(String s) {
		
		if (s.length() > 10) {
			
			System.out.println("la chaine est longue et sa longueur = " + s.length());
		}
			else System.out.println("la chaine est courte et sa longueur = " + s.length());
	}
		
		
		
	
//	Ex 3: Cr�er une m�thode qui prend en param�tres un tableau d�entiers et qui
//		retourne le plus grand entier du tableau
	static int plusGrandEntierTab(int[] tab) {
		
		int max = tab[0];
		for (int i : tab) {
			if (i > max) max = i ;
		}
		return max;
	}
	
	
	
	
	
	
	
//	Ex 2: Cr�er une m�thode qui prend un String 
//		au param�tre et qui retourne le m�me String mais tout en majuscule 
	static String majStr ( String s) {
		
		return s.toUpperCase();
	}
	
	

	
	
	
//	Ex 1: Cr�er une m�thode qui prend deux entiers a et b en param�tres
//		et qui affiche si a est divisible par b ou pas
	static void divisible (int a , int b) {
		if ( a % b == 0) {
			System.out.println(a + " est divisibe par "+ b);
		}
		else System.out.println(a + " n'est pas divisibe par "+ b);
	}

}
