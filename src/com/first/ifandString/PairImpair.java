package com.first.ifandString;

import java.util.Scanner;

public class PairImpair {

	public static void main(String[] args) {
			
		int nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nombre ....");
		nombre = sc.nextInt();
		
		if (nombre % 2 == 0) System.out.println(nombre + " est pair");
		else System.out.println(nombre + " est impair");

	}

}
