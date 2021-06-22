package com.first.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExsHashMap {

	public static void main(String[] args) {
		
		// op�rateur ternaire
		int n = 0 ;
		String str = n > 0 ? "Positif"  : "N�gatif";
		System.out.println(n > 0 ? "Positif"  : 
			n == 0 ? "null"  : "N�gatif");
		
//		Ex 1 :(travail de recherche qui peut etre un travail de code)
//			Comment trouver la cl� si on a sa valeur dans une Hashmap
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Allemagne"); 
		map.put(1, "USA"); map.put(2, "Chine");
		map.put(3, "Japon"); 
		System.out.println(map);
		
		System.out.println(map.get(3));
		
		for (Entry<Integer, String> pair : map.entrySet()) {
			if (pair.getValue().equals("Allemagne")) {
				System.out.println("la cl� pour Allemagne est "+ pair.getKey());
				break;
			}
		}
		
		for (int cle : map.keySet()) {
			if (map.get(cle).equals("Allemagne")) {
				System.out.println("la cl� pour Allemagne est "+ cle);
				break;
			}
		}
		
		
		HashMap<String, Long> demographies = new HashMap<String, Long >();
		demographies.put("USA", 300000000l);
		demographies.put("CHINE", 1500000000l);
		demographies.put("MAROC", 30000000l);
		demographies.put("France", 70000000l); 
		System.out.println(demographies);
		System.out.println(plusPeuple(demographies));
		
		
		
	    HashMap<String, String> DB = new HashMap<String, String>();
	    DB.put("robocop", "187");
	    DB.put("anis", "1234");
	    DB.put("JosepDB", "666");
	    DB.put("facile", "007"); 
	    
	    System.out.println(authentifications(DB, "anis", "12345"));

	}
	
//	Ex 2 : Cr�er une m�thode qui prend en param notre Hashmap <String, Long>
//	Et qui retourne un String qui est le pays qui a le plus de population
	
	
	static String plusPeuple(HashMap <String, Long> mappy) {
		
		long maxPeuple = 0;
		String payPlusPeuple = "";
		for (Entry<String, Long> pair : mappy.entrySet()) {
			if (pair.getValue() > maxPeuple) {
				maxPeuple = pair.getValue();
				payPlusPeuple = pair.getKey();
			}
		}
		
		return payPlusPeuple;
	}
	

	
	
	
//Ex 3	Cr�er une m�thode authentification Qui prend en param�tre notre HashMap<string, string>
//	Et 2 String id et mp et retourne true si l�id et le mot de passe forme un �l�ment dans le hashmap 

	static boolean authentifications(HashMap<String, String> DB, String identifiant, String motDePasse) {
		
		for (String cle : DB.keySet()) {
			
			if (cle.equals(identifiant) && DB.get(cle).equals(motDePasse)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	

	
	
	
	
	

}
