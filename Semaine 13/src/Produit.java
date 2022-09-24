import java.util.Objects;

public abstract class Produit {

    private String reference;
    private double prix;

    public Produit(String reference, double prix) {
        this.reference = reference;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
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
        if (!(o instanceof Produit)) return false;
        Produit produit = (Produit) o;
        return reference.equals(produit.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }

    public String toString() {
        return "Produit :";
    }
}
