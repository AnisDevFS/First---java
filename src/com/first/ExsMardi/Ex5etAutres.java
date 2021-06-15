package com.first.ExsMardi;

import java.util.Arrays;

public class Ex5etAutres {

	public static void main(String[] args) {
		// aff en Maj les 1ers char de chaque noms
		String[] j2ee = { "aDiL", "inGa" , "daliA" , "séBasTien", "imEn" , "pacHara" };
		char premier = 0 ;
		for (String str : j2ee) {
			
			System.out.println(Character.toUpperCase( str.charAt(0) ) );
			premier = str.charAt(0);
			
		}
		
		System.out.println(Arrays.toString(j2ee));
		System.out.println(premier);
		String g = premier + "";

	}

}
