package com.first.test;

import java.util.Scanner;

public class Ex1Age {

	public static void main(String[] args) {

		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Donnez moi votre age ?");
		
		age = s.nextInt();
		if (age >= 18) System.out.println("Vous pouvez conduire");
		else if (age < 18 && age >= 16)
			System.out.println("Vous pouvez conduire accompagné");
		else System.out.println("Vous etes mineur Vous ne pouvez pas conduire");

	}

}
