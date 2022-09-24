    public class Personne {

    public String nom;
    public String prenom;
    public int jour;
    public int mois;
    public int annee;
    public String rue;
    public int numero;
    public int postal;
    public String ville;

    public Personne(String nom, String prenom, int jour, int mois, int annee, String rue, int numero, int postal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.rue = rue;
        this.numero = numero;
        this.postal = postal;
        this.ville = ville;
    }

    public int getAge() {
        return 2021 - annee;
    }

    public int getAgeFromBefore(int before) {
        return before - annee;
    }

    public String getAddress() {
        return numero + " " + rue + " " + postal + " " + ville;
    }

    public String getBorn() {
        return jour + "/" + mois + "/" + annee;
    }

    public String toString() {
        return "La personne (" + prenom + " " + nom + ") est née le " + getBorn() + " et habite au " + getAddress();
    }
}
