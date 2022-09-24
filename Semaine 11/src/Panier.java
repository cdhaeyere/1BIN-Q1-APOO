import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit> {

    private ArrayList<Produit> produits;

    public Panier() {
        produits = new ArrayList<>();
    }

    public boolean ajouter(Produit produit) {
        if (!produits.contains(produit)) {
            produits.add(produit);
            return true;
        }
        return false;
    }

    public boolean supprimer(Produit produit) {
        if (produits.contains(produit)) {
            produits.remove(produit);
            return true;
        }
        return false;
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
        return "Panier{" +
                "produits=" + produits +
                '}';
    }

    @Override
    public Iterator<Produit> iterator() {
        return produits.iterator();
    }

    public Produit retrouverProduit(String reference) {
        for (Produit produit : produits) {
            if (produit.getReference().equals(reference)) {
                return produit;
            }
        }
        return null;
    }
}
