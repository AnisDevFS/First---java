package com.first.collections;

import java.util.ArrayList;

//import com.sun.tools.javac.util.StringUtils;

//import com.sun.tools.javac.util.StringUtils;

public class ExArraylist {

	public static void main(String[] args) {

			int tab [] = {20, -6, -9 ,8, 3, 2};
//			Ex1 :Convertir les entiers de ce tableau en Strings et les insérer dans une arraylist
//			Afficher l’arraylist
			ArrayList<String> listOfNumbers = new ArrayList<String>();
			
			for (int i : tab) {
				listOfNumbers.add(Integer.toString(i));
			}
			System.out.println(listOfNumbers);
			System.out.println(listOfNumbers.get(0).getClass());
			
			ArrayList<String> numerosFrancais = new ArrayList<String>();
			
			String nums[] = {"0725836741","664631", "0497456321","0623654789" ,"5665653" , "04iyukjnlj", "04879631kk"};
//	Ex2 :	num est un tableau de string Ajouter dans un arraylist les numéros français 
//				Afficher l’arrayList
			for (String string : nums) {
				String deuxPremiers = string.substring(0, 2);
				if (string.length() == 10 ) {
					if (deuxPremiers.equals("04") || deuxPremiers.equals("06") || deuxPremiers.equals("07")) {
						if (!string.matches(".*[a-z].*") && string.matches(".*[1-9].*")) {
//						if (StringUtils.isNumeric(string)) { // demain cela fonctionnera
//							if (Character.isDigit(0))
							numerosFrancais.add(string);
						}
					}
				}
			}
			
			System.out.println(numerosFrancais);

	}

}
