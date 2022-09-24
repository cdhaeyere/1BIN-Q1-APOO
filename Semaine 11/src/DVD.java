public class DVD extends Produit {

    private String realisateur;

    public DVD(String reference, double prix, String realisateur) {
        super(reference, prix);
        this.realisateur = realisateur;
    }

    public String getRealisateur() {
        return realisateur;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "realisateur='" + realisateur + '\'' +
                '}';
    }
}
