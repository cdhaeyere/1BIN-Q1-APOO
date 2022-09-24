public class TestBoisson {
    public static void main(String[] args) {

        Vin.getCOULEURS().add("blanc");
        Vin.getCOULEURS().add("rouge");
        Vin.getCOULEURS().add("rosé ");

        Boisson jus1 = new Boisson("Jus d'oranges pressées",20, 4);
        System.out.println("Exemple d'affichaqe d'une boisson :");
        System.out.println(jus1);
        Boisson coktail = new BoissonAlcoolisee("Bloody Mary", 12, 9, 14);
        System.out.println("Exemple d'affichage d'une boisson alcoolisée : ");
        System.out.println(coktail);
        System.out.println("Exemple d'affichage des bières : ");
        Boisson orval = new Biere("Orval",33,4,6.2,false);
        System.out.println(orval);
        Boisson jupiler = new Biere("Jupiler",33,2.5,5.2,true);
        System.out.println(jupiler);
        System.out.println("Exemple d'affichage d'un vin :");
        Boisson chablis = new Vin("Chablis premier cru 2017",15,6.5,13.5,"chardonnay","blanc","Bourgogne","France");
        System.out.println(chablis);
        System.out.println("Test de l'exception en cas de couleur null : ");
        try {
            new Vin("Château-Chalon 2013",15,10,14,"savagnin",null,"Jura","France");
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        System.out.println("Test de l'exception en cas de couleur invalide non null : ");
        try {
            new Vin("Château-Chalon 2013",15,10,14,"savagnin","jaune","Jura","France");
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Test de l'égalité de deux boissons : ");
        Boisson jus2 = new Boisson("Jus d'oranges pressées",20, 5);
        System.out.println("jus1.equals(jus2) : " + jus1.equals(jus2));
        Boisson jus3 = new Boisson("Jus d'oranges pressées",15, 3);
        System.out.println("jus1.equals(jus3) : " + jus1.equals(jus3));
        Boisson jus4 = new Boisson("Jus d'oranges",20, 3);
        System.out.println("jus1.equals(jus3) : " + jus1.equals(jus4));
    }
}
