public class LigneDeCommande {

    private Article article;
    private int quantité;

    public LigneDeCommande(Article article) {
        if (article == null) throw new IllegalArgumentException("L'artcile ne peut pas être null");
        this.article = article;
        this.quantité = 1;
    }

    public LigneDeCommande(Article article, int quantité) {
        this(article);
        if (quantité <= 0) throw new IllegalArgumentException("La quantité ne peut etre inférieure ou égale à 0");
        this.quantité = quantité;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        if (quantité <= 0) throw new IllegalArgumentException("La quantité doit être inférieur ou égale à 0");
        this.quantité = quantité;
    }

    public double prixTotal() {
        return article.calculerPrixTVAComprise() * quantité;
    }

    public String toString() {
        return quantité + "x" + article;
    }
}
