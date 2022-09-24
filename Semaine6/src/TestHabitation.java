public class TestHabitation {

    public static void main(String[] args) {
        Date date = new Date(2003, 1,1);
        Adresse adresse = new Adresse("Avenue de Broqueville", "96/1", "1200", "Bruxelles");
        Personne proprietaire = new Personne("Michel", "Jean", date, adresse);
        Habitation habitation = new Habitation(proprietaire, adresse, 100, 1991, 100);
    }
}
