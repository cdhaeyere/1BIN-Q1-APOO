/*
    @Author : Corentin D'haeyere
 */
public class TestCompte {

    public static void main(String[] args) {
        Adresse adresse = new Adresse("Avenue de Broqueville", "96", "1200", "Bruxelles");
        Date dateNaissance = new Date(2002, 5, 9);
        Personne titulaire = new Personne("Alexis", "Lecomte", dateNaissance, adresse);
        Date dateValidité = new Date(2022, 12, 12);
        Date dateOuverture = new Date(2003, 12, 12);
        Compte compte = new Compte(titulaire, dateValidité, "000-000000089-89", dateOuverture, 1200);

        System.out.println(compte);
        compte.ajouter(100);
        System.out.println(compte);
    }
}
