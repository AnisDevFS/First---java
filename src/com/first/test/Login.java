package com.first.test;

import java.util.Scanner;

public class Login {

	// true && true = true
	// true && false = false
	// true || false = true
	// false || false = false
	// ! = not

	public static void main(String[] args) {

		String email;
		String password;

		System.out.println("Donnez moi votre adresse mail !");

		Scanner sc = new Scanner(System.in);
		email = sc.next();

		System.out.println("Donnez moi votre password !");
		password = sc.next();

		if (email.equals("goodmail")) {

			System.out.print("l'adresse mail correcte ");
			
			if (password.equals("0000")) {
				System.out.println("\nidentification réussie");
			}
			else System.out.println("mais password incorrect");
		}

		else System.out.println("mail incorrect");

	}
}

//si l'adresse est bonne et password n'est pas egale à "0000" ou le password = 007
//if ((email.equals("goodmail") && password.equals("0000")) || password.equals("007")) {
//System.out.println("identification réussie");
//}
//else System.out.println("mail ou mot de passe incorrect");

//if (email.equals("goodmail") && !password.equals("0000")) {
//System.out.println("mot de passe incorrect mais mail correcte");
//}
//else if (email.equals("goodmail") && password.equals("0000")) {
//System.out.println("identification réussie");
//}
//else System.out.println("mail ou mot de passe incorrect");
