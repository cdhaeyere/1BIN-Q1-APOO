import java.time.LocalDate;

public abstract class Vehicule {

    private String immatriculation;
    private LocalDate circulation;
    private LocalDate controle;
    private double kilometrage;

    public Vehicule(String immatriculation, LocalDate circulation, LocalDate controle, double kilometrage) {
        this.immatriculation = immatriculation;
        this.circulation = circulation;
        this.controle = controle;
        this.kilometrage = kilometrage;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public LocalDate getCirculation() {
        return circulation;
    }

    public LocalDate getControle() {
        return controle;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public void setControle(LocalDate controle) {
        this.controle = controle;
    }

    public abstract boolean enOrdreControle();
}