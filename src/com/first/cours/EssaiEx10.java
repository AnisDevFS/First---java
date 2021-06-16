package com.first.cours;

import java.util.Arrays;

public class EssaiEx10 {

	public static void main(String[] args) {
			
		String[][] j2ee = { 
				{"Sébastien", "inga" , "mehdi"} ,
                {"Sébastien", "Sébastien", "Anis" } , 
                {"Sébastien", "mehdi" ,"mehdi" , "inga" } 
        };
		
		String[] newtab = new String[10];
		
		String[][] newtab2D = new String[10][2];
		
		int m = 0;
		for (int i = 0 ; i < j2ee.length ; i++) {
			for ( int j = 0 ; j < j2ee[i].length ; j++) {
				newtab[m] = j2ee[i][j];
				m++;
			}
		}
		for (int j = 0 ; j < newtab.length ; j++) {
			int compt = 0 ;
			for (int i = 0 ; i < newtab.length ; i++) {
				if (newtab[j].equals(newtab[i])) {
					compt++;
				}
			}
			newtab2D[j][0] = newtab[j];
			newtab2D[j][1] = Integer.toString(compt);
		}
		for (String[] strings : newtab2D) {
			System.out.println(Arrays.toString(strings));
		}
		
	}
}
