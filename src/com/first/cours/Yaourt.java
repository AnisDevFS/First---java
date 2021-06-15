package com.first.cours;

import java.util.Arrays;
import java.util.Scanner;

public class Yaourt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int votes;
		System.out.println("Donner le nombre de votants");
		
		votes = sc.nextInt();

		String[] votesTab = new String[votes];
		
		System.out.println("choix de couleur à vous de jouer");
		
		for (int i = 0 ; i < votes ; i++) {
			votesTab[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(votesTab));
		String[][] votesTab2 = new String[votes][2];
		
//		for (int i = 0 ; i < votes ; i++) {
//			
//			if (votesTab[i]) {
//				
//			}
//			votesTab[i] = "";
//		}
	}

}
