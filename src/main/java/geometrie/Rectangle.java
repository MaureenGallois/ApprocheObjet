package geometrie;

public class Rectangle implements ObjetGeometrique{
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    @Override
    public double perimetre() {
        return (longueur+largeur)/2;
    }

    @Override
    public double surface() {
        return longueur+largeur;
    }
}
