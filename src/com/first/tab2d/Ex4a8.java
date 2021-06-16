package com.first.tab2d;

public class Ex4a8 {

	public static void main(String[] args) {
			
		String[][] j2ee = { 
				{"adil", "inga" , "dalia"} ,
                {"Sébastien", "imen" } , 
                {"Anis", "mehdi" ,"Pachara" , "nga" } 
            };
		
		
		// Ex 4 afficher les strings du tableau que par des for traditionnelles
		for (int i = 0 ; i < j2ee.length ; i++) {
			
			for (int j = 0 ; j < j2ee[i].length ; j++) {	
				System.out.println(j2ee[i][j]);
			}
		}
		System.out.println("---------------");
		
		// Ex 5 Parcourir le j2ee et afficher à chaque fois la taille de l’élément (tableau)
		for (int i = 0 ; i < j2ee.length ; i++) {
			System.out.println(j2ee[i].length);
		}
		System.out.println("---------------");
		
		// Ex 6 Parcourir le j2ee et afficher à chaque fois la langueur du l'élément (String)
		for (int i = 0 ; i < j2ee.length ; i++) {
			
			for (int j = 0 ; j < j2ee[i].length ; j++) {	
				System.out.println(j2ee[i][j].length());
			}
		}
		System.out.println("---------------");


		// Ex 7 Parcourir le j2ee et afficher seulement les éléments (String) du tableau le plus long
		int maxTaille = 0; int index = 0;
		for (int i = 0 ; i < j2ee.length ; i++) {
			if (maxTaille < j2ee[i].length ) {
				maxTaille = j2ee[i].length;
				index = i ;
			}
		}
		System.out.println("index du tab plus grand = " + index);
		for (String s : j2ee[index]) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		
		// Ex 8 afficher les strings du tableau que par des for traditionnelles
		for (int i = 0 ; i < j2ee.length ; i++) {
			
			for (int j = 0 ; j < j2ee[i].length ; j++) {	

				for (int k = 0 ; k < j2ee[i][j].length() ; k++) {	
					if ( Character.isUpperCase( j2ee[i][j].charAt(k) )) {
						System.out.println(j2ee[i][j]);
						break;
					}
				}
			}
		}
		System.out.println("---------------");

	}

}
