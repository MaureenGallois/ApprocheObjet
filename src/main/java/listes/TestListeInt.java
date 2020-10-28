package listes;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE;
        int valeur = 0;
        int positif = 0;
        int test;
        
        ArrayList<Integer> listeInt = new ArrayList<Integer>();
        listeInt.add(-1);
        listeInt.add(5);
        listeInt.add(7);
        listeInt.add(3);
        listeInt.add(-2);
        listeInt.add(4);
        listeInt.add(8);
        listeInt.add(5);

        for(int i=1; i<listeInt.size(); i++){
            if(listeInt.get(i)>listeInt.get(i-1)){
                max=listeInt.get(i);
            }
        }
        System.out.println("Valeur la plus grande: "+max);


        for(int i=0; i<listeInt.size(); i++){
            if(min>listeInt.get(i)){
                min=i;
                valeur = listeInt.get(i);
            }
        }
        System.out.println("La valeur supprimée est: "+valeur);
        listeInt.remove(min);

        for(int i=0; i<listeInt.size(); i++){
            if(listeInt.get(i)<0) {
                positif = listeInt.get(i)*(-1);
                System.out.println("La valeur " +listeInt.get(i)+ " est devenue " +positif);
                listeInt.set(i, positif);
            }
        }


        System.out.println("------------------------");
        System.out.println(listeInt);
        System.out.println("------------------------");
        System.out.println("Taille du tableau: "+listeInt.size());
    }
}
