public class BoissonAlcoolisee extends Boisson {

    private double degre;

    public BoissonAlcoolisee(String nom, int contenance, double prix, double degre) {
        super(nom, contenance, prix);
        this.degre = degre;
    }

    public double getDegre() {
        return degre;
    }

    @Override
    public String toString() {
        return "Alcool{" +
                "degre=" + degre +
                '}';
    }
}
