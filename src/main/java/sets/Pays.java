package sets;

import java.util.HashSet;

public class Pays {

    private String nom;
    private int nbHabitant;
    private int PIB;

    public Pays(String nom, int nbHabitant, int PIB){
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.PIB = PIB;
    }

    public void upCase(String nom){
        this.nom=nom.toUpperCase();
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public int getPIB() {
        return PIB;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", nbHabitant=" + nbHabitant +
                ", PIB=" + PIB +"\n";
    }

    public static void main(String[] args) {

        int maxPIB = Integer.MIN_VALUE;
        int minPIB = Integer.MAX_VALUE;
        String name = null;
        int habitants = 0;
        int pib = 0;

        Pays newP = new Pays(" ", 0, 0);
        Pays newP2 = new Pays(" ", 0, 0);



        HashSet<Pays> pays = new HashSet<Pays>();
        pays.add(new Pays("USA", 328_000_000, 62_794));
        pays.add(new Pays("France", 67_000_000, 41_463));
        pays.add(new Pays("Allemagne", 83_200_000, 47_603));
        pays.add(new Pays("UK", 65_800_000, 42_943));
        pays.add(new Pays("Italie", 60_244_639, 34_318));
        pays.add(new Pays("Japon", 126_500_000, 42_700));
        pays.add(new Pays("Chine", 1_384_688_986, 9_711));
        pays.add(new Pays("Russie", 144_500_000, 12_011));
        pays.add(new Pays("Inde", 1_300_000_000, 9_030));

        for(Pays valeur: pays){
            if(valeur.PIB>maxPIB){
                newP=valeur;
                maxPIB= valeur.PIB;
            }
        }

        System.out.println("Le pays est le PIB/Habitant le plus élevé est: "+newP);

        for(Pays valeur: pays){
            if(valeur.PIB<minPIB){
                newP2 = valeur;
                habitants = valeur.getNbHabitant();
                minPIB = valeur.getPIB();
                name = newP2.getNom();

            }
        }
        pays.remove(newP2);
        pays.add(new Pays(name.toUpperCase(),habitants,minPIB));

        System.out.println(pays);
    }
}
