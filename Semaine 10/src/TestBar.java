
public class TestBar {

    public static void main(String[] args) {
        Boisson jus1 = new Boisson("Jus d'oranges pressées",20, 4);
        Boisson jus2 = new Boisson("Jus d'oranges pressées",20, 4);
        Boisson orval = new Biere("Orval",33,4,6.2,false);
        Boisson coktail = new BoissonAlcoolisee("Bloody Mary", 12, 9, 14);

        Carte carte = new Carte();
        System.out.println("ajout de jus1 à la carte : " + carte.ajouter(jus1));
        System.out.println("ajout de jus2 à la carte : " + carte.ajouter(jus2));
        System.out.println("jus2 présent dans la carte : " + carte.contient(jus2));
        System.out.println("Nombre de boissons à la carte : " + carte.nombreDeBoissons());
        System.out.println("Retrait de orval de la carte : " + carte.retirer(orval));
        System.out.println("Nombre de boissons à la carte : " + carte.nombreDeBoissons());
        System.out.println("Ajout de orval à la carte : " + carte.ajouter(orval));
        System.out.println("Ajout de coktail à la carte : " + carte.ajouter(coktail));
        System.out.println("Nombres de boissons à la carte : " + carte.nombreDeBoissons());
        System.out.println("Retrait de jus2 de la carte : " + carte.retirer(jus2));
        System.out.println("jus1 présent dans la carte : " + carte.contient(jus1));
        System.out.println("Nombre de boissons à la carte : " + carte.nombreDeBoissons());
        System.out.println("Ajout de jus2 à la carte : " + carte.ajouter(jus2));
        System.out.println("Modification du prix de jus 1 ");
        jus1.setPrix(4.5);
        System.out.println(carte);
    }

}
