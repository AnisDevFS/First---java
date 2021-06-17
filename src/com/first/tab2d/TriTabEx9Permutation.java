package com.first.tab2d;

import java.util.Arrays;

public class TriTabEx9Permutation {

	public static void main(String[] args) {

		int[] tabDeInt = { 1000 , 2 , 3000 , 41 , -9};
		
		System.out.println("Before tri");
		System.out.println(Arrays.toString(tabDeInt));
		
		System.out.println("After tri");
		
		for (int i = 0; i < tabDeInt.length; i++ ) {
			
			for (int j = 0; j < tabDeInt.length; j++ ) {
				
				if (tabDeInt[i] > tabDeInt[j]) {
					int temp = tabDeInt[i];
					tabDeInt[i] = tabDeInt[j];
					tabDeInt[j] = temp;
				}
				System.out.println(Arrays.toString(tabDeInt));
			}
			System.out.println("-----------------");
			System.out.println(Arrays.toString(tabDeInt));
			System.out.println("-----------------");
		}
		
		System.out.println("-----------------");
		System.out.println(Arrays.toString(tabDeInt));
	}

}














// Permutation

//int a = 5 ;
//int b = 10 ;
//int temp = a ;
//a = b ;
//b = temp;
//System.out.println("a = " + a + " et b = " + b);