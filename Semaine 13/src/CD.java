public class CD extends Produit {

    private String artiste;
    private int nombreDeMorceaux;

    public CD(String reference, double prix, String artiste, int nombreDeMorceaux) {
        super(reference, prix);
        if (artiste.equals("")) throw new IllegalArgumentException();
        this.artiste = artiste;
        if (nombreDeMorceaux == 0) throw new IllegalArgumentException();
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
