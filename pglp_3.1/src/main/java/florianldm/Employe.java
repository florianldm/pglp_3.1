package florianldm;

/**
 * Classe Employe.
 */
public class Employe {

    private final String nom; //Nom employe
    private final String adresse; //Adresse employe

    /**
     * Constructeur de la classe.
     * @param nom
     * @param adresse
     */
    public Employe(final String nom, final String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    /**
     * Affiche les coordonnees (nom + adresse) de l'employé.
     *
     */

    public void affiche_coordonees() {
        System.out.println(nom + " , " + adresse);
    }
}
