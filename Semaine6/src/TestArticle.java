public class TestArticle {

    public static void main(String[] args) {
        try {
            Article article1 = new Article(null, null, "article", -1, 101);
            article1.calculerPrixTVAComprise(101);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
