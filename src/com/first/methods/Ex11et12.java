package com.first.methods;

import java.util.Arrays;

public class Ex11et12 {

	public static void main(String[] args) {
			
		String[] noms  = { "cristina", "alia", "men" , "icolas" , "mehdi" , "Adil" , "pachara", "ébastien" };
		tousSTringEnMaj(noms);
		System.out.println("-------------");
//		System.out.println(Arrays.toString(noms));
		
		somme( 5 , 6 , 8);
		somme( 5 , 8);
		somme( 5.06f , 8.04f);
		somme( "J EE " , "Team");
		
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};
		
		System.out.println("-------------");
		spaciale12(tabInt , tabStr2);
		
	}
	
	
	
//	Ex 12:
//		Créer une méthode qui prend en paramètre un tableau d'entiers et un tableau 2D de STring
//		cette méthode doit convertir les entier du 1er tableau en String les inserer dans un tableau de string
//		et inserer le tableau de string dans le tableau 2D
//		la méthode doit afficher le nouveau tableau 2D
	static void spaciale12 (int[] entiers, String[][] str2D) {
		
		// préparer un tableau de STrings (entiersEnStrings) qui a la meme taille de entiers (int[])
		String[] entiersEnStrings = new String[entiers.length];
		
		// je remplis entiersEnStrings par les entiers du tab entiers convertis en String
		for (int i = 0 ; i < entiers.length ; i++) {
			entiersEnStrings[i] = entiers[i] + "";
		}
		
		// préparer un tableau 2D de Strings (str2Dnew) qui a la meme taille de str2D (String[][]) + 1
		String[][] str2Dnew = new String[str2D.length + 1][];
		
		// je remplis str2Dnew par les tableaux de string du str2D (String[][])
		for (int i = 0 ; i < str2D.length ; i++) {
			str2Dnew[i] = str2D[i];
		}
		
		// j'insere entiersEnStrings (String[]) comme dernier élement de str2Dnew
		str2Dnew[str2D.length] = entiersEnStrings;
		
		// j'affiche les elements de str2Dnew
		for (String[] strings : str2Dnew) {
			System.out.println(Arrays.toString(strings));
		}
	}
	
	
	
	
	
	
	
	
	static void somme (String a , String b) {
		System.out.println(a+b);
	}
	
	static void somme (int a , int b) {
		System.out.println(a+b);
	}
	
	static void somme (float a , float b) {
		System.out.println((float)(a+b));
	}
	
	static void somme (int a , int b , int c) {
		System.out.println(a+b+c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	Ex 11: Créer une méthode qui prend en paramètres un tableau String 
//	et qui affiche tous les strings en majuscule en utilisant la méthode de l’ex2
	
	static void tousSTringEnMaj(String[] tabStr) {
		
		for (String s : tabStr) {
			// String majStr(String s) return s en maj
			System.out.println(majStr(s));
		}
	}
	
	
	static String majStr ( String s) {
		return s.toUpperCase();
	}

}
