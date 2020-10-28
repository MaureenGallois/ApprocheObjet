package fr.diginamic.banque;

import fr.diginamic.banque.services.Credit;
import fr.diginamic.banque.services.Debit;
import fr.diginamic.banque.services.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Credit credit1 = new Credit("03/05", 103);
        Credit credit2 = new Credit("28/11", 49);
        Debit debit1 = new Debit("03/05", 23);
        Debit debit2 = new Debit("03/09", 233);

        Operation [] operations = {credit1,credit2,debit1,debit2};
        int credit =0;
        int debit = 0;
        int total = 0;

        for(int i=0; i< operations.length; i++){
            System.out.println(operations[i].afficherType());

            if(operations[i] instanceof Credit){
                credit+= operations[i].getMontant();
            }
            else if(operations[i] instanceof Debit){
                debit-= operations[i].getMontant();
            }

        }
        total=credit+debit;
        System.out.println("Le montant total: "+total+"€");


    }
}
