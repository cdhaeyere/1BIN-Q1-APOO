/*
    @Author : Corentin D'haeyere
 */
public class Eleve {

    private String nom;
    private String prenom;
    private Cours coursPrincipal;
    private Cours coursComplementaire;

    public Eleve(String nom, String prenom, Cours coursPrincipal, Cours coursComplementaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.coursPrincipal = coursPrincipal;
        coursPrincipal.inscrire();
        this.coursComplementaire = coursComplementaire;
        coursComplementaire.inscrire();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Cours getCoursPrincipal() {
        return coursPrincipal;
    }

    public void setCoursPrincipal(Cours coursPrincipal) {
        coursPrincipal.inscrire();
        this.coursPrincipal = coursPrincipal;
        coursPrincipal.desincrire();
    }

    public Cours getCoursComplementaire() {
        return coursComplementaire;
    }

    public void setCoursComplementaire(Cours coursComplementaire) {
        coursComplementaire.inscrire();
        this.coursComplementaire = coursComplementaire;
        coursComplementaire.desincrire();
    }

    public String toString() {
        return nom + " " + prenom + " \nCours principal : " + coursPrincipal + "\nCours complémentaire : " + coursComplementaire;
    }
}
