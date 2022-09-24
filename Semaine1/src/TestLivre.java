public class TestLivre {

    public static void main(String[] args) {
        Livre livre1 = new Livre(1, "Livre1", "Jeanine", "Jean", 14.00, 1991, 405);
        Livre livre2 = new Livre(2, "Livre2", "Jacques", "Pierre", 15.00, 1992, 500);

        System.out.println("Le livre (" + livre1.titre + " écrit en " + livre1.annee + ") a été écrit par " + livre1.prenomAuteur + " " + livre1.nomAuteur);
        System.out.println(livre2);
    }
}
