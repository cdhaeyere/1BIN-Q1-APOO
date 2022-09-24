public class PersonneModified {

    private PersonneModified parent1;
    private PersonneModified parent2;
    private String nom;
    private String prenom;
    private String numero;
    private Adresse adresse;
    private char genre;

    public PersonneModified(PersonneModified parent1, PersonneModified parent2, String nom, String prenom, String numero, char genre, Adresse adresse) {
        this(nom, prenom, numero, adresse, genre);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public PersonneModified(PersonneModified parent1, String nom, String prenom, String numero, char genre, Adresse adresse) {
        this(nom, prenom, numero, adresse, genre);
        this.parent1 = parent1;
    }

    public PersonneModified(String nom, String prenom, String numero, Adresse adresse, char genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.adresse = adresse;
        this.genre = genre;
    }

    public PersonneModified getParent1() {
        return parent1;
    }

    public PersonneModified getParent2() {
        return parent2;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public char getGenre() {
        return genre;
    }

    public String getNumero() {
        return numero;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public boolean isDescendantOf(PersonneModified personne) {
        if (parent1 == personne || parent2 == personne) {
            return true;
        }
        else if (parent1.getParent1() == personne || parent2.getParent1() == personne) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        if (parent1 != null && parent2 == null) {
            return nom + " " + prenom + " (" + genre + ") " + numero + " qui a comme parent " + parent1.toString();
        } else if (parent1 != null && parent2 != null) {
            return nom + " " + prenom + " (" + genre + ") " + numero + " qui a comme parent " + parent1.toString() + " et " + parent2.toString();
        } else {
            return nom + " " + prenom + " (" + genre + ") " + numero;
        }
    }
}
