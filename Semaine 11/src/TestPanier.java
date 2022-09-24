public class TestPanier {

    public static void main(String[] args) {
        Panier panier = new Panier();

        Livre livre1 = new Livre("Livre1", 14.99, "Me", 100);
        Livre livre2 = new Livre("Livre2", 15.66, "Me", 200);
        DVD dvd = new DVD("DVD1", 6.99, "Me");

        panier.ajouter(livre1);
        panier.ajouter(livre2);
        panier.ajouter(dvd);

        System.out.println(panier);
        System.out.println(panier.calculerPrixTotal());
        System.out.println(panier.nombreDeProduits());
    }
}
