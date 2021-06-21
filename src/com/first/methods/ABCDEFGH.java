package com.first.methods;

public class ABCDEFGH {

	public static void main(String[] args) {
			
//		System.out.println(finall(5));
		finalVoid(3 , 6);
		System.out.println("-------");
		finalVoid(4);

	}
	
//	Ex A: m�thode qui retourne true si la l'entier pass� au param est pair et false s'il est impair
	static boolean pairImpair (int i) {
		if (i % 2 == 0 ) return true ;
		else return false;
	}
	
	
	
//	Ex B: m�thode qui calcule et retourne la factorielle d'un entier
	static int fact (int entier) {
		int fact = 1;
		for (int i = 1 ; i <= entier ; i++) {
			fact = i * fact ;
		}	
		return fact ;
	}
	
	
	
//	Ex C: m�thode qui calcule et retourne le produit de 2 entiers a et b
	static int produit (int a , int b) {
		return a*b;
	}
	
	
//	Ex D: m�thode qui calcule et retourne la valeur absolue d'un entier
	static int valeurAbs (int a) {
		if (a < 0) return -a;
		else return a;
	}
		
	
	
//	Ex E: m�thode qui calcule et retourne la puissance 2 d'un entier en utilisant
//	la m�thode de l'ex C et la m�thode de l'ex D
	static int puissance2 (int a) {
//		return produit( valeurAbs(a) , valeurAbs(a)) ;
		return valeurAbs(produit( a  , a)) ;
	}
	
	
//	Ex F: m�htode qui s'appele finall doit prendre en parametre un entier et doit retourn� un String
//	qui d�crit l'entier:  par exemple
//	sysout(final(4)); // 4 est un entier pair sa factoriel est �gale � 24 et 4 puissance 2 est �gale � 16
	static String finall(int a ) {
		if (pairImpair(a)) {
			return a + " est pair , sa fact est �gale � " + fact(a) + " et " + a +
					" puissance 2 est �gale � " + puissance2(a);
		}
		else return a + " est impair , sa fact est �gale � " + fact(a) + " et " + a +
				" puissance 2 est �gale � " + puissance2(a);
	}
	
	
	
////	Ex G: M�thode appel� finalVoid qui prend un entier comme param
//	et qui affiche le string retourn� par la m�thode de l'ex pr�cedent
	static void finalVoid (int a) {
		System.out.println(finall(a));
	}
	
////	Ex H: M�thode appel� finalVoid aussi mais qui prend 2 entiers comme
//	param et qui fait comme la m�thode de l'ex pr�cedent mais pour les 2 entiers.
	static void finalVoid (int a, int b) {
		System.out.println(finall(a));
		System.out.println(finall(b));
	}


}
