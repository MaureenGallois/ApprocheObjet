package fr.diginamic.banque.services;

public abstract class Operation {
    private String dateOperation;
    private int montant;

    public Operation(String dateOperation, int montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public abstract void operation(String dateOperation, int montant);
    public abstract String afficherType();

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montant=" + montant +
                '}';
    }

    public int getMontant() {
        return montant;
    }
}
