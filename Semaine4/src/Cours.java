/*
    @Author : Corentin D'haeyere
 */
public class Cours {

    private String intitule;
    private String niveau;
    private int nombreInscrits = 0;
    private Professeur professeur;

    public Cours(String intitule, String niveau, Professeur professeur) {
        this.intitule = intitule;
        this.niveau = niveau;
        this.professeur = professeur;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getNombreInscrits() {
        return nombreInscrits;
    }

    public void setNombreInscrits(int nombreInscrits) {
        this.nombreInscrits = nombreInscrits;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public void inscrire() {
        nombreInscrits = nombreInscrits++;
    }

    public void desincrire() {
        nombreInscrits = nombreInscrits--;
    }

    public String toString() {
        return intitule + "\n" + "Cours de niveau " + niveau + " donné par " + professeur.getNom() + " " + professeur.getPrenom() + "\nNombre d'élèves inscrits : "+ nombreInscrits;
    }
}
