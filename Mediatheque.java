package fr.eni.mediatheque;

import java.util.ArrayList;
import java.awt.List;

public class Mediatheque {

	private ArrayList<Livre> listeLivre;

	private ArrayList<CD> listeCD;

	private ArrayList<DVD> listeDVD;

	/**
	constructeur de médiathèque -> une liste de DVD, une de livres et une de CD
	 */
	public Mediatheque() {
		this.listeLivre = new ArrayList<Livre>();
		this.listeCD = new ArrayList<CD>();
		this.listeDVD = new ArrayList<DVD>();
		
	}

//	ajouter un CD
	    public void addCD(CD cd){
		this.listeCD.add(cd);
	    }


//		ajouter un livre
	    public void addLivre(Livre livre){
		this.listeLivre.add(livre);
	    }
	    
	    

//		ajouter un dvd
	    
	    public void addDVD(DVD dvd) {
	    	this.listeDVD.add(dvd);
	    }
	    
	    //taille de la médiathèque
	    public int taille() {
	    	return this.listeCD.size()+ this.listeLivre.size()+ this.listeDVD.size();
	    }
	    
	    
	    //rassembler les 3 listes
	    
	    public ArrayList<Document> map(){
	        ArrayList<Document> resultats = new ArrayList<Document>();
	        for (CD cd: this.listeCD){
	            resultats.add(cd);
	        }
	        for (Livre livre : this.listeLivre){
	            resultats.add(livre);
	        }
	        for (DVD dvd : this.listeDVD){
	            resultats.add(dvd);
	        }
	        
	        return resultats;
	        }
	    
	    //Afffiche la médiathèque
	    public  String affiche() {
	    	String s="";
	    	int i=0;
	    	int cd=0;
	    	int dvd=0;
	    	while(i< this.listeLivre.size()) {
	    		s+=this.listeLivre.get(i).afficher()+"\n";
	    		i++;
	    	}
	    	while(cd< this.listeCD.size()){

	    		s+=this.listeCD.get(cd).afficher()+"\n";
	    		cd++;
	    		
	    	}
	    	while(dvd< this.listeDVD.size()){

	    		s+=this.listeDVD.get(dvd).afficher()+"\n";
	    		dvd++;
	    	}
	    	return s;
	    }
	    
	    
	    
}
	
