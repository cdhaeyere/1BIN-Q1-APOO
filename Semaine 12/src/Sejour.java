import java.time.LocalDate;

public class Sejour extends FormuleSimple{

    private String nomHotel;
    private int etoiles;
    private double prix;

    public Sejour(LocalDate dateDepart, int duree, Vol volAller, Vol volRetour, String nomHotel, int etoiles, double prix) {
        super(dateDepart, duree, volAller, volRetour);
        this.nomHotel = nomHotel;
        this.etoiles = etoiles;
        this.prix = prix;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public int getEtoiles() {
        return etoiles;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Sejour, Hotel : " + nomHotel + ", etoiles : " + etoiles + ", prix : " + prix;
    }
}
