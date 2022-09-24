public class TestPanier {

    public static void main(String[] args) throws ProduitNonPresentException, PanierVideException, PanierPleinException {
        Panier panier = new Panier();

        Livre livre1 = new Livre("123", 10, "Michel", 100);
        Livre livre2 = new Livre("123", 114, "Michel", 100);
        CD cd1 = new CD("cd1", 14, "Michel", 12);

        try {
            panier.supprimer(livre1);
        } catch (PanierVideException | ProduitNonPresentException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.supprimer(null);
        } catch (PanierVideException | ProduitNonPresentException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.retrouverProduit("123");
        } catch (IllegalArgumentException | PanierVideException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.retrouverProduit("");
        } catch (IllegalArgumentException | PanierVideException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.ajouter(null);
        } catch (PanierVideException | PanierPleinException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.ajouter(livre1);
        } catch (PanierVideException | PanierPleinException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(panier);
        try {
            panier.retrouverProduit("1234");
        } catch (IllegalArgumentException | PanierVideException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.retrouverProduit("");
        } catch (IllegalArgumentException | PanierVideException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.supprimer(cd1);
        } catch (PanierVideException | ProduitNonPresentException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.ajouter(cd1);
        } catch (PanierVideException | PanierPleinException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            panier.supprimer(livre2);
        } catch (PanierVideException | ProduitNonPresentException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(panier);
        for (int i = 0; i < 9; i++) {
            CD cd = new CD("cd2", 14, "Michel", 12);
            try {
                panier.ajouter(cd);
            } catch (PanierVideException | PanierPleinException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            panier.ajouter(livre1);
        } catch (PanierVideException | PanierPleinException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(panier);
    }
}
