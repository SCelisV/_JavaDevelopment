// Establecer(SET) y consultar (GET) 
// el color ColorFigura
// y la posición (X,Y) del centro de una figura Posicion
import java.awt.Color;
public class Figura{

    // Definición de las Propiedades
    // Objeto Color de java.awt.Color
    private Color ColorFigura;
    // matriz lineal - Posicion[0], Posicion[1] del centro de la figura
    private int[] Posicion = new int[2];

    // Constructor de la clase para establecer el Color de la figura
    Figura(Color color){
        EstablecerColor(color);
    }

    // Constructor de la clase para estableceer el Color y la Posicion de la figura
    Figura(Color color, int[] posicion){
        EstablecerColor(color);
        EstablecerCentro(posicion);
    }

    // Método SET establecer el color 
    public void EstablecerColor(Color color){
        ColorFigura = color;
    }

    // Método SET establecer la Posición
    public void EstablecerCentro(int[] posicion){
        // a la propiedad de la clase le establece el valor de la variable posicion
        this.Posicion[0] = posicion[0];
        this.Posicion[1] = posicion[1];
    }

    // Método GET recuperar el color
    public Color DimeColor(){
        return ColorFigura;
    }

    // Método GET recuperar la posicion 
    public int[] DimeCentro(){
        return Posicion;
    }

    // Método Imprimir la Posición
    public String ImprimirCentro(int[] posicion){
        // a la propiedad de la clase le establece el valor de la variable posicion
        return ("Posición del Centro: (x, y): " + "(" + posicion[0] + ", " + posicion[1] + ")");
    }

}
