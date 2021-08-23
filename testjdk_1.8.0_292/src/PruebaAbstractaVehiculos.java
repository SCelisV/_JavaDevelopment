import java.awt.Color;
public class PruebaAbstractaVehiculos {
    
    public static void main(String[] args){

        // Creamos objetos de Tipo SuperClase AbstractaVehiculos 
        // Que Instanciamos como clases NO abstractas AbstractaMotocicleta
        // firma Color, byte, short, short
        AbstractaVehiculos MotoBarata = new AbstractaMotocicleta(Color.red, (short)125, (short)25);
        AbstractaVehiculos MotoMedia = new AbstractaMotocicleta(Color.red, (short)125, (short)25);
        AbstractaVehiculos MotoCara = new AbstractaMotocicleta(Color.yellow, (short)1000, (short)90);

        // firma Color, byte, byte, short, short
        AbstractaVehiculos CamionNormal = new AbstractaCamion(Color.BLACK, (byte)4, (byte)2, 
                                                            (short)4000, (short)300);
        AbstractaVehiculos CamionEnorme = new AbstractaCamion(Color.RED, (byte)24, (byte)6, 
                                                            (short)15000, (short)800);

        // 2. Utilizar Casting sin crear explicitamente una instancia de la clase AbstractaMotocicleta.
        System.out.println("((AbstractaMotocicleta) MotoBarata).getPotencia(): " + ((AbstractaMotocicleta) MotoBarata).getPotencia());
        
        // 1. Crear una instancia de la clase AbstractaMotocicleta y asignarle la referencia de MotoMedia usando Casting
        AbstractaMotocicleta InstanciaMotoMedia = (AbstractaMotocicleta) MotoMedia;
        InstanciaMotoMedia.setOcupantes((byte)2);
        System.out.println("InstanciaMotoMedia.getOcupantes(): " + InstanciaMotoMedia.getOcupantes());

        // 2. Utilizar Casting sin crear explicitamente una instancia de la clase AbstractaMotocicleta.
        System.out.println("((AbstractaMotocicleta) MotoCara).getColor(): " + ((AbstractaMotocicleta) MotoCara).getColor());
        
        // 1. Crear una instancia de la clase AbstractaCamion y asignarle la referencia de CamionNormal usando Casting
        AbstractaCamion InstanciaCamionNormal = (AbstractaCamion) CamionNormal;
        InstanciaCamionNormal.setEjes((byte)6);
        System.out.println("InstanciaCamionNormal.getOcupantes(): " + InstanciaCamionNormal.getEjes());

        // 2. Utilizar Casting sin crear explicitamente una instancia de la clase AbstractaCamion
        System.out.println("((AbstractaCamion) CamionEnorme " + ((AbstractaCamion) CamionEnorme).getEjes());
        
        System.out.println("MotoBarata.Impuesto(): " + MotoBarata.Impuesto());
        System.out.println("MotoCara.Impuesto(): " + MotoCara.Impuesto());
        System.out.println("CamionNormal.Impuesto(): " + CamionNormal.Impuesto());
        System.out.println("CamionEnorme.Impuesto()" + CamionEnorme.Impuesto());
        System.out.println("InstanciaCamionNormal.Impuesto(): " + InstanciaCamionNormal.Impuesto());
    }
}