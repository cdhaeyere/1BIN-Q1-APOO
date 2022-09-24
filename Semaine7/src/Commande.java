import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Commande {
	private final ArrayList<LigneDeCommande> articles;
	private final LocalDate date;
	
	public Commande(){
		date = LocalDate.now();
		articles = new ArrayList<>();
	}

	public void ajouter(LigneDeCommande ligneDeCommande) {
		if (ligneDeCommande == null) throw new IllegalArgumentException("L'article ne peut pas être null");
		articles.add(ligneDeCommande);
	}

	public void retirer(LigneDeCommande ligneDeCommande) {
		if (ligneDeCommande == null) throw new IllegalArgumentException("L'article ne peut pas être null");
		articles.remove(ligneDeCommande);
	}

	public void modifierQuantité(int quantité, LigneDeCommande ligneDeCommande) {
		if (ligneDeCommande == null) throw new IllegalArgumentException("L'article ne peut pas être null");
		ligneDeCommande.setQuantité(quantité);
	}

	public boolean dejaCommander(LigneDeCommande ligneDeCommande) {
		if (ligneDeCommande == null) throw new IllegalArgumentException("L'article ne peut pas être null");
		return articles.contains(ligneDeCommande);
	}

	public int quantite(LigneDeCommande ligneDeCommande) {
		if (ligneDeCommande == null) throw new IllegalArgumentException("L'article ne peut pas être null");
		return ligneDeCommande.getQuantité();
	}

	public ArrayList<LigneDeCommande> getArticles() {
		return articles;
	}

	public double calculerPrixTotal() {
		double prixTotal = 0;
		for (LigneDeCommande article : articles) {
			prixTotal += article.prixTotal();
		}
		return prixTotal;
	}
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String resultat = date.format(formatter)+" \n";
		StringBuilder sb = new StringBuilder();
		double prixTotal = 0;
		for (LigneDeCommande article : articles) {
			sb.append(article);
			sb.append("\n");
			prixTotal += article.prixTotal();
		}
		sb.append(prixTotal);
		resultat += sb.toString();
		return resultat;
	}
}
