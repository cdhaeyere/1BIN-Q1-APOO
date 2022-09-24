public class Date {

    private int année;
    private int mois;
    private int jour;

    public Date(int année, int mois, int jour) {
        this.année = année;
        this.mois = mois;
        this.jour = jour;
    }

    public int getAnnée() {
        return année;
    }

    public int getMois() {
        return mois;
    }

    public int getJour() {
        return jour;
    }

    public String toString() {
        return jour + "/" + mois + "/" + année;
    }
}
