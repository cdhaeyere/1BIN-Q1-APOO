public class TestEtudiantSerie {

	public static void main(String[] args) {
		Serie serie1 = new Serie('1');
		Serie serie2 = new Serie('2');
			
		Etudiant cap = new Etudiant ("19890902-112","Capelle","Alain",serie1);
		Etudiant lep = new Etudiant ("19900623-243","Lepage","David",serie1);
		Etudiant ton = new Etudiant ("19911114-121","Tonneau","Jeremy",serie1);
		Etudiant mim = new Etudiant ("19900101-139","Mimoun","Brahim",serie1);
			
		System.out.println(cap);
		System.out.println(lep);
		System.out.println(ton);
		System.out.println(mim);
		System.out.println(serie1);

		System.out.println("\nElection 1_____________________________");
		serie1.elireDelegue(cap);
		System.out.println(serie1);
			
		System.out.println("\nElection 2_____________________________");
		serie2.elireDelegue(ton);
		System.out.println(serie2);
			
		System.out.println("\nElection 3_____________________________");
		serie1.elireDelegue(ton);
		System.out.println(serie1);
			
		System.out.println("\nChangement série 1________________________");
		mim.changerSerie(serie2);
		System.out.println(mim);
			
		System.out.println("\nChangement série 2________________________");
		cap.changerSerie(serie2);
		System.out.println(cap);
     }
}
