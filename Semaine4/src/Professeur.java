/*
    @Author : Corentin D'haeyere
 */
public class Professeur {

    private String matricule;
    private String nom;
    private String prenom;
    private String specialisation;

    public Professeur(String matricule, String nom, String prenom, String specialisation) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.specialisation = specialisation;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String toString() {
        return  matricule + " " + nom + " " + prenom + "\nSpecialisation : " + specialisation;
    }
}
