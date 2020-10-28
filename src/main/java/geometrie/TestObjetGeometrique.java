package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        Cercle cercle = new Cercle(3);
        Rectangle  rec = new Rectangle(5,17);

        ObjetGeometrique [] objGeo = {cercle,rec};

        for(int i = 0; i< objGeo.length; i++){
            if(objGeo[i] instanceof Cercle) {
                System.out.println("Cercle : \nPerimetre: " + objGeo[i].perimetre() + " \n Surface: " + objGeo[i].surface());
            }
            else
                System.out.println("Rectangle : \nPerimetre: "+objGeo[i].perimetre()+" \n Surface: "+objGeo[i].surface());
        }

    }
}
