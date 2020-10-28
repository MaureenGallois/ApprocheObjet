package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale numero1 = new AdressePostale(3, "Rue de la chenaie", 72250, "Chaufour");
        AdressePostale numero2 = new AdressePostale(5, "Rue de la chenaie", 72250, "Chaufour");


        Personne moi = new Personne("Maureen", "Gallois",numero1);
        moi.setNom("Hey");
        moi.setPrenom("Moi");
        moi.setAdresse(numero2);

        System.out.println("Je me présente: \nJe m'apelle " + moi.getPrenom() + moi.getNom() + "\nEt j'habite au " + moi.getAdresse().getNumeroRue()+ " " + moi.getAdresse().getLibelleRue() +" "+ moi.getAdresse().getCodePostale()+", " + moi.getAdresse().getVille());
    }
}
