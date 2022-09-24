/*
    @Author : Corentin D'haeyere
 */
public class Adresse {

    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

    public Adresse(String rue, String numero, String codePostal, String ville) {
        if (rue == null) throw new IllegalArgumentException("Une rue valide est requise");
        this.rue = rue;
        if (numero == null) throw new IllegalArgumentException("Un numero valide est requis");
        this.numero = numero;
        if (codePostal == null) throw new IllegalArgumentException("Un code postal valide est requis");
        this.codePostal = codePostal;
        if (ville == null) throw new IllegalArgumentException("Une ville valide est requise");
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
