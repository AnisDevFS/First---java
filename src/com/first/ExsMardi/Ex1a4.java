package com.first.ExsMardi;

import java.util.Scanner;

public class Ex1a4 {

	public static void main(String[] args) {
			
//		// Ex1 positif ou négatif ou null 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Donnez le nombre !");
//		int nombre = sc.nextInt();
//		if (nombre == 0) System.out.println(nombre + " est null");
//		else if (nombre > 0) System.out.println(nombre + " est positif");
//		else System.out.println(nombre + " est négatif");
//		
//		
//		// Ex2 commence par ‘ ‘ et finit par ‘ ’ et composé par (int) caractères
//		System.out.println("Donnez le prenom !");
//		String prenom = sc.next();
//		System.out.println("votre prenom est " + prenom + " qui commence par " +
//				prenom.charAt(0) + " et qui finit par " + 
//				prenom.charAt(prenom.length()-1) + " et composé par "+
//				prenom.length() + " carateres");
		
		
//		// Ex3 switch case code pay
//		System.out.println("Donnez le code du pay concerné !");
//		int code = sc.nextInt();
//		switch (code) {
//		case 351 : 
//			System.out.println("cest le portugal"); 
//			break;
//		case 33 : 
//			System.out.println("cest la France"); 
//			break;
//		case 40 : 
//			System.out.println("cest le Roumanie"); 
//			break;
//		case 974 : 
//			System.out.println("cest le Qatar"); 
//			break;
//		default : 
//			System.out.println("le code est incorrect");
//		}
		
		// Ex3 le nombre de lettre b dans le String 
		String s = "qjfvbkqjovbqibvhvhbqshvbehubvfibbbbbb"; 
		int compt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'b') compt++;
		}
		System.out.println("le nombe de 'b' = " + compt);
		
	}

}
