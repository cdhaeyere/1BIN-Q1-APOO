public class Article {

    private String reference;
    private String nom;
    private String description;
    private int horsTVA;
    private double tauxTVA;

    public Article(String reference, String nom, String description, int horsTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.horsTVA = horsTVA;
        this.tauxTVA = 21;
    }

    public Article(String reference, String nom, String description, int horsTVA, double tauxTVA) {
        this(reference, nom, description, horsTVA);
        this.tauxTVA = tauxTVA;
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

    public int getHorsTVA() {
        return horsTVA;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHorsTVA(int horsTVA) {
        this.horsTVA = horsTVA;
    }

    public void setTauxTVA(int tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public double calculerPrixTVAComprise() {
        return horsTVA * (1+ tauxTVA/100);
    }

    public double calculerPrixTVAComprise(double promotion) {
        return horsTVA * (1+ tauxTVA/100) * (promotion/100);
    }

    public String toString() {
        return nom + "\n" + "Référence : " + reference;
    }
}
