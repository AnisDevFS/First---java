package com.first.ifandString;

import java.util.Scanner;

public class ChifoumiWile {

	// modification après l'exercice 7 bonus
	public static void main(String[] args) {
		
		String joueur1 , joueur2, choix1, choix2;
		int score1 = 0, score2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nom du joueur 1");
		joueur1 = sc.next();
		System.out.println("Nom du joueur 2");
		joueur2 = sc.next();
		
		while (score1 < 3 && score2 < 3) {
			
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
					if (choix2.equals("f")) {
						System.out.println(joueur2+" a gagné");
						score2++;
					}
					if (choix2.equals("c")) {
						System.out.println(joueur1+" a gagné");
						score1++;
					}
				}
				
				else if (choix1.equals("f")) {
					if (choix2.equals("p")) {
						System.out.println(joueur1+" a gagné");
						score1++;
					}
					if (choix2.equals("c")) {
						System.out.println(joueur2+" a gagné");
						score2++;
					}
				}
				
				else if (choix1.equals("c")) {
					if (choix2.equals("p")) {
						System.out.println(joueur2+" a gagné");
						score2++;
					}
					if (choix2.equals("f")) {
						System.out.println(joueur1+" a gagné");
						score1++;
					}
			
		}
		
		System.out.println("Score 1 = " + score1 + "\nScore 2 = " + score2);
		}
		
		sc.close();
	}
}
