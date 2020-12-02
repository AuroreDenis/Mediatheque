package fr.eni.mediatheque;

import java.util.Scanner;

public class TestMax {

	public static void main(String[] args) {
	
//	Création des documents par l'utilisateur	
		
		//liste de documents
		Mediatheque mediatheque=new Mediatheque();
	String choix;
	

	
		System.out.println("Que voulez-vous faire ? \n E - Enregistrer un document \n S - Supprimer Document");
	
int n= mediatheque.
	
	int i=0;
	
	// création d'un document
	Scanner s = new Scanner(System.in);
	//blablabla
	
	choix = s.nextLine();
	int nb;
	
	
	switch(choix) {
	case  "Q" : break;
	case "E" : {
		
		System.out.println("Ce document est ?");
		System.out.println("L - Un livre");
		System.out.println("C - Un CD");
		choix=s.nextLine();
		switch(choix) {
		case "L" : {
			
			Livre l = new Livre(); //création d'un livre
			mediatheque.addLivre(l); // ajouter à la médiathèque
		
			System.out.println("Saisir le nom du document. Si vous ne savez pas écrire Inconnu");
			choix=s.nextLine();
			l.setTitre(choix);
			
			l.setNumero(i+1); // numéro du document directement incrémenté
			i=i+1;
			l.setStatut(Statut.DISPONIBLE); // un livre qui vient d'arriver eet disponible
			
			System.out.println("Saisir l'auteur. Si vous ne savez pas écrire Inconnu");
			choix=s.nextLine();
			l.setAuteur(choix);

			System.out.println("Saisir le nombre de pages. Si vous ne savez pas écrire 0");
			nb=s.nextInt();
			s.nextLine();
			l.setNbPage(nb);
			
			break;
		}
		case "C" :
			CD cd = new CD();

			mediatheque.addCD(cd); // ajouter à la médiathèque
		
			
			System.out.println("Saisir le nom du document. Si vous ne savez pas écrire Inconnu");
			choix=s.nextLine();
			cd.setTitre(choix);
			
			cd.setNumero(i++); // numéro du document directement incrémenté

			cd.setStatut(Statut.DISPONIBLE); // un livre qui vient d'arriver eet disponible
			
			System.out.println("Saisir l'artiste. Si vous ne savez pas écrire Inconnu");
			choix=s.nextLine();
			cd.setArtiste(choix);

			System.out.println("Saisir le style musical du CD. Si vous ne savez pas écrire inconnu");
			choix=s.nextLine();
			cd.setStyle(choix);
			
			break;
		default :
			break;
		}
		break;
	} 
	}
s.close();

			System.out.println(mediatheque.affiche());
			
		}
	
	}

