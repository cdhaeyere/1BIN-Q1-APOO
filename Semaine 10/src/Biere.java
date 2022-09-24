public class Biere extends BoissonAlcoolisee {

    private boolean pression;

    public Biere(String nom, int contenance, double prix, double degre, boolean pression) {
        super(nom, contenance, prix, degre);
        this.pression = pression;
    }

    public boolean isPression() {
        return pression;
    }

    @Override
    public String toString() {
        return "Biere{" +
                "pression=" + pression +
                '}';
    }
}
