public class Serie {

    private char nom;
    private Etudiant delegue;

    public Serie(char nom) {
        this.nom = nom;
    }

    public char getNom() {
        return nom;
    }

    public Etudiant getDelegue() {
        return delegue;
    }

    public boolean elireDelegue(Etudiant delegue) {
        if (delegue.getSerie() == this) {
            this.delegue = delegue;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (delegue == null) {
            return "Serie " + nom;
        } else  {
            return "Serie " + nom + " (" + delegue.getNom() + " " + delegue.getPrenom() + ")";
        }
    }
}
