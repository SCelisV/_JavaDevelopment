import java.awt.Color;

public class PruebaFigura{
    public static void main(String[] args) {
        //crea la variable c de tipo Color con los datos RedGreenBlue values in the range (0 - 255) pasados por parámetros 
        Color c = new Color(237, 28, 36);
        //crea la variable p es una matriz lineal que representa los valores X, Y
        int [] p = {10, 5};

        // Crea el objeto Cuadrado de tipo Figura,
        // lo instancia con el constructor que permite establecer el color de la figura.
        Figura Cuadrado = new Figura(c);

        // Crea el objeto Rectangulo de tipo Figura, 
        // lo instancia con el contructor que permite establecer el color y el centro de la figura.
        Figura Rectangulo = new Figura(c, p);

        System.out.println("Cuadrado.DimeColor: " + Cuadrado.DimeColor());

        System.out.println("Rectangulo.DimeColor: " + Rectangulo.DimeColor());

        int [] Centro = Rectangulo.DimeCentro();

        for (int i=0; i < Centro.length; i++){
            System.out.println("Rectangulo.DimeCentro: " + i + ": " + Centro[i]);
        }
    }
}