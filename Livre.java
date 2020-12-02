/**
 * 
 */
package fr.eni.mediatheque;

import java.util.ArrayList;

/**
 * @author aurore
 *
 */
public class Livre extends Document {
	
	private String auteur;
	private int nbPage;
	
	/**
	 *Constructeur livre qui hérite du constructeur du documant en ajoutant un auteur et un nb de page
	 */
	public Livre() {
		new Document();
	}
	
	public Livre(String titre, Statut statut, int numero, Adherent adherent, String auteur, int nbPage) {
		super(titre, statut, numero, adherent);
		this.auteur = auteur;
		this.nbPage = nbPage;
	}
	
	
	
	
	
	
	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the nbPage
	 */
	public int getNbPage() {
		return nbPage;
	}

	/**
	 * @param nbPage the nbPage to set
	 */
	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}

	// fonction afficher améliorée
	@Override
	public String afficher() {
		String s;
				s=super.afficher()+"son auteur est "+this.auteur+".";
				if(this.nbPage>0) {
					s+=" Ce livre a "+nbPage+ " pages";
				}
				return s;
	}
	
	
}
