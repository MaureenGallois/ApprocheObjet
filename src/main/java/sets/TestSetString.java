package sets;

import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {

        int maxLettres = Integer.MIN_VALUE;
        String temp = null;

        HashSet<String> pays = new HashSet<String>();
        pays.add("USA");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("UK");
        pays.add("Italie");
        pays.add("Japon");
        pays.add("Chine");
        pays.add("Russie");
        pays.add("Inde");

        for(String valeur: pays){
            for(int i=0; i<valeur.length(); i++){
                if(valeur.length()>maxLettres){
                    temp = valeur;
                    maxLettres=valeur.length();
                }
            }
        }
        System.out.println("Le pays avec le plus grand nombre de lettre: "+temp);
        pays.remove(temp);
        System.out.println(pays);


    }
}
