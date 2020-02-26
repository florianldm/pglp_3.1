package florianldm;

/**
 * Classe qui s'occupe de faire des calculs sur les employés.
 */
public class CalculEmploye extends Employe {

    /**
     * Constructeur de la classe.
     * @param nom
     * @param adresse
     */
    public CalculEmploye(final String nom, final String adresse) {
        super(nom, adresse);
    }

    /**
     * Méthode de calcul de salaire.
     * @return salaire
     */
    public double calculSalaire() {
        //Calcul salaire//
        return 0.;
    }
}
