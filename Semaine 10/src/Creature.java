public class Creature extends CarteJeu {

    private String nom;
    private int pointsDeVie;
    private int pointsDeDegats;

    public Creature(int cout, String nom, int pointsDeVie, int pointsDeDegats) {
        super(cout);
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.pointsDeDegats = pointsDeDegats;
    }

    public Creature(int cout, String nom) {
        super(cout);
        this.nom = nom;
        pointsDeDegats = 0;
        pointsDeVie = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getPointsDeDegats() {
        return pointsDeDegats;
    }

    @Override
    public String fournirDetail() {
        return "Creature - cout : " + getCout() + " nom : " + nom;
    }
}
