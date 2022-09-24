public class Serie {

    private char nom;
    private Etudiant delegue;

    public Serie(char nom) {
        if (nom == '\u0000') throw new IllegalArgumentException("Un nom valide est requis");
        this.nom = nom;
    }

    public char getNom() {
        return nom;
    }

    public Etudiant getDelegue() {
        return delegue;
    }

    public void elireDelegue(Etudiant delegue) {
        if (delegue == null) throw new IllegalArgumentException("Un étudiant doit être renseigné dans la méthode");
        if (this.delegue != null) throw new IllegalStateException("La série a déja un délégué");
        this.delegue = delegue;
    }

    public String toString() {
        if (delegue == null) {
            return "Serie " + nom;
        } else  {
            return "Serie " + nom + " (" + delegue.getNom() + " " + delegue.getPrenom() + ")";
        }
    }
}
