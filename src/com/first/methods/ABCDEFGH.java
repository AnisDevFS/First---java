package com.first.methods;

public class ABCDEFGH {

	public static void main(String[] args) {
			
//		System.out.println(finall(5));
		finalVoid(3 , 6);
		System.out.println("-------");
		finalVoid(4);

	}
	
//	Ex A: méthode qui retourne true si la l'entier passé au param est pair et false s'il est impair
	static boolean pairImpair (int i) {
		if (i % 2 == 0 ) return true ;
		else return false;
	}
	
	
	
//	Ex B: méthode qui calcule et retourne la factorielle d'un entier
	static int fact (int entier) {
		int fact = 1;
		for (int i = 1 ; i <= entier ; i++) {
			fact = i * fact ;
		}	
		return fact ;
	}
	
	
	
//	Ex C: méthode qui calcule et retourne le produit de 2 entiers a et b
	static int produit (int a , int b) {
		return a*b;
	}
	
	
//	Ex D: méthode qui calcule et retourne la valeur absolue d'un entier
	static int valeurAbs (int a) {
		if (a < 0) return -a;
		else return a;
	}
		
	
	
//	Ex E: méthode qui calcule et retourne la puissance 2 d'un entier en utilisant
//	la méthode de l'ex C et la méthode de l'ex D
	static int puissance2 (int a) {
//		return produit( valeurAbs(a) , valeurAbs(a)) ;
		return valeurAbs(produit( a  , a)) ;
	}
	
	
//	Ex F: méhtode qui s'appele finall doit prendre en parametre un entier et doit retourné un String
//	qui décrit l'entier:  par exemple
//	sysout(final(4)); // 4 est un entier pair sa factoriel est égale à 24 et 4 puissance 2 est égale à 16
	static String finall(int a ) {
		if (pairImpair(a)) {
			return a + " est pair , sa fact est égale à " + fact(a) + " et " + a +
					" puissance 2 est égale à " + puissance2(a);
		}
		else return a + " est impair , sa fact est égale à " + fact(a) + " et " + a +
				" puissance 2 est égale à " + puissance2(a);
	}
	
	
	
////	Ex G: Méthode appelé finalVoid qui prend un entier comme param
//	et qui affiche le string retourné par la méthode de l'ex précedent
	static void finalVoid (int a) {
		System.out.println(finall(a));
	}
	
////	Ex H: Méthode appelé finalVoid aussi mais qui prend 2 entiers comme
//	param et qui fait comme la méthode de l'ex précedent mais pour les 2 entiers.
	static void finalVoid (int a, int b) {
		System.out.println(finall(a));
		System.out.println(finall(b));
	}


}
