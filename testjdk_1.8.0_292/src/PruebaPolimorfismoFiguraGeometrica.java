import java.awt.Color;
public class PruebaPolimorfismoFiguraGeometrica {
    public static void main(String[]args){
        //
        int[] Posicion = {10, 20};
        double[] Lados = {50d, 100d};

        // Uso de Polimorfismo
        // Circulo - utiliza el constructor    PolimorfismoCirculo(double radio, Color color, int[] posicion)
        // Creando un objeto de la SuperClase PolomorfismoFiguraGeometrica pero se instancia basado en la SubClase PolimorfismoCirculo
        PolimorfismoFiguraGeometrica MiCirculo = new PolimorfismoCirculo(3d, Color.red, Posicion);
        // En tiempo de EJECUCION:
        // Se determina que la propiedad MiCirculo de tipo PolimorfismoFiguraGeometrica, 
        // apunta a una instancia de la clase PolimorfismoCirculo, 
        // por lo que se invoca el método Perimetro de la clase PolimorfismoCirculo (ŚubClase).
        // y no sé invoca al método Perimetro de PolimorfismoFiguraGeometrica ó PolimorfismoRectangulo.
        System.out.println("PolimorfismoFiguraGeometrica MiCirculo.Perimetro(): " + MiCirculo.Perimetro());

        // Rectangulo - utiliza el constructor    PolimorfismoRectangulo(double[] lados, Color color, int[] posicion)
        // Creando un objeto de la SuperClase PolomorfismoFiguraGeometrica pero se instancia basado en la SubClase PolimorfismoRectangulo
        PolimorfismoFiguraGeometrica MiRectangulo = new PolimorfismoRectangulo(Lados, Color.blue, Posicion);
        // En tiempo de EJECUCION:
        // Se determina que la propiedad MiRectangulo de tipo PolimorfismoFiguraGeometrica, 
        // apunta a una instancia de la clase PolimorfismoRectangulo, 
        // por lo que se invoca el método Perimetro de la clase PolimorfismoRectangulo (ŚubClase).
        // y no sé invoca al método Perimetro de PolimorfismoFiguraGeometrica ó PolimorfismoCirculo.
        System.out.println("PolimorfismoFiguraGeometrica MiRectangulo.Perimetro(): " + MiRectangulo.Perimetro());

        /*
        // Dede una SuperClase NO SE TIENEN visibilidad de los miembros de las SubClases (aunque al controrio no haya problema)
        Esto genera errores de compilación: MiCirculo.getRadio() y MiRectangulo.getLados()
        Los métodos getRadio() y getLados() pertenece a la clase PolimorfismoCirculo y PolimorfismoRectangulo respectivamente, y 
        MiCirculo y MiRectangulo son propiedades de tipo PolimorfismoFiguraGeometrica.

        System.out.println("PolimorfismoFiguraGeometrica MiCirculo.getRadio(): " + MiCirculo.getRadio());
        System.out.println("PolimorfismoFiguraGeometrica MiRectangulo.getLados(): " + MiRectangulo.getLados());


        System.out.println("PolimorfismoFiguraGeometrica MiCirculo.getRadio(): " + MiCirculo.getRadio());
                                                                                            ^
  symbol:   method getRadio()
  location: variable MiCirculo of type PolimorfismoFiguraGeometrica

        System.out.println("PolimorfismoFiguraGeometrica MiRectangulo.getLados(): " + MiRectangulo.getLados());
                                                                                                  ^
  symbol:   method getLados()
  location: variable MiRectangulo of type PolimorfismoFiguraGeometrica
        */

        // Para solucionar esto tenemos dos posibilidades:

        // MiCirculo - utiliza el constructor    PolimorfismoCirculo(double radio, Color color, int[] posicion)
        // Creando un objeto de la SubClase para utilizar los métodos de la SubClase en el objeto de la SuperClase creado anteriormente
        // 1. Crear una instancia de la clase PolimorfismoCirculo y asignarle la referencia de MiCirculo usando Casting
        PolimorfismoCirculo UnCirculo = (PolimorfismoCirculo) MiCirculo;
        System.out.println("PolimorfismoCirculo UnCirculo = (PolimorfismoCirculo) MiCirculo => UnCirculo.getRadio() " + UnCirculo.getRadio());

        // Rectangulo - utiliza el constructor    PolimorfismoRectangulo(double[] lados, Color color, int[] posicion)
        // Creando un objeto de la SubClase para utilizar los métodos de la SubClase en el objeto de la SuperClase creado anteriormente
        // 1. Crear una instancia de la clase PolimorfismoRectangulo y asignarle la referencia de MiRectangulo usando Casting
        PolimorfismoRectangulo UnRectangulo = (PolimorfismoRectangulo) MiRectangulo;
        System.out.println("PolimorfismoRectangulo UnRectangulo = (PolimorfismoRectangulo) MiRectangulo => UnRectangulo.getLados(): " + UnRectangulo.getLados());

        // 2. Utilizar Casting sin crear explicitamente una instancia de la clase PolimorfismoCirculo.
        System.out.println("((PolimorfismoCirculo) MiCirculo).getRadio(): " + ((PolimorfismoCirculo) MiCirculo).getRadio());

        // 2. Utilizar Casting sin crear explicitamente una instancia de la clase PolimorfismoRectangulo.
        System.out.println("((PolimorfismoRectangulo) MiRectangulo).getLados(): " + ((PolimorfismoRectangulo) MiRectangulo).getLados());


    }

}
