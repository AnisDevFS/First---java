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
		String[] newtabFinal = new String[10];
		
		String[][] newtab2D = new String[10][2];
		String[][] newtab2DFinal = new String[10][2];
		
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
		System.out.println("---------------");
		
		
			for (int i = 0; i < newtab2D.length; i++) {
				for (int j = 0; j < newtab2D.length; j++) {
					if (newtab2D[i][0].equals(newtab2D[j][0]) && i != j) {
						newtab2D[j][0] = "";
						newtab2D[j][1] = "";
					}
				}
			}
			
			for (int i = 0; i < newtab2D.length; i++) {
				for (int j = 0; j < newtab2D.length; j++) {
					if (!newtab2D[i][1].equals("") && !newtab2D[j][1].equals("")) {
						if (Integer.parseInt(newtab2D[i][1]) > Integer.parseInt(newtab2D[j][1])) {
						String[] temp = newtab2D[i];
						newtab2D[i] = newtab2D[j];
						newtab2D[j] = temp;
						}

					}
				}
			}
			
			int compteur=0;
			for (int i = 0; i < newtab2D.length; i++) {
				
					if (!newtab2D[i][1].equals("")) {
						
						newtabFinal[compteur] = newtab2D[i][0];
						compteur++;
					}
			}
			
			String[] newtabFinalVraiment = new String[compteur];
			
			for (int i = 0; i < compteur; i++) {
				
				if (!newtabFinal[1].equals(null)) {
					
					newtabFinalVraiment[i] = newtabFinal[i];
					
				}
			}

		
		for (String[] strings : newtab2D) {
			System.out.println(Arrays.toString(strings));
		}
		
		System.out.println("---------------");
		System.out.println(Arrays.toString(newtabFinal));
		System.out.println(Arrays.toString(newtabFinalVraiment));
		
	}
}
