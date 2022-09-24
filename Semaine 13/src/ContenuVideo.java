import java.util.Objects;

public abstract class ContenuVideo {

    private int id;
    private String titre;
    private String categorie;
    private static int idSuivant = 1;
    private final static String[] CATEGORIES_POSSIBLES = {"action", "science-fiction", "drame", "comedie", "horreur", "thriller", "documentaire", "animation"};

    public ContenuVideo(String titre, String categorie) {
        this.id = idSuivant;
        idSuivant++;
        if (titre.equals("")) throw new IllegalArgumentException();
        this.titre = titre;
        if (!categorieExiste(categorie)) throw new IllegalArgumentException("Catégorie inexistante");
        this.categorie = categorie;
    }

    private boolean categorieExiste(String categorie) {
        for (String categoriesPossible : CATEGORIES_POSSIBLES) {
            if (categoriesPossible.equals(categorie)) return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        if (titre.equals("")) throw new IllegalArgumentException();
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        if (categorie.equals("")) throw new IllegalArgumentException();
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContenuVideo)) return false;
        ContenuVideo that = (ContenuVideo) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
