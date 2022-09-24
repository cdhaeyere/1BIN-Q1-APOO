public class CarteJeu {

    private int cout;

    public CarteJeu(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    public String fournirDetail() {
        return "cout :" + cout;
    }
}
