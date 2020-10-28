package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNb = new ArrayList<Integer>();

        for(int i=1; i<=100; i++){
            arrayNb.add(i);
        }

        System.out.println(arrayNb.size());
    }
}
