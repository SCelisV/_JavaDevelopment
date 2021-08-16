public class PruebaObjeto3D{
    public static void main(String[] args) {
        // Instancias de la clase Objeto3D
        Objeto3D Caja = new Objeto3D();
        Objeto3D Esfera = new Objeto3D();
        Objeto3D Bicicleta = new Objeto3D();

        // Para establecer la dimensión de un objeto (anchura, profundidad, altura) en una medida dada podemos:
        // inicializar la clase con cualquiera de los métodos que hemos definido
        Caja.Dimensiones(20.0,12.5,30.2,"centimetros");
        Esfera.Dimensiones(10.0,"pulgadas",10.0,10.0);
        Bicicleta.Dimensiones(90.0,30.0,20.0);

        // Imprimen la medida y las dimensiones X, Y, Z de la Instancia Bicicleta
        System.out.println("Bicicleta.DimeMedida(): " + Bicicleta.DimeMedida());
        System.out.println("Bicicleta.DimeAncho(): " + Bicicleta.DimeAncho());
        System.out.println("Bicicleta.DimeAlto(): " + Bicicleta.DimeAlto());
        System.out.println("Bicicleta.DimeProfundo(): " + Bicicleta.DimeProfundo());

        // Cambio la medida de la Instancia Bicicleta
        Bicicleta.Dimensiones("pulgadas");

        // Imprimen la medida y las dimensiones X, Y, Z de la Instancia Bicicleta
        System.out.println("Bicicleta.DimeMedida(): " + Bicicleta.DimeMedida());
        System.out.println("Bicicleta.DimeAncho(): " + Bicicleta.DimeAncho());
        System.out.println("Bicicleta.DimeAlto(): " + Bicicleta.DimeAlto());
        System.out.println("Bicicleta.DimeProfundo(): " + Bicicleta.DimeProfundo());
    }
}