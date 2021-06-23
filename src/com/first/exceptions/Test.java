package com.first.exceptions;

public class Test {

	public static void main(String[] args) {
			
		int[] tab = { 2 , 3 , 10 , 7 , 10 , 9 , -0};
		
		for (int i = 0 ; i < tab.length + 2 ; i++) {
			if (tab[i] == 0 ) {
				System.out.println("dans le if l'itération " + (i+1) +"\n");
				throw new ArithmeticException();
			}
			try {
				System.out.println(1000 / tab[i]);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1.getMessage());
			}
			finally {
				System.out.println("finally l'itération" + (i+1) +"\n");
			};			
//			catch (Exception e) {
////		System.out.println("l'index " +i + " n'existe pas");
//			System.out.println(e.getClass());
//			}
		}
		System.out.println("fin de programme");

	}

}
