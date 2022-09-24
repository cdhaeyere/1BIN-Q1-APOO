/*
    @Author : Corentin D'haeyere
 */
public class Compte {

    private Personne titulaire;
    private Date dateValidite;
    private String numero;
    private Date dateOuverture;
    private double solde;

    public Compte(Personne titulaire, Date dateValidite, String numero, Date dateOuverture, double solde) {
        this.titulaire = titulaire;
        this.dateValidite = dateValidite;
        this.numero = numero;
        this.dateOuverture = dateOuverture;
        this.solde = solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public Date getDateValidite() {
        return dateValidite;
    }

    public void setDateValidite(Date dateValidite) {
        this.dateValidite = dateValidite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double ajouter(double montant) {
        solde = solde + montant;
        return solde;
    }

    public boolean retirer(double montant) {
        if (solde > montant) {
            System.out.println("Le transfert a été réalisé");
            solde = solde - montant;
            return true;
        } else {
            System.out.println("Le transfert est impossible");
            return false;
        }
    }

    public boolean transferer(Compte compte1, Compte compte2, double montant) {
        if (montant <= compte1.getSolde()) {
            compte1.retirer(montant);
            compte2.ajouter(montant);
            return true;
        } else {
            System.out.println("Le transfert a échoué");
            return false;
        }
    }

    public String toString() {
        return "Le compte de " + titulaire.getNom() + " " + titulaire.getPrenom() + " a été ouvert le " + dateOuverture + " et est valide jusqu'au " + dateValidite + " avec un solde de " + solde;
    }
}
