package com.first.ifandString;

import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {
		
		String joueur1 , joueur2, choix1, choix2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nom du joueur 1");
		joueur1 = sc.next();
		System.out.println("Nom du joueur 2");
		joueur2 = sc.next();
		System.out.println("Choix du joueur 1");
		choix1 = sc.next();
		System.out.println("Choix du joueur 2");
		choix2 = sc.next();
		boolean choix1correct = true, choix2correct = true;
		
		if (!choix1.equals("p") && !choix1.equals("f") && !choix1.equals("c")) {
			System.out.println("le choix du joueur 1 est incorrect");
			choix1correct = false;
			// System.exit(0); // sortir et ne pas finir l'execution des instructions suivantes
		}
			
		if (!choix2.equals("p") && !choix2.equals("f") && !choix2.equals("c")) {
			System.out.println("le choix du joueur 2 est incorrect");
			choix2correct = false;
		}
		
		if (choix1correct && choix2correct) {
			
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
			
		}
		else System.out.println("programme arreté");
		
		sc.close();
	}

}
