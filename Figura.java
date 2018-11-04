import java.awt.Color;

public class Figura{
    // Establece y Consulta el Color y la posición del centro de cada instancia de la clase
    // Color es una clase java, que importamos en: java.awt.Color
    private Color ColorFigura;
    // Posición es una matriz lineal que representa los valores X, Y de la posición del centro de la figura
    private int [] Posicion = new int [2];

    //Constructor de la clase en el que se puede establecer el color de la figura por medio de EstablecerColor
    Figura(Color color){
        EstablecerColor(color);
    }
    //Constructor de la clase en la que se establece el color y la posición del centro de la figura por medio de EstablecerCentro
    Figura(Color color, int [] Posicion){
        this.EstablecerColor(color);
        this.EstablecerCentro(Posicion);
    }

    // Actualiza la propiedad ColorFigura de la clase this con el valor del parámetro color
    public void EstablecerColor(Color color){
        ColorFigura = color;
    }
    // Obtiene el valor de la propiedad ColorFigura
    public Color DimeColor(){
        return ColorFigura;
    }
    // Actualiza la propiedad Posición de la clase this con el valor del parametro posición
    public void EstablecerCentro(int [] Posicion){
        this.Posicion[0] = Posicion[0];
        this.Posicion[1] = Posicion[1];
    }
    // Obtiene el valor de la propiedad Posicion
    public int[] DimeCentro(){
        return Posicion;
    }
}