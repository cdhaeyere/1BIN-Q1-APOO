import java.util.ArrayList;
import java.util.Iterator;

public class ListeSolides implements Iterable<Solide> {

    private ArrayList<Solide> solides;

    public ListeSolides() {
        solides = new ArrayList<>();
    }

    public boolean estVide() {
        return solides.isEmpty();
    }

    public int nombreDeSolides() {
        return solides.size();
    }

    public boolean ajouter(Solide solide) {
        if (!solides.contains(solide)) {
            solides.add(solide);
            return true;
        }
        return false;
    }

    public boolean supprimer(Solide solide) {
        if (solides.contains(solide)) {
            solides.remove(solide);
            return true;
        }
        return false;
    }

    public boolean contient(Solide solide) {
        return solides.contains(solide);
    }

    public ArrayList<Solide> trouverPlusGrand() {
        ArrayList<Solide> solides1 = new ArrayList<>();
        double volume = 0;
        for (Solide sol : solides) {
            if (volume < sol.calculerVolume()) {
                volume = sol.calculerVolume();
                solides1.clear();
                solides1.add(sol);
            } else {
                solides.add(sol);
            }
        }
        return solides;
    }

    public String toString() {
        return solides.toString();
    }

    @Override
    public Iterator<Solide> iterator() {
        return solides.iterator();
    }
}
