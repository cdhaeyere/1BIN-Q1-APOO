public class Livre extends Produit {

    private String auteur;
    private int nombreDePages;

    public Livre(String reference, double prix, String auteur, int nombreDePages) {
        super(reference, prix);
        if (auteur.equals("")) throw new IllegalArgumentException();
        this.auteur = auteur;
        if (nombreDePages == 0) throw new IllegalArgumentException();
        this.nombreDePages = nombreDePages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", nombreDePages=" + nombreDePages +
                '}';
    }
}
