package com.first.ExsMardi;

import java.util.Arrays;

public class Ex5etAutres {

	public static void main(String[] args) {
		// aff en Maj les 1ers char de chaque noms
		String[] j2ee = { "aDiL", "inGa" , "daliA" , "séBasTien", "imEn" , "pacHara" };
//		char premier = 0 ;
		for (String str : j2ee) {
			
			System.out.println(Character.toUpperCase( str.charAt(0) ) );
//			premier = str.charAt(0);
			
		}
		
		
		// Ex 6
//		System.out.println(Arrays.toString(j2ee));
//		System.out.println(premier);
//		String g = premier + "";
		
		System.out.println("------------------");
// On modifie plutot avec un for et pas un foreach		
//		for (String s : j2ee) {
//			s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
//			System.out.println(s);
//		}
		
		for (int i = 0 ; i < j2ee.length ; i++) {
			j2ee[i] = Character.toUpperCase(j2ee[i].charAt(0)) +
					j2ee[i].substring(1).toLowerCase();
			System.out.println(j2ee[i]);
		}
		
//		for (int i = 0 ; i < j2ee.length ; i++) {
//			char[] tab = j2ee[i].toCharArray();
//			
//			for (int j = 0 ; j < tab.length ; j++) {
//				if (j == 0 )
//			tab[j] = Character.toUpperCase(tab[j]);
//				else tab[j] = Character.toLowerCase(tab[j]);
//			}
//			
//			j2ee[i] = "";
//			for (char c : tab) {
//				j2ee[i] = j2ee[i] + c;
//			}
//		}
		
		System.out.println(Arrays.toString(j2ee));

	}

}
