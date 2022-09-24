
public class Membre {
	//Ajoutez un attribut pour garder le nom du membre.
    private String nom;
	//Ajoutez un attribut pour garder le prénom du membre.
    private String prenom;
	//Ajoutez un attribut pour garder le numéro de téléphone du membre.
    private String numero;
	//Ajoutez un attribut pour garder, s'il y en a un, le membre qui a parrainé le membre courant.
	private Membre parrain;

	
	//Ajoutez un constructeur initialisant le nom, le prénom et le numéro de téléphone du membre. 
    public Membre(String nom, String prenom, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

	//Ajoutez des getters pour tous les attributs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumero() {
        return numero;
    }

    public Membre getParrain() {
        return parrain;
    }

    //Ajouter un setter pour le numéro de téléphone.
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Ajoutez une méthode permettant d'initialiser le parrain.
	//Cette méthode renvoie false si le membre a déjà un parrain ou si le membre passé en paramètre est le membre lui-même. 
	//Sinon, elle initialise le parrain et renvoie true.
    public boolean setParrain(Membre parrain) {
        if (this.parrain != null) {
            return false;
        } else {
            if (this == parrain) {
                return false;
            } else {
                this.parrain = parrain;
                return true;
            }
        }
    }
		
	//Ajoutez une méthode toString qui renverra toutes les informations du membre sous forme textuelle. 
	//Si le membre a un parrain, il faut uniquement reprendre le prénom et le nom du parrain. Sinon, il faut dire que le membre n'a pas de parrain.
    public String toString() {
        if (parrain != null) {
            return "Le membre : " + nom + " " + prenom + " a comme numero " + numero + " et comme parrain " + parrain.getNom() + " " + parrain.getPrenom();
        } else {
            return "Le membre : " + nom + " " + prenom + " a comme numero " + numero + " et n'a pas de parrain !";
        }
    }
}
