package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte leCompte = new Compte(12, 344522);
        CompteTaux monCompte = new CompteTaux(12006, 12233476, 3445);

        Compte [] lesComptes = {leCompte, monCompte};

        for(int i = 0; i<lesComptes.length; i++){
                System.out.println(lesComptes[i]);

        }
    }
}
