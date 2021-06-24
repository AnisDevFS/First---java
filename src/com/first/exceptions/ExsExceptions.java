package com.first.exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExsExceptions {

	public static void main(String[] args) {

		int[] tabInt = { 1, 6, 99 , 120};
		
//		Ex1 : Appliquer un try catch sur la première boucle for pour gérer l’exception levée 
		for (int i = 0; i < 6; i++) {
			try {
				System.out.println(tabInt[i]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("L'index " + i + " n'existe pas !");
				System.out.println(e.toString());
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : tabInt) {
			list.add(i);
		}
		
//		Ex2 : Appliquer un try/catch/finally Pour gérer l’exception dans cette ligne : 
//		System.out.println(list.get(4)); 
//		Le finally doit afficher la taille de l’arraylist list 
		try {
			System.out.println(list.get(4));
		}
		catch (Exception e1) {  // catch (IndexOutOfBoundsException e1) {
			System.out.println(e1.toString());
		}
		finally {
			System.out.println("la taille de l'arrayList = " + list.size());
		}
		
		
		affiche4emeElement(list);
		
		String[] tabString = { "1", "6", "99", "120" , "30erhy(" };
		
		int[] lesEntiers = convert(tabString);
		
		System.out.println("c'est les entiers du tableau");

		System.out.println(Arrays.toString(lesEntiers));
		
		
	}



//	Ex3 : Créer une méthode simple qui prends un arraylist d’entier et afficher toujours le 4eme
//	élément et qui afficher un message d’erreur dans 
//	le cas où la méthode n’arrive pas à afficher le 4 eme élément grâce à try/catch: 
	
	static void affiche4emeElement (ArrayList<Integer> list) {
		
		try {
			System.out.println(list.get(3));
		}
		catch (IndexOutOfBoundsException e1) { 
			System.out.println("La méthode n’arrive pas à afficher le 4 eme élément");
			System.out.println(e1.toString());
		}
		
	}
	
	
	
	
	
	
//	Ex4 : Créer une méthode qui prend en paramètre un tableau de String et qui retourne un tableau d’entiers
//	(les entiers sont les String convertis) Gérer dans la méthode l’exception du format.
//	Dans le cas ou le tableau de String contient un String non convertible la méthode doit retourner un 
//	tableau d’entiers qui contient un seul élement qui est l’entier 0.
//	Utiliser la méthode Integer.parseInt pour convertir les strings en entiers
	
	static int[] convert (String[] tabStr) {
		
		int[] tabInt = new int[tabStr.length];
		
		for (int i = 0 ; i < tabStr.length ; i++ ) {
			
			try {
				tabInt[i] = Integer.parseInt(tabStr[i]);
			}
			catch (NumberFormatException e) {
				System.out.println(tabStr[i] + " n'est pas convertible");
				return new int[] {0};
			}
		}
		
		return tabInt;
	}
	
	
	
	


}
