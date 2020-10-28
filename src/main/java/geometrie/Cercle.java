package geometrie;

public class Cercle implements ObjetGeometrique{

    private int rayon;
    public Cercle(int rayon){
        this.rayon=rayon;
    }

    @Override
    public double perimetre() {
        return 2*rayon*Math.PI;
    }

    @Override
    public double surface() {
        return Math.pow(rayon,rayon)*Math.PI;
    }
}
