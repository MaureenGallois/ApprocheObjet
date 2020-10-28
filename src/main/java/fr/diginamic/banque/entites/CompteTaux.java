package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private int tauxRenum;

    public CompteTaux(int numeroCompte, int soldeCompte, int tauxRenum) {
        super(numeroCompte, soldeCompte);
        this.tauxRenum = tauxRenum;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CompteTaux{" +
                "tauxRenum=" + tauxRenum +
                '}';
    }
}
