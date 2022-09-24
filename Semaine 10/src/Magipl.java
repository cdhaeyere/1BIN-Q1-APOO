public class Magipl {

    public static void main(String[] args) {
        Main main = new Main("test");

        Terrain terrain = new Terrain(0, 'b');
        Creature creature = new Creature(6, "Golem(4/6)");
        Sortilege sortilege = new Sortilege(1, "Croissance gigantesque", "");

        main.getCartes().add(terrain);
        main.getCartes().add(creature);
        main.getCartes().add(sortilege);

        for (CarteJeu carteJeu : main.getCartes()) {
            System.out.println(carteJeu.fournirDetail());
        }

        System.out.println();
        main.jouer(sortilege);
        System.out.println("Carte jouée " + sortilege.fournirDetail());
        System.out.println();
        
        for (CarteJeu carteJeu : main.getCartes()) {
            System.out.println(carteJeu.fournirDetail());
        }
    }
}
