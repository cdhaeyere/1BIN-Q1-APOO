public class TestPersonne {

    public static void main(String[] args) {
        Personne personne1 = new Personne("D'haeyere", "Corentin", 5, 9, 2003, "Avenue de Broqueville", 96, 1200, "Bruxelles");
        Personne personne2 = new Personne("Goffin", "Alexis", 10, 10, 2003, "Rue Prince Prince Héritier", 12, 1200, "Bruxelles");
        Personne personne3 = new Personne("D'haeyere", "Gaelle", 21, 10, 2006, "Avenue de Broqueville", 96, 1200, "Bruxelles");

        System.out.println(personne1);
        System.out.println(personne2);
        System.out.println(personne3);
        System.out.println(personne1.getAgeFromBefore(2025));
        System.out.println(personne2.getAgeFromBefore(2025));
        System.out.println(personne3.getAgeFromBefore(2025));
    }
}
