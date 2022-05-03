import java.awt.Color;
// Crear clases que representen figuras geométicas bidimensionales.
// Una FiguraGeometrica se caracteriza por su color y su posición.
// En los circulos además se establece un radio
// En los rectangulos es necesario definir la longitud de sus lados
public class FiguraGeometrica {

    // Propiedades
    // Color de la FiguraGeometrica
    private Color Color;
    // Posicion (x, y)
    private int[] Posicion = new int [2];

    // Constructores
    // vacio
    // Initialize
    FiguraGeometrica(){
        setColor(Color.GREEN);
        Posicion[0] = 0;
        Posicion[1] = 0;
    }
    // firma Color
    FiguraGeometrica(Color color){
        setColor(color);
    }
    // firma int[]
    FiguraGeometrica(int[] posicion){
        setPosicion(posicion);
    }
    // firma Color, int[]
    FiguraGeometrica(Color color, int[] posicion){
        this(color);
        setPosicion(posicion);
    }
    // firma int[], Color
    FiguraGeometrica(int[] posicion, Color color){
        this(color, posicion);
    }

    // setters
    public void setColor(Color color){
        this.Color = color;
    }
    public void setPosicion(int[] posicion){
        this.Posicion[0] = posicion[0];
        this.Posicion[1] = posicion[1];
    }
    // getters
    public Color getColor(){
        return Color;
    }
    public int[] getPosicion(){
        return Posicion;
    }
}
