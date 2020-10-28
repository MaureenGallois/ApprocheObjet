package fr.diginamic.banque.services;

public class Credit extends Operation {
    public Credit(String dateOperation, int montant) {
        super(dateOperation, montant);
    }

    @Override
    public void operation(String dateOperation, int montant) {
        System.out.println("crédité de: " + montant+ " à la date du:" + dateOperation);
    }

    @Override
    public String afficherType() {
        return "Crédit"+super.toString();
    }

    //@Override
    //public String toString() {
    //    return super.toString()+"C'est un crédit";
    //}
}
