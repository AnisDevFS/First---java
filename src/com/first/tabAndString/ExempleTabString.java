package com.first.tabAndString;

public class ExempleTabString {

	public static void main(String[] args) {
		
		String str = "Formation";
		char[] mom = str.toCharArray();
		str = String.valueOf(mom);
		System.out.println(str);
		
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		
		System.out.println(str.charAt(str.length() - 1));
		
		System.out.println("\n"+ str.toUpperCase());
//		str = str.toUpperCase();
		System.out.println(str);
		char dernier = str.charAt(str.length() - 1);
		System.out.println("\n"+ Character.toUpperCase(dernier));
	}

}
