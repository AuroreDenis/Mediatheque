/**
 * 
 */
package fr.eni.mediatheque;

/**
 * @author aurore
 *
 */
public class CD extends Document {
	private String artiste;
	private String style;
	
	/**
Constructeur de CD qui hérite de celui de document 
en ajoutant le nom de l'artiste et le style musical
	*/
	
	public CD(String titre, Statut statut, int numero, Adherent adhe, String artiste, String style) {
		super(titre, statut, numero, adhe);
		this.artiste = artiste;
		this.style = style;
	}
	
	public CD() {
		new Document();
	}


	/**
	 * @return the artiste
	 */
	public String getArtiste() {
		return artiste;
	}

	/**
	 * @param artiste the artiste to set
	 */
	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	// fonction afficher améliorée
	@Override
	public String afficher() {
		return super.afficher()+"l'artiste est "+this.artiste+". Le style musical est "+ style;
	}
}
