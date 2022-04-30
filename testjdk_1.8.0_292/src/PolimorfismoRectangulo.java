import java.awt.Color;
// Rectangulo es una clase derivada de FiguraGeometrica que incorpora una nueva propiedad a las heredadas.
public class PolimorfismoRectangulo extends PolimorfismoFiguraGeometrica{

    // Propiedades
    // Lado[x,y]
    private double[] Lados = new double[2];

    // Constructores
    // vacio - initialize
    PolimorfismoRectangulo(){
        super();
        Lados[0] = 0d;
        Lados[1] = 0d;
    }
    // Sólo las propiedades de la SubClase firma double[]
    PolimorfismoRectangulo(double[] lados){
        super();
        setLados(lados);
    }
    // Sólo las propiedades de la SuperClase firma Color, int[]
    PolimorfismoRectangulo(Color color, int[] posicion){
        super(color, posicion);
        this.Lados[0] = 0d;
        this.Lados[1] = 0d;
    }
    // Mezcla de propiedades de la SubClase y SuperClase firma double[], Color
    PolimorfismoRectangulo(double[] lados, Color color){
        super(color);
        setLados(lados);
    }
   // Mezcla de propiedades de la SubClase y SuperClase firma double[], int[]
   PolimorfismoRectangulo(double[] lados, int[] posicion){
        super(posicion);
        setLados(lados);
    }
    // TODAS las propiedades
    // las propiedades de la SubClase: firma double[]
    // las propiedades de la SuperClase: firma Color, int[]
    PolimorfismoRectangulo(double[] lados, Color color, int[] posicion){
        this(color, posicion);
        setLados(lados);
    }
    // setters
    public void setLados(double[] lados){
        Lados[0] = lados[0];
        Lados[1] = lados[1];
    }

    // getters
    public double[] getLados(){
        return Lados;
    }

    // calcula el perimetro de un Rectangulo => Lado*Lado*Lado*Lado
    public double Perimetro(){
        return (2d*Lados[0] + 2d*Lados[1]);  
    }


    
}
