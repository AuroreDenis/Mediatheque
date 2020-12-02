package fr.eni.mediatheque;


public class Test {

	public static void main(String[] args) {
		
		
		// Création d'une table de hash pour stocker les documents
		Mediatheque l = new  Mediatheque();
		

		int numAdh=1;
		
		Adherent Elinor = new Adherent("Dashwood", "Elinor", numAdh, null);
		Adherent Edward = new Adherent("Ferrars", "Edward", numAdh+1, null);
		
			
		// créationdes documents
		Livre livre1 = new Livre("Raisons et sentiments", Statut.DISPONIBLE, 1, null, "Jane Austen", 456);
		Livre livre2 = new Livre("Farenheit 451", Statut.DISPONIBLE,2, null, "Ray Bradbury", 236);
		DVD dvd3 = new DVD("Parasite", Statut.DISPONIBLE , 3, null, "Bong Joon-ho", Format.BLURAY, 132);
		CD cd4 = new CD("Solo Piano", Statut.ARCHIVE, 4,  null, "Chilly Gonzales", "Musique instrumentale");
		CD cd5 = new CD("Les failles", Statut.EMPRUNTE, 5, Edward, "Pomme", "chanson française");
		CD cd6 = new CD("S16", Statut.DISPONIBLE, 6, null, "Woodkid", "indie pop");
		
	
			
		Elinor.emprunter(livre1);
		Elinor.emprunter(livre2);	
		Elinor.emprunter(cd6);
		
		System.out.println(Elinor.afficher());
		
		Elinor.rendre(livre1);
	
		l.ajouterLivre(livre1.getNumero(), livre1);
		l.ajouterLivre(livre2.getNumero(), livre2);
		l.ajouterCD(cd4.getNumero(), cd4);
		l.ajouterCD(cd5.getNumero(), cd5);
		l.ajouterCD(cd6.getNumero(), cd6);
		l.ajouterDVD(dvd3.getNumero(), dvd3);
		
		System.out.println(l.affiche());
		
		System.out.println(l.afficheLeDoc(3));
			
	
		
	} // fin main
		
		
		
}// fin classe
	
/*

System.out.println("Que voulez-vous faire?");

System.out.println("1 - Nouveau document");

System.out.println("2 - Lister tous les documents");

System.out.println("3 - Afficher les détails d'un document");

System.out.println("4 - Quitter le programme");
*/


