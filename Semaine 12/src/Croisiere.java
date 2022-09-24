import java.time.LocalDate;
import java.util.ArrayList;

public class Croisiere extends VoyageOrganise {

    private String nomBateau;
    private int nombreCabines;
    private ArrayList<Activite> activites;

    public Croisiere(LocalDate dateDepart, int duree, double prix, String nom, String nomBateau, int nombreCabines) {
        super(dateDepart, duree, prix, nom);
        this.nomBateau = nomBateau;
        this.nombreCabines = nombreCabines;
        activites = new ArrayList<>();
    }

    public String getNomBateau() {
        return nomBateau;
    }

    public int getNombreCabines() {
        return nombreCabines;
    }

    public ArrayList<Activite> getActivites() {
        return activites;
    }

    @Override
    public String toString() {
        return "Croisiere{" +
                "nomBateau='" + nomBateau + '\'' +
                ", nombreCabines=" + nombreCabines +
                ", activites=" + activites +
                '}';
    }
}
