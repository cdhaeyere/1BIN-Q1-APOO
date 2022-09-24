import java.util.ArrayList;
import java.util.Iterator;

public class Projet implements Iterable<Developpeur> {

    private int numero;
    private String nom;
    private boolean termine;
    private ArrayList<Developpeur> developpeurs;
    private static int nombreDeProjets = 1;

    public Projet(String nom) {
        this.numero = 1;
        this.nom = nom;
        this.termine = false;
        developpeurs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public boolean isTermine() {
        return termine;
    }

    public int getNumero() {
        return numero;
    }

    public boolean ajouter(Developpeur developpeur) {
        if (developpeurs.contains(developpeur) || termine) {
            return false;
        }
        developpeurs.add(developpeur);
        developpeur.signalerNouveauProjet();
        return true;
    }

    public boolean retirer(Developpeur developpeur) {
        if (developpeurs.contains(developpeur) && !termine) {
            developpeurs.remove(developpeur);
            developpeur.signalerFinDuProjet();
            return true;
        }
        return false;
    }

    public boolean terminer() {
        if (!termine) {
            termine = true;
            for (Developpeur developpeur: developpeurs) {
                developpeur.signalerFinDuProjet();
            }
            developpeurs.clear();
            return true;
        }
        return false;
    }

    @Override
    public Iterator<Developpeur> iterator() {
        return developpeurs.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Projet " + numero + " : " + nom + "\n Developpeur(s) sur le projet : \n");
        if (!developpeurs.isEmpty()) {
            for (Developpeur developpeur: developpeurs) {
                sb.append(developpeur.toString() + "\n");
            }
        }
        return sb.toString();
    }
}
