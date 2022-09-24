
public class TestCatalogue {
	public static void main(String[] args) {
		Catalogue c = new Catalogue();
		System.out.println("Nombre de livres dans le catalogue : " + c.nombreDeLivres());
		Livre livre1 = new Livre("978-2754055888","Burd","Barry","Java pour les nuls",466,24.95,2014);
		System.out.println("Ajout de livre1 : " + c.ajouter(livre1));
		System.out.println("Livre livre 1 présent dans le catalogue : " + c.contient(livre1));
		Livre livre2 = new Livre("978-2290107096","Martin","George R-R","Le trône de fer l'intégrale",1200,20.95,2015);
		System.out.println("Ajout de livre2 : " + c.ajouter(livre2));
		System.out.println("Nombre de livres dans le catalogue : " + c.nombreDeLivres());
		Livre livre3 = new Livre("978-2754055888","Burd","Barry","Java pour les nuls",466,24.95,2014);
		System.out.println("Ajout de livre3 : " + c.ajouter(livre3));
		System.out.println("Nombre de livres dans le catalogue : " + c.nombreDeLivres());
		System.out.println(c);
		System.out.println("Livre avec l'isbn 978-2290107096 : " + c.chercherLivre("978-2290107096"));
		System.out.println("Retrait du livre3 : " + c.retirer(livre3));
		System.out.println("Nombre de livres dans le catalogue : " + c.nombreDeLivres());
	}
}
