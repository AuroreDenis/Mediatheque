package fr.eni.mediatheque;

public class DVD extends Document {

	private String real;
	private Format format;
	private int duree;
	
	/**constructeur de dvd qui hérite de celui du document 
	 */
	public DVD(String titre, Statut statut, int numero, Adherent adhe, String real, Format format, int duree) {
		super(titre, statut, numero, adhe);
		this.real = real;
		this.format = format;
		this.duree = duree;
	}
	

// fonction afficher améliorée
	
	@Override
	public String afficher() {
		return super.afficher()+" son réalisateur est "+this.real+". Il dure "+duree+ " minutes. Il est disponible au format "+format;
	}
	
}
