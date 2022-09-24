import java.util.Objects;

public class Boisson {

    private String nom;
    private int contenance;
    private double prix;

    public Boisson(String nom, int contenance, double prix) {
        this.nom = nom;
        this.contenance = contenance;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getContenance() {
        return contenance;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boisson boisson = (Boisson) o;
        return contenance == boisson.contenance && Objects.equals(nom, boisson.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, contenance);
    }

    @Override
    public String toString() {
        return "Boisson{" +
                "nom='" + nom + '\'' +
                ", contenance=" + contenance +
                ", prix=" + prix +
                '}';
    }
}
