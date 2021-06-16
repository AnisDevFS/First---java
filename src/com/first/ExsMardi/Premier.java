package com.first.ExsMardi;

public class Premier {

	public static void main(String[] args) {

		long nbr = 2 ;
		boolean premier = true;
		
		if (nbr < 2) System.out.println(nbr + " n'est pas premier");
		
		for (long i = 2 ; i < nbr/2 ; i++) {
			if (nbr % i == 0) {
				System.out.println(nbr + " n'est pas premier");
				premier = false;
				break;
			}
		}
		
		if (premier) System.out.println(nbr + " est premier");
		

	}

}
