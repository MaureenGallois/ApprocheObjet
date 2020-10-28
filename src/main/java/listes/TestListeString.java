package listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {

        String newVilles = null;
        int max = Integer.MIN_VALUE;
        String temp = null;

        ArrayList<String> villes = new ArrayList<String>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        for(int i=0; i<villes.size(); i++){
            if(villes.get(i).length()>max){
                temp=villes.get(i);
                max=villes.get(i).length();
            }
        }

        System.out.println("La ville avec le plus grand nombre de lettres est: "+temp);

        for (int i=0; i< villes.size(); i++){
            newVilles = villes.get(i).toUpperCase();
            villes.set(i, newVilles);
        }
        System.out.println("------------");
        System.out.println("La nouvelle liste: \n"+villes);

        for (int i=0; i<villes.size(); i++){
            if(villes.get(i).indexOf('N',0)==0){
                villes.remove(i);
            }
        }

        System.out.println("------------");
        System.out.println("Suppression des villes avec un N: \n" +villes);


    }
}
