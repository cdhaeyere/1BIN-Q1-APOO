public class Livre {

    public int isbn;
    public String titre;
    public String nomAuteur;
    public String prenomAuteur;
    public double prix;
    public int annee;
    public int pages;

    public Livre(int isbn, String titre, String nomAuteur, String prenomAuteur, double prix, int annee, int pages) {
        this.isbn = isbn;
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.prix = prix;
        this.annee = annee;
        this.pages = pages;
    }

    public String toString() {
        return "Le livre a pour titre " + titre + ", comme isbn " + isbn + ", comme auteur " + nomAuteur + " " + prenomAuteur + ", comme prix " + prix + ", comme nombre de pages " + pages + ", comme année de parution " + annee;
    }
}
