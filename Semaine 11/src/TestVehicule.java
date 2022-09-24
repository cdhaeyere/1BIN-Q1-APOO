import java.time.LocalDate;

public class TestVehicule {

    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("1-SFV-725", LocalDate.of(2012, 1, 1));
        Voiture voiture2 = new Voiture("1-EWI-611", LocalDate.of(2015, 1, 1));
        Utilitaire utilitaire1 = new Utilitaire("1-ETT-599", LocalDate.of(2015, 1, 1));
        Utilitaire utilitaire2 = new Utilitaire("1-EAX-241", LocalDate.of(2019, 1, 1));

        System.out.println("1. "+voiture1.enOrdreControle());
        System.out.println("2. "+voiture2.enOrdreControle());
        System.out.println("3. "+utilitaire1.enOrdreControle());
        System.out.println("4. "+utilitaire2.enOrdreControle());
        voiture1.setControle(LocalDate.of(2019, 1, 1));
        System.out.println("5. "+voiture1.enOrdreControle());
        utilitaire1.setKilometrage(120000);
        utilitaire2.setKilometrage(120000);
        System.out.println("6. "+utilitaire1.enOrdreControle());
        System.out.println("7. "+utilitaire2.enOrdreControle());
    }

}