package com.first.collections;

import java.util.*;

public class ArrayyList {

	public static void main(String[] args) {
			
		ArrayList<String> listS = new ArrayList<String>(10);
		List<Integer> listInt = new ArrayList<Integer>();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		System.out.println(list2.isEmpty());
		int[] tab = { -1 , 9 , 8 , -7 , -99 , 1 , -6};
		for (int i : tab) {
			if ( i < 0) list2.add(i);
		}
		Collections.sort(list2);
		System.out.println(list2);
		
		listS.add("anis"); listS.add("marian");
		listS.add("anis"); listS.add("marian");
		listS.add(2 ,"Alexis");
		System.out.println(listS.size());
		listInt.add(9); listInt.add(19);
		
		System.out.println(listS);
		System.out.println(listInt);
		System.out.println(listS.indexOf("Alexis"));
		
//		for (String str : listS) {
//			if (str.charAt(0) == 'A' || str.charAt(0) == 'a')
//				System.out.println(str);
//		}
		
		for (int i = 0 ; i < listS.size() ; i++) {
			System.out.println(listS.get(i));
		}
		
		System.out.println("--------------");
		
//		listS.remove("anis");
//		listS.remove("anis");
		ArrayList<String> listS1 = new ArrayList<String>(10);
		listS1.add("anis"); listS1.add("marian");
		listS.removeAll(listS1);
		
		listInt.clear();
		System.out.println(listInt);
		System.out.println(listS);
		System.out.println(listInt.isEmpty());
		System.out.println(listS.isEmpty());
		System.out.println(listS.indexOf("Alexis"));
	}

}
