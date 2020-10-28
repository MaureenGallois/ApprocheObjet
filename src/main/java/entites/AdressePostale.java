package entites;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private int codePostale;
    private String ville;

    public AdressePostale(int numeroRue, String libelleRue, int codePostale, String ville){
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostale = codePostale;
        this.ville = ville;
    }

    public int getNumeroRue(){
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public String getVille() {
        return ville;
    }
}
