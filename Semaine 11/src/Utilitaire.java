import java.time.LocalDate;

public class Utilitaire extends Vehicule {

    private double maximum;

    public Utilitaire(String immatriculation, LocalDate circulation) {
        super(immatriculation, circulation, circulation, 0);
        this.maximum = 50000;
    }

    public Utilitaire(String immatriculation, LocalDate circulation, double maximum) {
        super(immatriculation, circulation, circulation, 0);
        this.maximum = maximum;
    }

    public boolean enOrdreControle() {
        if (this.getKilometrage() > maximum) return false;
        return true;
    }
}