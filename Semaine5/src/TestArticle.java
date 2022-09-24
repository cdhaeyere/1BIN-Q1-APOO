public class TestArticle {
	public static void main(String[] args) {
		Article article1 = null, article2 = null;
		try {
			article1 = new Article(
					"Lad700",
					"lapierre tecnic 700 lady",
					"Géométrie adaptée, composants et design spécifiques ont guidé la conception de notre gamme de VTT femme",
					899);
			System.out.println(article1);
			System.out.println("prix tvac : "
					+ article1.calculerPrixTVAComprise());
			System.out.println("prix tvac et 20% de réduction : "
					+ article1.calculerPrixTVAComprise(20));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		try {
			article2 = new Article("TandFit",
					"lapierre tandem route 2 race fit ",
					"le vélo tandem, ludique, convivial et performant", 1785,
					23);
			System.out.println(article2);
			System.out.println("prix tvac : "
					+ article2.calculerPrixTVAComprise());
			System.out.println("prix tvac et 30% de réduction : "
					+ article2.calculerPrixTVAComprise(30));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
