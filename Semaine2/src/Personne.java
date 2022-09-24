public class Personne {

    private String nom;
    private String prenom;
    private Date date;
    private Adresse adresse;

    public Personne(String nom, String prenom, Date date, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.adresse = adresse;
    }

    public int getAge() {
        return 2021 - date.getAnnee();
    }

    public int getAgeFromBefore(int before) {
        return before - date.getAnnee();
    }

    public Adresse fournirDomicile() {
        return adresse;
    }

    public Date getBorn() {
        return date;
    }

    public void demenager(Adresse adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return "La personne (" + prenom + " " + nom + ") est née le " + getBorn() + " et habite au " + adresse.toString()   ;
    }
}
