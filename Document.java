package fr.eni.mediatheque;

public  class  Document {

	private String titre;
	private Statut statut;
	private int numero;
	private Adherent emprunteur;
	/** 
	 * Constructeur de document 
	 * connaissant son titre, son statut (emprunté, disponible etc.) et son numero (en fonction de son ajout)
	 */
	public Document(String titre, Statut statut, int numero, Adherent emprunteur) {
		super();
		this.titre = titre;
		this.statut = statut;
		this.numero = numero;
		this.emprunteur= emprunteur;
	}

	public Document() {
		new Object();
	}
	
	
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the emprunteur
	 */
	public String getEmprunteur() {
		if (emprunteur==null) {return "ce livre n'est pas emprunté";}
		return  "emprunteur.getNum()";
	}




	/**
	 * @param emprunteur the emprunteur to set
	 */
	public void setEmprunteur(Adherent emprunteur) {
		if (this.emprunteur == null  || this.emprunteur.equals(emprunteur)  ) {
		this.emprunteur = emprunteur;}
		else {System.err.println(" Impossible d'emprunter ce document il n'est pas disponible");}
	}




	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * Fonction qui permet d'obtenir le statut d'un document
	 */
	public Statut getStatut() {
		return statut;
	}


	/**
	 * Fonction qui permet de changer le statut d'un document
	 */
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	

	//Fonction qui affiche le document (fonction qui sera complété dans ses héritières
	public String afficher() {
		
		return String.format("Le document n° %d est %s, actuellement il est %s " ,  this. numero, this.titre, this.statut);
	}
	
	
	//création liste de documents
	
	
	
	public String liste() {
		String ss = this.getClass().getName(); 
		String type = ss.substring(19);
		StringBuffer s= new StringBuffer();
		s.append(this.getNumero() + " - "  + this.getTitre() + " (" + type+")");
		return s.toString();
	}
	
	
	
	// fonction qui change le statut du livre lorsqu'il est emprunté
	public void emprunt() {
		if(this.getStatut().equals(Statut.DISPONIBLE)) {
			this.setStatut(Statut.EMPRUNTE);}
		else if(this.getStatut().equals(Statut.EMPRUNTE)) {
				this.setStatut(Statut.DISPONIBLE);}
	}
	
	
}
	
