package com.first.ifandString;

import java.util.Scanner;

public class ChifoumiWile {

	public static void main(String[] args) {
		
		String joueur1 , joueur2, choix1, choix2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nom du joueur 1");
		joueur1 = sc.next();
		System.out.println("Nom du joueur 2");
		joueur2 = sc.next();
		
		System.out.println("Choix du joueur 1");
		choix1 = sc.next();
		while (!choix1.equals("p") && !choix1.equals("f") && !choix1.equals("c"))
		{
			System.out.println("Choix du joueur 1 incorrecte choisis entre p f ou c");
			choix1 = sc.next();
		}
		
		System.out.println("Choix du joueur 2");
		choix2 = sc.next();
		while (!choix2.equals("p") && !choix2.equals("f") && !choix2.equals("c"))
		{
			System.out.println("Choix du joueur 2 incorrecte choisis entre p f ou c");
			choix2 = sc.next();
		}
			
			if (choix1.equals(choix2)) System.out.println("Egalité !!");
			
			if (choix1.equals("p")) {
				if (choix2.equals("f")) System.out.println(joueur2+" a gagné");
				if (choix2.equals("c")) System.out.println(joueur1+" a gagné");
			}
			
			else if (choix1.equals("f")) {
				if (choix2.equals("p")) System.out.println(joueur1+" a gagné");
				if (choix2.equals("c")) System.out.println(joueur2+" a gagné");
			}
			
			else if (choix1.equals("c")) {
				if (choix2.equals("p")) System.out.println(joueur2+" a gagné");
				if (choix2.equals("f")) System.out.println(joueur1+" a gagné");
			}
		
		sc.close();
	}

}
