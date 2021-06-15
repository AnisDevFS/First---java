package com.first.serieExsVendredi;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
			
		long nbr , fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nombre :");
		
		nbr = sc.nextInt();
		// 4 ! = 4 * 3 * 2 * 1 = 24
		// 0 ! = 1
		System.out.print(nbr + "! = " );
		for (int i = 1 ; i <= nbr ; i++) {
			fact = fact * i;
			
			if (i == nbr) System.out.print(i);
			
			else System.out.print(i + " * ");
		}
		
		System.out.print( " = " + fact);
	}

}
