package com.first.cours;

public class Tab2D {

	public static void main(String[] args) {

		int[][] tab_2D = {
				{ 1 , 2 , 3 , 4} ,  
				{ 11 , 12 , 13 , 14 , 15} , 
				{ 100 , 200 , 300 , 400} 
				};
		
		System.out.println("gg");
		
		
		for (int i = 0 ; i < tab_2D.length ; i++) {
			
			for (int j = 0 ; j < tab_2D[i].length ; j++) {
				System.out.println(tab_2D[i][j]);
			}
			System.out.println("--------------");
		}
		
//		for (int[] tabInt : tab_2D) {
//			for (int entier : tabInt) {
//				System.out.println(entier);
//			}
//			System.out.println("--------------");
//		}
		
		

	}

}
