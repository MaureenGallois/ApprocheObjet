package listes;

import java.util.ArrayList;

public class Ville {
    private String nom;
    private int nbHabitants;


    public Ville(String nom, int nbHabitants){
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return "nom='" + nom+
                ", nbHabitants=" + nbHabitants +
                "\n";
    }

    public String getNom() {
        return nom;
    }

    public void upCase(String nom){
        this.nom=nom.toUpperCase();
    }

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxHabitant = 100_000;
        int temp = 0;
        String villeSup = null;
        String villeName = null;
        String newVille = null;

        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice",234_000));
        villes.add(new Ville("Carcassonne", 34_456));
        villes.add(new Ville("Narbonne", 1_234_760));
        villes.add(new Ville("Lyon", 100_456));
        villes.add(new Ville("Foix", 458_912));
        villes.add(new Ville("Pau", 99_245));
        villes.add(new Ville("Marseille", 348_443));
        villes.add(new Ville("Tarbes", 12_545));

        for(int i=0; i< villes.size(); i++){
            if(villes.get(i).nbHabitants>max) {
                villeName = villes.get(i).nom;
                max=villes.get(i).nbHabitants;
            }
        }
        System.out.println("La ville la plus peuplée et qui a été supprimé est: " +villeName);

        for(int i=0; i< villes.size(); i++){
            if(villes.get(i).nbHabitants<min) {
                temp=i;
                villeSup = villes.get(i).nom;
                min=villes.get(i).nbHabitants;
            }
        }

        System.out.println("---------------------------");
        System.out.println("La ville la moin peuplée et qui a été supprimé est: " +villeSup);
        villes.remove(temp);

        for(int i=0; i< villes.size(); i++){
            if(villes.get(i).nbHabitants<min) {
                temp=i;
                villeSup = villes.get(i).nom;
                min=villes.get(i).nbHabitants;
            }
        }

        for(int i=0; i< villes.size(); i++){
            if(villes.get(i).nbHabitants>maxHabitant) {
                villes.get(i).upCase(villes.get(i).getNom());
            }
        }

        System.out.println(villes);

    }
}
