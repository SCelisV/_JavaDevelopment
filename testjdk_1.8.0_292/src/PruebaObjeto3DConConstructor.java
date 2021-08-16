public class PruebaObjeto3DConConstructor{
    public static void main(String[] args) {
        // Instancias de la clase Objeto3DConConstructor
        Objeto3DConConstructor Caja = new Objeto3DConConstructor(20.0, 12.5, 30.2, "centimetros");
        Objeto3DConConstructor Esfera = new Objeto3DConConstructor(10.0,"pulgadas",10.0,10.0);         
        Objeto3DConConstructor Bicicleta = new Objeto3DConConstructor(90.0,30.0,20.0);

        // Imprimen la medida y las dimensiones X, Y, Z de la Instancia Bicicleta
        System.out.println("Bicicleta.DimeMedida(): " + Bicicleta.DimeMedida());
        System.out.println("Bicicleta.DimeAncho(): " + Bicicleta.DimeAncho());
        System.out.println("Bicicleta.DimeAlto(): " + Bicicleta.DimeAlto());
        System.out.println("Bicicleta.DimeProfundo(): " + Bicicleta.DimeProfundo());

        // Cambio la medida de la Instancia Bicicleta
        Bicicleta.TipoMedida("pulgadas");

        // Imprimen la medida y las dimensiones X, Y, Z de la Instancia Bicicleta
        System.out.println("Bicicleta.DimeMedida(): " + Bicicleta.DimeMedida());
        System.out.println("Bicicleta.DimeAncho(): " + Bicicleta.DimeAncho());
        System.out.println("Bicicleta.DimeAlto(): " + Bicicleta.DimeAlto());
        System.out.println("Bicicleta.DimeProfundo(): " + Bicicleta.DimeProfundo());
        
    }
}