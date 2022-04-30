import java.awt.Color;
// Cirulo es una clase derivada de FiguraGeometrica que incorpora una nueva propiedad a las heredadas.
public class Circulo extends FiguraGeometrica{

    // Propiedades
    private double Radio;

    // Constructores
    // vacio - Initializa
    // firma 
    Circulo(){
        super();
        Radio = 0.0f;
    }
    // Sólo las propiedades de la SubClase firma double
    Circulo(double radio){
        super();
        setRadio(radio);
    }
    // Sólo las propiedades de la SuperClase firma Color, int[]
    Circulo(Color color, int[] posicion){
        super(color, posicion);
        this.Radio = 0.0f;
    }
    // Mezcla de propiedades de la SubClase y SuperClase firma double, Color
    Circulo(double radio, Color color){
        super(color);
        setRadio(radio);
    }
    // Mezcla de propiedades de la SubClase y SuperClase firma double, int[]
    Circulo(double radio, int[] posicion){
        super(posicion);
        setRadio(radio);
    }
    // TODAS las propiedades
    // las propiedades de la SubClase: firma double
    // las propiedades de la SuperClase: firma Color, int[]
    Circulo(double radio, Color color, int[] posicion){
        super(color, posicion);
        setRadio(radio);
    }

    // setters
    public void setRadio(double radio){
        Radio = radio;
    }

    // getters
    public double getRadio(){
        return Radio;
    }
}
