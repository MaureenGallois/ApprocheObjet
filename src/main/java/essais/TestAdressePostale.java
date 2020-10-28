package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale numero1 = new AdressePostale(3, "Rue de la chenaie", 72250, "Chaufour");

        System.out.print("Adresse numéro 1:  \nNuméro de rue " + numero1.getNumeroRue() + " \nNom de rue: " + numero1.getLibelleRue() + "\nCode postal: " + numero1.getCodePostale() + "\nVille: " + numero1.getVille());
    }
}
