package com.first.collections;

import java.util.HashMap;

public class CoursHashMap {

	public static void main(String[] args) {
			
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Allemagne"); 
		map.put(1, "USA"); map.put(2, "Chine");
		map.put(3, "Japon"); 
		System.out.println(map);
		
		for (String i : map.values()) {
			  System.out.println(i);
			}
		
		System.out.println("la valeur avec la clé "+ 3 + " est " + map.get(3));
//		System.out.println("la clé avec de la valeur Japon est " + map.getKey("Japon"));
		
		for (int cle : map.keySet()) {
			  System.out.println("key: " + cle + " value: " + map.get(cle));
			}
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("En", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);

	}

}
