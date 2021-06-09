package com.first.test;

import java.util.Scanner;

public class Boulangerie {

	public static void main(String[] args) {

		int nbreBaguettes , nbreCakes, nbreGateaux;
		float prixBaguettes , prixCakes, prixGateaux, total;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez nombre baguettes");
		nbreBaguettes = sc.nextInt();
		System.out.println("Donnez prix baguettes");
		prixBaguettes = sc.nextFloat();
		System.out.println("Donnez nombre Cackes");
		nbreCakes = sc.nextInt();
		System.out.println("Donnez prix Cackes");
		prixCakes = sc.nextFloat();
		System.out.println("Donnez nombre gateau");
		nbreGateaux = sc.nextInt();
		System.out.println("Donnez prix gateau");
		prixGateaux = sc.nextFloat();
		
		total = nbreBaguettes * prixBaguettes + nbreCakes * prixCakes + nbreGateaux * prixGateaux;
		System.out.println(nbreBaguettes + " baguettes : prix " + (nbreBaguettes * prixBaguettes));
		System.out.println(nbreCakes + " Cakes : prix " + (nbreCakes * prixCakes));
		System.out.println(nbreGateaux + " Gateaux : prix " + (nbreGateaux * prixGateaux));

		System.out.println("total = " + total);
		sc.close();
	}

}
