public class PruebaObjeto3D{
    public static void main(String[] args) {
        // Instancias de la clase Objeto3D
        Objeto3D Caja = new Objeto3D();
        Objeto3D Esfera = new Objeto3D();
        Objeto3D Bicicleta = new Objeto3D();

        Caja.Dimensiones(20.0,12.5,30.2,"centimetros");
        Esfera.Dimensiones(10.0,"pulgadas",10.0,10.0);
        Bicicleta.Dimensiones(90.0,30.0,20.0);

        // Imprimen la medida y la altura de la Instancia Bicicleta
        System.out.println("Bicicleta.DimeMedida(): " + Bicicleta.DimeMedida());
        System.out.println("Bicicleta.DimeAlto(): " + Bicicleta.DimeAlto());
     
        Bicicleta.Dimensiones("pulgadas");

        System.out.println("Bicicleta.DimeMedida(): " + Bicicleta.DimeMedida());
        System.out.println("Bicicleta.DimeAlto(): " + Bicicleta.DimeAlto());
    }
}