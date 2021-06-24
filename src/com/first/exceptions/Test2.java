package com.first.exceptions;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez le mot");
		String mot = sc.next();
		
		try {
			System.out.println("le 5eme lettre = " + mot.charAt(4));
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println(e.toString());
			System.out.println("il n'y a pas de 5eme lettre dans ce mot !");
		}
		
		System.out.println("Suite du programme");

	}
}
