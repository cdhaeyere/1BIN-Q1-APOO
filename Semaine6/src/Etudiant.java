public class Etudiant {

    private String matricule;
    private String nom;
    private String prenom;
    private Serie serie;

    public Etudiant(String matricule, String nom, String prenom, Serie serie) {
        if (matricule == null) throw new IllegalArgumentException("Un matricule valide est requis");
        this.matricule = matricule;
        if (nom == null) throw new IllegalArgumentException("Un nom valide est requis");
        this.nom = nom;
        if (prenom == null) throw new IllegalArgumentException("Un prenom valide est requis");
        this.prenom = prenom;
        if (serie == null) throw new IllegalArgumentException("Une série valide est requis");
        this.serie = serie;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Serie getSerie() {
        return serie;
    }

    public void changerSerie(Serie serie) {
        if (serie == null) throw new IllegalArgumentException("La série ne peut pas être null");
        if (serie.getDelegue() == this) throw new IllegalArgumentException("L'étudiant délégué ne peut pas changer de série");
        this.serie = serie;
    }

    public String toString() {
        return matricule + ", " + nom + " " + prenom + " (" + serie + ")";
    }
}
