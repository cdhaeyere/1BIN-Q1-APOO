public class Article {

    private String reference;
    private String nom;
    private String description;
    private double horsTVA;
    private double tauxTVA;

    public Article(String reference, String nom, String description, double horsTVA) {
        if (reference == null) throw new IllegalArgumentException("La référence est nulle");
        this.reference = reference;
        if (nom == null) throw new IllegalArgumentException("Le nom ne peut pas être null");
        this.nom = nom;
        this.description = description;
        if (horsTVA < 0) throw new IllegalArgumentException("Le prix doit être positif");
        this.horsTVA = horsTVA;
        this.tauxTVA = 21;
    }

    public Article(String reference, String nom, String description, int horsTVA, double tauxTVA) {
        this(reference, nom, description, horsTVA);
        if (tauxTVA < 0 || tauxTVA > 100) throw new IllegalArgumentException("Le taux de TVA doit être compris entre 0 et 100");
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

    public double getHorsTVA() {
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
        if (promotion < 0 || promotion > 100) throw new IllegalArgumentException("La promotion doit être comprise entre 0 et 100");
        return horsTVA * (1+ tauxTVA/100) * (promotion/100);
    }

    public String toString() {
        return nom + "\n" + "Référence : " + reference;
    }
}
