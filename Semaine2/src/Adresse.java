public class Adresse {

    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

    public Adresse(String rue, String numero, String codePostal, String ville) {
        this.rue = rue;
        this.numero = numero;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public String getNumero() {
        return numero;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public String toString() {
        return "Adresse : " + rue + " " + numero + " " + codePostal + " " + ville;
    }
}


