import java.time.LocalDate;

public class TestVoyage {

    public static void main(String[] args) {
        Circuit circuit = new Circuit(LocalDate.of(1999, 12, 12), 10, 140, "Michel", "Test");
        Croisiere croisiere = new Croisiere(LocalDate.of(1999, 12, 12), 10, 140, "Test", "Test", 1);

        System.out.println(circuit);
        System.out.println(circuit.calculerPrix());
        System.out.println(croisiere);
        System.out.println(croisiere.calculerPrix());
    }
}