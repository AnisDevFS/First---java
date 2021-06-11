package com.first.tabAndString;

public class Tableaux {

	public static void main(String[] args) {
		
		int[] entiers = { 2 , 5 , 9 , 7 , -6 , -9 }; 
		int[] p ; 
		String [] j2ee = { "Marian", "Cathy", "Alexis", "Noussaiba" ,"Jeremy" , "Julien" }; 
		boolean [] bools = { true , false , true }; 
		int[][] entiers2D = { {2 , 5 , 9 } , {7 , -6} , {-9} }; 
		p = entiers ;
		// p = { 2 , 5 , 9 , 7 , -6 , -9 };
		System.out.println(entiers2D[1][ entiers2D[1].length - 1 ]);
		System.out.println(entiers.length );
		System.out.println(p[p.length - 1] );
		System.out.println("--------------------");
		
		for (int i = 0 ; i < entiers.length ; i++ ) {
			if (entiers[i] < 0)
			System.out.println(entiers[i]); 
		}
		System.out.println("--------------------");
		for (String s : j2ee) {
			System.out.println(s);
		}
		

	}

}
