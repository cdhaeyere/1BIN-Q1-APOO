import java.util.ArrayList;

public class Catalogue {

    private ArrayList<Livre> livres;

    public Catalogue() {
        this.livres = new ArrayList<>();
    }

    public boolean contient(Livre livre) {
        return livres.contains(livre);
    }

    public boolean ajouter(Livre livre) {
        if (livres.contains(livre)) {
            return false;
        } else {
            livres.add(livre);
            return true;
        }
    }

    public boolean retirer(Livre livre) {
        if (livres.contains(livre)) {
            livres.remove(livre);
            return true;
        } else {
            return false;
        }
    }

    public int nombreDeLivres() {
        return livres.size();
    }

    public boolean estVide() {
        return livres.isEmpty();
    }

    public Livre chercherLivre(String isbn) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn)) {
                return livre;
            }
        }
        return null;
    }
}
