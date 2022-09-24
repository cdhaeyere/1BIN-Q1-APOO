public class TestProjets {

    public static void main(String[] args) {
        Developpeur olivier = null;
        DeveloppeurStagiaire zoe = null; 
        Developpeur loic = null; 

        Projet projet1 = null;

        try {
            olivier = new Developpeur("Olivier", "infra", 3500);
            zoe = new DeveloppeurStagiaire("Zoe", "back-end","IPL");
            loic = new Developpeur("Loic", "full-stack", 3000);
            
            projet1 = new Projet("Site stages");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            projet1.ajouter(olivier);
            projet1.ajouter(zoe);
            projet1.ajouter(loic);

            System.out.println(projet1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            projet1.terminer();
            System.out.println(projet1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
