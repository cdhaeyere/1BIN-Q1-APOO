public class Rectangle {

    public int longeur;
    public int largeur;

    public Rectangle(int longeur, int largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public int calculerAire() {
        return longeur * largeur;
    }

    public int calculerPerimetre() {
        return 2 * largeur + 2 * longeur;
    }

    public String toString() {
        return "Rectangle de largeur " + largeur + " et de longeur " + longeur;
    }
}
