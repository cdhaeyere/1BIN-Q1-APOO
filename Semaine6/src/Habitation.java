public class Habitation {

    private Personne proprietaire;
    private Adresse adresse;
    private double revenuCadastral;
    private int anneeConstruction;
    private double surface;

    public Habitation(Personne proprietaire, Adresse adresse, double revenuCadastral, int anneeConstruction, double surface) {
        if (proprietaire == null) throw new IllegalArgumentException("Un propriétaire valide est requis");
        this.proprietaire = proprietaire;
        if (adresse == null) throw new IllegalArgumentException("Une adresse valide est requise");
        this.adresse = adresse;
        if (revenuCadastral < 0) throw new IllegalArgumentException("Le revenu cadastral ne peut pas être négatif");
        this.revenuCadastral = revenuCadastral;
        if (anneeConstruction < 0) throw new IllegalThreadStateException("L'année ne peut pas être négative");
        this.anneeConstruction = anneeConstruction;
        if (surface < 0) throw new IllegalArgumentException("La surface ne peut pas être négative");
        this.surface = surface;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public double getRevenuCadastral() {
        return revenuCadastral;
    }

    public int getAnneeConstruction() {
        return anneeConstruction;
    }

    public double getSurface() {
        return surface;
    }

    public void setProprietaire(Personne proprietaire) {
        if (proprietaire == null) throw new IllegalArgumentException("Un propriétaire valide est requis");
        this.proprietaire = proprietaire;
    }

    public void multiplierRevenuCadastral(int i) {
        if (i <= 0) throw new IllegalArgumentException("Le coefficient doit être supérieur à 1");
        revenuCadastral = revenuCadastral * i;
    }

    public double calculerPrecompte(int i) {
        if (i <= 0 || i > 100) throw new IllegalArgumentException("Le pourcentage doit être compris entre 1 et 100");
        return (revenuCadastral * i) / 100;
    }

    public String toString() {
        return "Habitation : \nProprio : " + proprietaire.toString() + "\n" + adresse.toString() + "\nRevenu cadastral : " + revenuCadastral + "\nAnnée construction : "  + anneeConstruction + "\nSurface : " + surface;
    }
}
