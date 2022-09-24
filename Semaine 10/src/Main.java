import java.util.ArrayList;
import java.util.List;

public class Main {

    private String nom;
    private List<CarteJeu> cartes = new ArrayList<>();

    public Main(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public List<CarteJeu> getCartes() {
        return cartes;
    }

    public void piocher() throws TropDeCartesException {
        if (cartes.size() == 10) {
            throw new TropDeCartesException();
        } else {
            cartes.add(new CarteJeu(1));
        }
    }

    public void jouer(CarteJeu carte) {
        if (cartes.contains(carte)) cartes.remove(carte);
    }
}
