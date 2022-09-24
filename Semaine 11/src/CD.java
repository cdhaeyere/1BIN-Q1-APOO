public class CD extends Produit {

    private String artiste;
    private int nombreDeMorceaux;

    public CD(String reference, double prix, String artiste, int nombreDeMorceaux) {
        super(reference, prix);
        this.artiste = artiste;
        this.nombreDeMorceaux = nombreDeMorceaux;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNombreDeMorceaux() {
        return nombreDeMorceaux;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artiste='" + artiste + '\'' +
                ", nombreDeMorceaux=" + nombreDeMorceaux +
                '}';
    }
}
