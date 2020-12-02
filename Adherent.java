package fr.eni.mediatheque;

import java.util.ArrayList;

public class Adherent {

	private String nom;
	private String prenom;
	private int num;
	private ArrayList<Document> listeDoc; // liste des documents empruntés
	
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param num
	 */
	public Adherent(String nom, String prenom, int num, ArrayList<Document> listeDoc) {
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		
		if(listeDoc!=null)  {this.listeDoc=listeDoc;}
		else {this.listeDoc = new ArrayList<Document>();}
		
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**
	 * @return the listeDoc
	 */
	public ArrayList<Document> getListeDoc() {
		return listeDoc;
	}



	/**
	 * @param listeDoc the listeDoc to set
	 */
	public void setListeDoc(ArrayList<Document> listeDoc) {
		this.listeDoc = listeDoc;
	}



	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}



	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	
	//    emprunter un document
	public boolean emprunter(Document doc) {
		boolean ok=false;
		if(doc == null) {
			System.err.println("ce document n'existe pas");
		}
		else {
			if( doc.getStatut().equals(Statut.DISPONIBLE)|| doc.getStatut().equals(Statut.ARCHIVE)) {
				ok=this.getListeDoc().add(doc);
				doc.setStatut(Statut.EMPRUNTE);
				doc.setEmprunteur(this);
			}
			else {
				System.err.println("il est impossible d'emprunter ce document");
			}
		}
		return ok;
		
	}
	
	public void rendre(Document doc) {
		if(doc == null) {
			System.err.println("ce document n'existe pas");
		}
		else {
			if(doc.getEmprunteur()==null) {
				System.err.println("cet adhérent n'existe pas");
			}
			if( doc.getStatut().equals(Statut.EMPRUNTE)) {
				this.getListeDoc().remove(doc);
				doc.setStatut(Statut.DISPONIBLE);
				doc.setEmprunteur(null);
			}
			else {
				System.err.println("il est impossible de rendre ce document");
			}
		}
		
	}
		
		
	

	public String afficher() {
		int i=0;
		StringBuffer s = new StringBuffer();
		s.append("L'adhérent.e n°" + this.getNum() +" est " + this.getPrenom() +" "+  this.getNom() +  " il/elle a emprunté.e : \n");
		while( i<this.getListeDoc().size()) {
			s.append(this.getListeDoc().get(i).liste()+'\n');
			i++;
		}
		if(i==0) {
			s.append(" rien ")  ;
		}
				
		return s.toString();
	}
	
	
}

