package fr.diginamic.banque.services;

public class Debit extends Operation{
    public Debit(String dateOperation, int montant) {
        super(dateOperation, montant);
    }

    @Override
    public void operation(String dateOperation, int montant) {
        System.out.println("Débiter de: " + montant+ " à la date du:" + dateOperation);
    }

    @Override
    public String afficherType() {
        return "Débit"+super.toString();
    }

    //@Override
    //public String toString() {
    //    return super.toString()+"C'est un débit";
    //}
}
