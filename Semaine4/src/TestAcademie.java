/*
    @Author : Corentin D'haeyere
 */
public class TestAcademie {

    public static void main(String[] args) {
        Professeur professeur1 = new Professeur("1965-12-23-132", "Marchant", "Gilles", "Chant");
        Professeur professeur2 = new Professeur("1971-02-04-125", "De Coster", "Anne", "Piano");
        System.out.println("Affichage des professeurs");
        System.out.println("Professeur 1 \n" + professeur1);
        System.out.println("Professeur 2 \n" + professeur2);
        System.out.println("----------------------------------------------------------------------------------");
        Cours cours1 = new Cours("Chant individuel", "3F", professeur1);
        Cours cours2 = new Cours("chant chorale", "1Q", professeur1);
        Cours cours3 = new Cours("Piano", "3Q", professeur2);
        Eleve eleve1 = new Eleve("Durand", "Jean", cours1, cours2);
        Eleve eleve2 = new Eleve("Ponant","Sébastien",cours2,cours1);
        System.out.println("Affichage des cours");
        System.out.println("Cours 1 \n" + cours1 );
        System.out.println("Cours 2 \n" + cours2 );
        System.out.println("Cours 3 \n" + cours3 );
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Affichage des élèves");
        System.out.println("Eleve 1 \n" + eleve1);
        System.out.println("Eleve 2 \n" + eleve2);
        System.out.println("----------------------------------------------------------------------------------");
        eleve2.setCoursComplementaire(cours3);
        System.out.println("Affichage des cours après changement");
        System.out.println("Cours 1 \n" + cours1);
        System.out.println("Cours 2 \n" + cours2);
        System.out.println("Cours 3 \n" + cours3);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Affichage des élèves");
        System.out.println("Eleve 1 \n" + eleve1);
        System.out.println("Eleve 2 \n" + eleve2);
    }
}
