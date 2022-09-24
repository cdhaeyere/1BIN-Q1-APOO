/*
    @Author : Corentin D'haeyere
 */
public class Date {

    private int annee;
    private int mois;
    private int jour;

    public Date(int annee, int mois, int jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }

    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    public int getJour() {
        return jour;
    }

    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }
}
