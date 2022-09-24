public class TestMembre {

    public static void main(String[] args) {
        Membre membre1 = new Membre("Leconte", "Emmeline", "027334580");
        membre1.setParrain(membre1);
        System.out.println(membre1);
        Membre membre2 = new Membre("Cambron", "Isabelle" , "027334580");
        membre1.setParrain(membre2);
        System.out.println(membre1);
        Membre membre3 = new Membre("Baroni", "Raphael", "027334580");
        membre1.setParrain(membre3);
        System.out.println(membre1);
    }
}
