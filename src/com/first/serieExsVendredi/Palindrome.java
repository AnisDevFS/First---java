package com.first.serieExsVendredi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String str , strReverse;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner MOI UN PALAINDROME :");
		str = sc.next();
		boolean palindrom = true;
		
		for (int i = 0 ; i < str.length()/2 ; i++) {
			
			if ( str.charAt(i) == str.charAt(str.length() - i - 1))
				palindrom = true;
			else {
				palindrom = false ;
				break;
			}
		}
		
		if (palindrom)
		System.out.println(str +" EST UN PALAINDROME");
		else 
			System.out.println(str +" N'EST PAS UN PALAINDROME");
		
		
	}

}
