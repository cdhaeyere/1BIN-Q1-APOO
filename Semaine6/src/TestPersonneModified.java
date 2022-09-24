public class TestPersonneModified {

    public static void main(String[] args) {
        Adresse adresse = new Adresse("Grand Rue", "142", "7000", "Mons");
        PersonneModified and = new PersonneModified("Bonte", "Andre", "12.11.03-001.07", adresse, 'M');
        PersonneModified mar = new PersonneModified("Leclerq", "Marie", "47.09.11-002.23", adresse, 'F');
        PersonneModified alb = new PersonneModified(and,"Bonte", "Albert", "44.06.06-001.90", 'M', adresse);
        PersonneModified phi = new PersonneModified(mar,"Bonte", "Philippe", "01.10.25-004.16", 'M', adresse);
        PersonneModified jul = new PersonneModified("Maes", "Julie", "73.01.20-002.65", adresse, 'F');
        PersonneModified eli = new PersonneModified(phi, jul, "Elizabeth", "Bonte", "01.10.25-004.16", 'F', adresse);

        System.out.println("Liste des personnes creees : ");
        System.out.println(and);
        System.out.println("-----------------------------");
        System.out.println(mar);
        System.out.println("-----------------------------");
        System.out.println(alb);
        System.out.println("-----------------------------");
        System.out.println(phi);
        System.out.println("-----------------------------");
        System.out.println(jul);
        System.out.println("-----------------------------");
        System.out.println(eli);
        System.out.println("-----------------------------");
        System.out.println(eli.isDescendantOf(mar));
        System.out.println("-----------------------------");
    }
}
