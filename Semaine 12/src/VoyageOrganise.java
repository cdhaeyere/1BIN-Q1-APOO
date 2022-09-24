import java.time.LocalDate;
import java.util.ArrayList;

public abstract class VoyageOrganise extends FormuleVoyage {

    private double prix;
    private String nom;
    private ArrayList<Etape> etapes;

    public VoyageOrganise(LocalDate dateDepart, int duree, double prix, String nom) {
        super(dateDepart, duree);
        this.prix = prix;
        this.nom = nom;
        etapes = new ArrayList<>();
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Etape> getEtapes() {
        return etapes;
    }

    @Override
    public double calculerPrix() {
        return prix ;
    }

    @Override
    public String toString() {
        return "VoyageOrganise{" +
                "prix=" + prix +
                ", nom='" + nom + '\'' +
                ", etapes=" + etapes.toString() +
                '}';
    }
}
