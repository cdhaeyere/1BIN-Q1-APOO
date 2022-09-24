import java.util.ArrayList;

public class Carte {

    private ArrayList<Boisson> boissons;

    public Carte() {
        boissons = new ArrayList<>();
    }

    public ArrayList<Boisson> getBoissons() {
        return boissons;
    }

    public boolean ajouter(Boisson boisson) {
        if (!boissons.contains(boisson)) {
            boissons.add(boisson);
            return true;
        }
        return false;
    }

    public boolean retirer(Boisson boisson) {
        if (boissons.contains(boisson)) {
            boissons.remove(boisson);
            return true;
        }
        return false;
    }

    public boolean contient(Boisson boisson) {
        return boissons.contains(boisson);
    }

    public int nombreDeBoissons() {
        return boissons.size();
    }

    @Override
    public String toString() {
        return "Carte{" +
                "boissons=" + boissons +
                '}';
    }
}