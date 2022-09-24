public class Cercle {

    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculerAire() {
        return rayon * rayon * Math.PI;
    }

    public String toString() {
        return "Cercle de rayon " + rayon;
    }
}