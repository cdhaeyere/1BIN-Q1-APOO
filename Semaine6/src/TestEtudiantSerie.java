public class TestEtudiantSerie {

	public static void main(String[] args) {

		Serie serie1 = new Serie('1');
		Serie serie2 = new Serie('2');

		Etudiant cap = new Etudiant("19890902-112", "Capelle", "Alain", serie1);
		Etudiant lep = new Etudiant("19900623-243", "Lepage", "David", serie1);
		Etudiant ton = new Etudiant("19911114-121", "Tonneau", "Jeremy", serie1);
		Etudiant mim = new Etudiant("19900101-139", "Mimoun", "Brahim", serie1);

		System.out.println(cap);
		System.out.println(lep);
		System.out.println(ton);
		System.out.println(mim);
		System.out.println(serie1);

		System.out.println("\nElection 1_____________________________");
		try {
			serie1.elireDelegue(cap);
		} catch (IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println(serie1);
			
		System.out.println("\nElection 2_____________________________");
		try {
			serie2.elireDelegue(ton);
		} catch (IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println(serie2);
			
		System.out.println("\nElection 3_____________________________");
		try {
			serie1.elireDelegue(ton);
		} catch (IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println(serie1);
			
		System.out.println("\nChangement série 1________________________");
		try {
			mim.changerSerie(serie2);
		} catch (IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println(mim);
			
		System.out.println("\nChangement série 2________________________");try {
			cap.changerSerie(serie2);
		} catch (IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println(cap);
     }
}
