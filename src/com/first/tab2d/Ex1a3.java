package com.first.tab2d;

public class Ex1a3 {

	public static void main(String[] args) {
		
		int[][] tab_2D = {
				{ 1 , 2 , 3 , 4} ,  
				{ 11 , 12 , 13 , 14 , 15} , 
				{ 100 , 203 , 300 , 401} 
			};
		
		// Ex 1 afficher les éléments supérieurs à 13
		for (int[] tab : tab_2D) {
			
			for (int entier : tab) {
				if (entier > 13) System.out.println(entier);
			}
		}
		System.out.println("-------------------");
		
		// EX2 afficher les éléments pairs
		for (int[] tab : tab_2D) {
			
			for (int entier : tab) {
				if (entier % 2 == 0) System.out.println(entier);
			}
		}
		System.out.println("-------------------");
		
		// EX3 afficher les éléments pairs ou > 99
		for (int[] tab : tab_2D) {
			
			for (int entier : tab) {
				if (entier % 2 == 0 || entier > 99) System.out.println(entier);
			}
		}
		System.out.println("-------------------");

	}

}
