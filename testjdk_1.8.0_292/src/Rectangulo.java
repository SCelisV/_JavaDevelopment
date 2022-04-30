import java.awt.Color;
// Rectangulo es una clase derivada de FiguraGeometrica que incorpora una nueva propiedad a las heredadas.
// Rectangulo especializa a la clase Figura
// Contiene llamadas explicitas a los constructores de su superclase
// Contiene una llamada implicita al constructor vacio de la superclase
public class Rectangulo extends FiguraGeometrica{

    // Propiedades
    // Lado[x,y]
    private double[] Lados = new double[2];

    // Constructores
    // vacio - initialize
    Rectangulo(){
        super();
        Lados[0] = 0d;
        Lados[1] = 0d;
    }
    // Sólo las propiedades de la SubClase firma double[]
    Rectangulo(double[] lados){
        super();
        setLados(lados);
    }
    // Sólo las propiedades de la SuperClase firma Color, int[]
    Rectangulo(Color color, int[] posicion){
        super(color, posicion);
        this.Lados[0] = 0d;
        this.Lados[1] = 0d;
    }
    // Mezcla de propiedades de la SubClase y SuperClase firma double[], Color
    Rectangulo(double[] lados, Color color){
        super(color);
        setLados(lados);
    }
   // Mezcla de propiedades de la SubClase y SuperClase firma double[], int[]
   Rectangulo(double[] lados, int[] posicion){
        super(posicion);
        setLados(lados);
    }
    // TODAS las propiedades
    // las propiedades de la SubClase: firma double[]
    // las propiedades de la SuperClase: firma Color, int[]
    Rectangulo(double[] lados, Color color, int[] posicion){
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


    
}
