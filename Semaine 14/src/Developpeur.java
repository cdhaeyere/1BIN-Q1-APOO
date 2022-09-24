public class Developpeur {

    private String nom;
    private String specialite;
    private double salaire;
    private int nombreProjetsEnCours;
    private static final String SPECIALITE_PAR_DEFAUT = "full-stack";

    public Developpeur(String nom, String specialite, double salaire) {
        if (nom.equals("")) throw new IllegalArgumentException();
        this.nom = nom;
        if (specialite.equals("")) throw new IllegalArgumentException();
        this.specialite = specialite;
        if (salaire < 0) throw new IllegalArgumentException();
        this.salaire = salaire;
        this.nombreProjetsEnCours = 0;
    }

    public Developpeur(String nom, double salaire) {
        this(nom, SPECIALITE_PAR_DEFAUT, salaire);
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getNombreProjetsEnCours() {
        return nombreProjetsEnCours;
    }

    public void setSpecialite(String specialite) {
        if (specialite.equals("")) throw new IllegalArgumentException();
        this.specialite = specialite;
    }

    public void signalerNouveauProjet() {
        nombreProjetsEnCours = nombreProjetsEnCours + 1;
    }

    public void signalerFinDuProjet() {
        nombreProjetsEnCours = nombreProjetsEnCours - 1;
    }

    @Override
    public String toString() {
        return "Developpeur : " + nom + ", Specialite : " + specialite + ", Salaire : " + salaire + ", Nombre de Projets : " + nombreProjetsEnCours;
    }
}
