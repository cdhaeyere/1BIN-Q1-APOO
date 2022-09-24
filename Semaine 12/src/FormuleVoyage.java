import java.time.LocalDate;

public abstract class FormuleVoyage {

    private LocalDate dateDepart;
    private int duree;

    public FormuleVoyage(LocalDate dateDepart, int duree) {
        this.dateDepart = dateDepart;
        this.duree = duree;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public int getDuree() {
        return duree;
    }

    public abstract double calculerPrix();

    @Override
    public String toString() {
        return "FormuleVoyage{" +
                "dateDepart=" + dateDepart +
                ", duree=" + duree +
                '}';
    }
}
