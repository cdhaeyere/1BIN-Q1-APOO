
public class Article {

	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private final int tauxTVA;
	public static int nbArticles = 0;

	public Article(String reference, String nom, String description, double prixHTVA) {
		if (reference.equals("")) throw new IllegalArgumentException();
		if (nom.equals("")) throw new IllegalArgumentException();
		if (description.equals("")) throw new IllegalArgumentException();
		this.tauxTVA = 21;
		this.description = description;
		this.prixHTVA = prixHTVA;
		this.reference = reference;
		this.nom = nom;
		nbArticles++;
	}

	public String getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixHTVA() {
		return prixHTVA;
	}
	
	public void setPrixHTVA(double prixHTVA) {
		if (prixHTVA <= 0) throw new IllegalArgumentException("Le prix ne peut pas être inférieur ou égal à 0");
		this.prixHTVA = prixHTVA;
	}

	public int getTauxTVA() {
		return tauxTVA;
	}

	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) {
		if (reduction <= 0 ||reduction >= 100 ) throw new IllegalArgumentException();
		return calculerPrixTVAComprise() * (1-reduction/100.0);
	}

	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
	}
	
	
}
