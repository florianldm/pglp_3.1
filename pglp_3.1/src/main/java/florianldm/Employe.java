package florianldm;

public class Employe {
    private final String nom;
    private final String adresse;

    public Employe(String nom, String adresse){
        this.nom = nom;
        this.adresse = adresse;
    }

    public void affiche_coordonees(){
        System.out.println(nom + " , " + adresse);
    }
}
