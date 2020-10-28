package sets;

import java.util.HashSet;


public class TestSetDouble {
    public static void main(String[] args) {

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;

        HashSet<Double> doubles = new HashSet<Double>();
        doubles.add(1.5);
        doubles.add(8.25);
        doubles.add(-7.32);
        doubles.add(13.3);
        doubles.add(-12.45);
        doubles.add(48.5);
        doubles.add(0.01);

        for (Double valeur: doubles){
            if(max<valeur){
                max=valeur;
            }
        }
        System.out.println("La valeur max est: "+max);

        for (Double valeur: doubles){
            if(min>valeur){
                min=valeur;
            }
        }
        doubles.remove(min);
        System.out.println("La valeur supprimée est: " +min);
        System.out.println("La collection: \n"+doubles);

    }
}
