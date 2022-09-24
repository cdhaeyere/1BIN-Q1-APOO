import java.time.LocalDate;

public class Etape {

    private String ville;
    private LocalDate date;

    public Etape(String ville, LocalDate date) {
        this.ville = ville;
        this.date = date;
    }

    public String getVille() {
        return ville;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Etape{" +
                "ville='" + ville + '\'' +
                ", date=" + date +
                '}';
    }
}
