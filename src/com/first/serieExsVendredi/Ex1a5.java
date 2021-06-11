package com.first.serieExsVendredi;

public class Ex1a5 {

	public static void main(String[] args) {

        String [] j2ee = { "Marian", "Caty", "Alexis", "Noussaiba" ,"Jeremy" , "Julie" }; 
		
		// Ex1
        System.out.println("Ex1 : plus de 4 caractères ");
        for (int i = 0 ; i < j2ee.length ; i++) {
        	if (j2ee[i].length() > 4)
        		System.out.println(j2ee[i]);
        }
        
		// Ex2
        System.out.println("Ex2 : mois de 5 caractères ");
        for (String str : j2ee) {
        	if (str.length() < 5)
        		System.out.println(str);
		}
        
		// Ex3
        System.out.println("Ex3 : commencent par 'J' ");
        for (String str : j2ee) {
        	if (str.charAt(0) == 'J')
        		System.out.println(str);
		}
        
		// Ex4
        System.out.println("Ex4 : composés par 4 et 5 char ");
        for (String str : j2ee) {
        	if (str.length() == 4 || str.length() == 5)
        		System.out.println(str);
		}
        
		// Ex5
        System.out.println("Ex5 : contiennent 'e' ");
        for (String str : j2ee) {
        	if (str.contains("e"))
        		System.out.println(str);
		}
		// Ex5 à la traditionnelle 
        System.out.println("Ex5 : contiennent 'e' ");
        for (String str : j2ee) {
        	
        	for (int j = 0 ; j < str.length() ; j++) {
        		if (str.charAt(j) == 'e') {
        			System.out.println(str);
        			break;
        		}
        	}
        	
		}

	}

}
