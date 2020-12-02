package fr.eni.mediatheque;

import java.util.Hashtable;
import java.util.Map;

public class Mediatheque {
	
	private Map<Integer, Document>  listeDocuments;

	/**
	constructeur de médiathèque -> une liste de DVD, une de livres et une de CD
	 */
	public Mediatheque() {
		this.listeDocuments = new Hashtable<>();		
	}
	    
	    //taille de la médiathèque
	    public int taille() {
	    	return listeDocuments.size();
	    }

	    public void ajouterLivre(int i, Livre l) {
	    	listeDocuments.put(i, l);
	    }
	    

	    public void ajouterCD(int i, CD cd) {
	    	listeDocuments.put(i, cd);
	    }
	    

	    public void ajouterDVD(int i,DVD dvd) {
	    	listeDocuments.put(i, dvd);
	    }
	    
	    
	    // obtenir l'élément voulu
	    public String afficheLeDoc(int i) {
	    	return this.listeDocuments.get(i).afficher();
	    }
	    
	    //Afffiche la médiathèque
	    public  String affiche() {
	    	String s="";
	    	int i=1;
	    	while(i< this.taille()) {
	    		s+=this.listeDocuments.get(i).liste()+"\n";
	    		i++;
	    	}
	    	return s;
	    }
	    
	    
	    
}
	
