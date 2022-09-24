public class Sortilege extends CarteJeu {

    private String nom;
    private String explication;

    public Sortilege(int cout, String nom, String explication) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }

    public String getNom() {
        return nom;
    }

    public String getExplication() {
        return explication;
    }

    @Override
    public String fournirDetail() {
        return "Sortilege - cout : " + getCout() + " nom : " + nom;
    }
}
