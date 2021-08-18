import java.awt.Color;
public class PruebaFiguraGeometrica {
    public static void main(String[]args){
        //
        int[] Posicion = {10, 20};
        double[] Lados = {50d, 100d};

        // Circulos
        Circulo MiCirculo = new Circulo();
        Circulo MiOtroCirculo = new Circulo(Color.BLUE, Posicion);


        // Rectangulos
        Rectangulo MiRectangulo = new Rectangulo();
        Rectangulo MiOtroRectangulo = new Rectangulo(Lados);

        ImprimirCirculo(MiCirculo);
        ImprimirRectangulo(MiRectangulo);
        ImprimirCirculo(MiOtroCirculo);
        ImprimirRectangulo(MiOtroRectangulo);
    }



    public static void ImprimirCirculo(Circulo Circulo){
        
        Color Color;
        int[] Posicion;
        double Radio;
        Color = Circulo.getColor();
        Posicion = Circulo.getPosicion();
        Radio = Circulo.getRadio();
        System.out.println("Datos de mi Figura Geometrica: " + Circulo);
        System.out.println("MiCirculo.Color: " + Color);
        System.out.println("MiCirculo.Posicion: " + Posicion); 
        System.out.println("MiCirculo.Radio: " + Radio);

    }

    public static void ImprimirRectangulo(Rectangulo Rectangulo){
        
        Color Color;
        int[] Posicion;
        double [] Lados;
        Color = Rectangulo.getColor();
        Posicion = Rectangulo.getPosicion();
        Lados = Rectangulo.getLados();
        System.out.println("Datos de mi Figura Geometrica: " + Rectangulo);
        System.out.println("MiRectangulo.Color: " + Color);
        System.out.println("MiRectangulo.Posicion: " + Posicion); 
        System.out.println("MiRectangulo.Lados: " + Lados);

    }


    
}
