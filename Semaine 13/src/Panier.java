import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit> {

    private ArrayList<Produit> produits;

    public Panier() {
        produits = new ArrayList<>();
    }

    public boolean ajouter(Produit produit) throws PanierVideException, PanierPleinException {
        if (produit == null) throw new IllegalArgumentException();
        if (produits.size() == 10) throw new PanierPleinException();
        produits.add(produit);
        return true;
    }

    public boolean supprimer(Produit produit) throws PanierVideException, ProduitNonPresentException {
        if (produit == null) throw new IllegalArgumentException();
        if (produits.isEmpty()) throw new PanierVideException();
        if (produits.contains(produit)) {
            throw new ProduitNonPresentException();
        }
        produits.remove(produit);
        return true;
    }

    public int nombreDeProduits() {
        return produits.size();
    }

    public double calculerPrixTotal() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }

    @Override
    public String toString() {
        return produits.toString();
    }

    @Override
    public Iterator<Produit> iterator() {
        return produits.iterator();
    }

    public Produit retrouverProduit(String reference) throws PanierVideException {
        if (reference.equals("")) throw new IllegalArgumentException();
        if (produits.isEmpty()) throw new PanierVideException();
        for (Produit produit : produits) {
            if (produit.getReference().equals(reference)) {
                return produit;
            }
        }
        return null;
    }
}
