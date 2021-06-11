package com.first.serieExsVendredi;

import java.util.Scanner;

public class Ex9ABABA {

	public static void main(String[] args) {
			
		String result ;
		Scanner sc = new Scanner(System.in);
		System.out.println("donnez moi le resultat :");
		result = sc.next();
		
		int pointsA = 0, pointsB = 0;
		
		for (int i = 0 ; i < result.length() ; i++) {
			if (result.charAt(i) == 'A') pointsA++;
			else if (result.charAt(i) == 'B') pointsB++;
			else {
				System.out.println("Mauvais caractere");
				break;
			}
			if (pointsA == 3) {
				System.out.println("l'équipe A a gangé");
				break;
			}
			if (pointsB == 3) {
				System.out.println("l'équipe B a gangé");
				break;
			}
		}
	}
}
