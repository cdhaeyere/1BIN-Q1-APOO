import java.time.LocalDateTime;

public class Vol {

    private LocalDateTime dateHeure;
    private double prix;
    private String numero;
    private String aeroportDepart;
    private String aeroportArrivee;

    public Vol(LocalDateTime dateHeure, double prix, String numero, String aeroportDepart, String aeroportArrivee) {
        this.dateHeure = dateHeure;
        this.prix = prix;
        this.numero = numero;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public double getPrix() {
        return prix;
    }

    public String getNumero() {
        return numero;
    }

    public String getAeroportDepart() {
        return aeroportDepart;
    }

    public String getAeroportArrivee() {
        return aeroportArrivee;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "dateHeure=" + dateHeure +
                ", prix=" + prix +
                ", numero='" + numero + '\'' +
                ", aeroportDepart='" + aeroportDepart + '\'' +
                ", aeroportArrivee='" + aeroportArrivee + '\'' +
                '}';
    }
}
