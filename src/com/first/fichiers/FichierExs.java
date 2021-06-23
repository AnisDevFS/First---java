package com.first.fichiers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FichierExs {

	public static void main(String[] args) throws IOException {

//		Ex4 : Créer un dossier dans le bureau de vos ordinateur « testJAVA » à l’intérieur créer un fichier
//		txt appelé testJ.txt : Insérer dans testJ.txt les noms des stagiaires un nom pour chaque ligne

		File dossier = new File(System.getProperty("user.home") + "/Desktop/testJAVA");

		if (!dossier.exists())
			dossier.mkdir();

		File file = new File(dossier.getPath() + "/testJ.txt");
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		String[] nous = {"anis" ,"caty", "alexis" , "marian", "jeremy", "julien", "noussaiba", "constant","patrice"};
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		for (String nom : nous) {
			bw.write(nom);
			bw.newLine();
		}
		bw.close();

//		Ex5 : Lire le fichier cVotreExercice.txt ligne par ligne Et insérer chaque nom dans
//		un arrayList<Sting> qui s’appelle lesAutres. Afficher cet Arraylist
		
		File ex2File = new File(dossier.getPath() + "/cVotreExercice.txt");
		ArrayList<String> lesAutres = new ArrayList<String>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ex2File), "UTF-8"));
		String s = reader.readLine();
		
		while (s != null) {
			lesAutres.add(s);
			s = reader.readLine(); 
		}
		reader.close();
		System.out.println(lesAutres);
		
		
//	Ex6 : Dans le dossier testJAVA créer 2 fichier text :
//	Le 1er s’appelle sup5.txt qui contient les noms de stagiaires dont la taille est supérieure ou égals à 5
//	Le 2eme s’appelle inf5.txt qui contient les noms de stagiaires dont la taille est inférieur ou égals à 5

		
		File sup5 = new File(dossier.getPath() + "/sup5.txt");
		File inf5 = new File(dossier.getPath() + "/inf5.txt");
		
		if (!inf5.exists())
			try {
				inf5.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		
		if (!sup5.exists())
			try {
				sup5.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		
		BufferedWriter bwSup5 = new BufferedWriter(new FileWriter(sup5));
		BufferedWriter bwInf5 = new BufferedWriter(new FileWriter(inf5));
		
		for (String nom : nous) {
			if ( nom.length() <= 5) {
				bwInf5.write(nom);
				bwInf5.newLine();
			}
			if ( nom.length() >= 5) {
				bwSup5.write(nom);
				bwSup5.newLine();
			}

		}
		bwSup5.close();
		bwInf5.close();
		
		
		
		
		
		
		
		
//			Ex7 : Imaginant que nous avons un tableau de noms de stagiaires
//			Et l’autre tableau notes contient des entiers qui sont les notes respectives des stagiaires 
//			Créer un 4eme fichier dans notre dossier qui s’appelle notes.txt
//			Qui contient de façon correcte les noms et leurs notes en face et lire ce fichier dans la console
//			Exemple :
//			Anis a eu 7/20
//			Inga a eu 20/20
		
		
		int[] notes = { 15 , 16 , 17 ,15 ,16 ,17, 14, 18 , 14};
		File notesFile = new File(dossier.getPath() + "/notes.txt");
		if (!notesFile.exists())
			try {
				notesFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		BufferedWriter writerNotes = new BufferedWriter(new FileWriter(notesFile));
		
		for (int i = 0 ; i < notes.length ; i++) {
				String ligne = nous[i] + " a eu " + notes[i] +"/20";
				writerNotes.write(ligne);
				writerNotes.newLine();
			
		}
		writerNotes.close();
		
		BufferedReader readerNotes = new BufferedReader(new InputStreamReader(new FileInputStream(notesFile), "UTF-8"));
		String str = readerNotes.readLine();
		
		while (str != null) {
			System.out.println(str);
			str = readerNotes.readLine(); 
		}
		readerNotes.close();

	}

}
