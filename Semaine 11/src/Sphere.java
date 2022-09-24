import java.util.Objects;

public class Sphere implements Solide {
    private double rayon;

    public Sphere(double rayon){
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double calculerVolume() {
        return 0;
    }

    @Override
    public double calculerSurface() {
        return 0;
    }

    public String toString() {
        return "Sphere, rayon : " + rayon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.rayon, rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }
}
