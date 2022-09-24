import java.time.LocalDate;

public class Voiture extends Vehicule {

    public Voiture(String immatriculation, LocalDate circulation) {
        super(immatriculation, circulation, circulation, 0);
    }

    public boolean enOrdreControle() {
        if (getControle().getYear() <= LocalDate.now().getYear()-4) return false;
        if (getControle() != getCirculation()) {
            if (getControle().getYear() <= LocalDate.now().getYear()-2) return false;
        }
        return true;
    }
}