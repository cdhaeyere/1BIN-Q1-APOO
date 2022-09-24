import java.time.LocalDate;
import java.util.ArrayList;

public class Circuit extends VoyageOrganise {

    private String description;

    public Circuit(LocalDate dateDepart, int duree, double prix, String nom, String description) {
        super(dateDepart, duree, prix, nom);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "description='" + description + '\'' +
                '}';
    }
}
