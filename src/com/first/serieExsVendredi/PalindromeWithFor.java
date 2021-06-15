package com.first.serieExsVendredi;

import java.util.Scanner;

public class PalindromeWithFor {

	public static void main(String[] args) {
		
		String str , strReverse;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner MOI UN PALAINDROME :");
		str = sc.next();
		
		StringBuilder strRevers = new StringBuilder(str);
		strReverse = strRevers.reverse().toString();
		
//		int p = 30; float pp = 30;
//		str = Integer.toString(p);
//		str = Float.toString(pp);
		
		if ( strReverse.equals(str) ) 
			System.out.println(str +" EST UN PALAINDROME");

		
		
	}

}
