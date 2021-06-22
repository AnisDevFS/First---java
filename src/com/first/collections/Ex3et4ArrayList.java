package com.first.collections;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class Ex3et4ArrayList {

	public static void main(String[] args) {
			
		String num[] = {"0725836741","664631", "0497456321","0623654789" ,"5665653" , "04iyukjnlj", "04879631kk"};
		ArrayList<String> list = new ArrayList<String>();
		
		for (String s : num) {
			list.add(s);
		}
		
		System.out.println(list);
		System.out.println(numFrancais(list));
	}
	
//	Ex 3 Créer une méthode qui prend cet ArrayList<String>  en paramètre et qui retourne 
//	une autre ArrayList<String>  avec seulement les numéros français
	static ArrayList<String> numFrancais(ArrayList<String> list) {
		
		ArrayList<String> numerosFrancais = new ArrayList<String>();
		
		for (String string : list) {
			String deuxPremiers = string.substring(0, 2);
			if (string.length() == 10 ) {
				if (deuxPremiers.equals("04") || deuxPremiers.equals("06") || deuxPremiers.equals("07")) {
					if (!string.matches(".*[a-z].*") && string.matches(".*[1-9].*")) {
						
						numerosFrancais.add(string);
					}
				}
			}
		}
		return numerosFrancais;
	}
	
	
//	Ex4 :	Créer une méthode qui prend un ArrayList<String> 
//	et qui retourn le String qui a le plus d’occurrence
	
	// methode de constant et Alexis
    static String occurenceArray (ArrayList<String> array) {
        int index = 0;
        int record = 0;
        for (int i = 0 ; i < array.size() ; i++) {
            int count = 0;
            for (int j = i ; j < array.size(); j++) {
                if (array.get(i) == array.get(j)) {
                    count++;
                    }
                }
            if (count > record) {
                record = count;
                index = i;    
            }
        }
        return array.get(index);
    }
    
    // méthode Marian
	static String plusOccurenceArray(ArrayList<String> array) {

		ArrayList<Integer> occurences = new ArrayList<Integer>();

		for (int i = 0; i < array.size(); i++) {
			int count = 0;
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i).equals(array.get(j))) {
					count++;
				}
			}
			occurences.add(count);
		}
		int maxValue = Collections.max(occurences);
		int index = occurences.indexOf(maxValue);
		return array.get(index);
	}
	
	
	
	

}
