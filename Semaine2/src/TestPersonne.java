public class TestPersonne {

    public static void main(String[] args) {
        Adresse adresse = new Adresse("Rue de la gare", "34", "5000", "Namur");
        Date date = new Date(1, 2, 3);
        Personne personne1 = new Personne("Schmidt", "Paul", date, adresse);
        Personne personne2 = new Personne("Gobert", "Valérie", date, adresse);

        System.out.println(personne1.toString());
        System.out.println(personne2.toString());
    }
}
