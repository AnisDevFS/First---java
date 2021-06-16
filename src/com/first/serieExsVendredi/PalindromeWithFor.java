package com.first.serieExsVendredi;

import java.util.Scanner;

public class PalindromeWithFor {

	public static void main(String[] args) {

		String str, strReverse;
		boolean palindrom = false;
		Scanner sc = new Scanner(System.in);

		// Ex 7
		while (!palindrom) {
			System.out.println("Donner MOI UN PALAINDROME :");
			str = sc.next();
			
			StringBuilder strRevers = new StringBuilder(str);
			strReverse = strRevers.reverse().toString();

			if (strReverse.equals(str)) {
				System.out.println(str + " EST UN PALAINDROME");
				palindrom = true;
			}
		}
	}

}
