import java.util.ArrayList;

public class Vin extends BoissonAlcoolisee {

    private String cepage;
    private String couleur;
    private String region;
    private String pays;

    private final static ArrayList<String> COULEURS = new ArrayList<>();

    public Vin(String nom, int contenance, double prix, double degre, String cepage, String couleur, String region, String pays) {
        super(nom, contenance, prix, degre);
        this.cepage = cepage;
        if (!COULEURS.contains(couleur)) throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
        this.couleur = couleur;
        this.region = region;
        this.pays = pays;
    }

    public static ArrayList<String> getCOULEURS() {
        return COULEURS;
    }

    public String getCepage() {
        return cepage;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getRegion() {
        return region;
    }

    public String getPays() {
        return pays;
    }

    @Override
    public String toString() {
        return "Vin{" +
                "cepage='" + cepage + '\'' +
                ", couleur='" + couleur + '\'' +
                ", region='" + region + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
