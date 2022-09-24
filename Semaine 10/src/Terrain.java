import java.util.ArrayList;

public class Terrain extends CarteJeu {

    private char couleur;

    private final static ArrayList<Character> COULEURS = new ArrayList<>();

    public Terrain(int cout, char couleur) {
        super(cout);
        this.couleur = couleur;
    }

    public char getCouleur() {
        return couleur;
    }

    @Override
    public String fournirDetail() {
        return "Terrain - cout : " + getCout() + " couleur : " + couleur;
    }
}
