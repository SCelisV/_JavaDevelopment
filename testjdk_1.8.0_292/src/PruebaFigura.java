import java.awt.Color;
public class PruebaFigura{

    public static void main(String[] args){

        // Color(int r, int g, int b)
        // Creates an opaque sRGB color with the specified red, green, and blue values in the range (0 - 255).
        // Color color = new Color(213,111,56);
        Color color = new Color(213, 111, 56);
        int[] posicion = {5, 10};

        // creo el objeto figura con el constructor Figura(Color color)
        Figura figura = new Figura(color);

        // creo el objeto unaFigura con el constructor Figura(Color color, int[] posicion)
        Figura unaFigura = new Figura(color, posicion);

        System.out.println("figura.DimeColor(): " + figura.DimeColor());
        System.out.println("\n");
        
        System.out.println("unaFigura.DimeColor(): " + unaFigura.DimeColor());
        System.out.println("unaFigura.DimeCentro(): " + unaFigura.DimeCentro());
        System.out.println("unaFigura " + unaFigura.ImprimirCentro(unaFigura.DimeCentro()));
        System.out.println("\n");

        /*
        int[] centroUnaFigura = unaFigura.DimeCentro();
        System.out.println("Posición del Centro: (x, y): " + "(" + centroUnaFigura[0] + ", " + centroUnaFigura[1] + ")");
        */

        Color color2 = new Color(113, 011, 65);
        int[] posicion2 = {10, 15};

        unaFigura.EstablecerColor(color2);
        System.out.println("unaFigura.DimeColor(): " + unaFigura.DimeColor());
        System.out.println("\n");

        figura.EstablecerCentro(posicion2);
        System.out.println("figura.DimeColor(): " + figura.DimeColor());
        System.out.println("figura.DimeCentro(): " + figura.DimeCentro());
        System.out.println("figura " + figura.ImprimirCentro(figura.DimeCentro()));
        System.out.println("\n");
    }

}
