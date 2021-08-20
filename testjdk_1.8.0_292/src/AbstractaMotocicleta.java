import java.awt.Color;
// Definir una clase que implemente alguna caracteristicas de diferentes tipos de vehiculos.
// Será una SuperClase que sirva para crear distintas SubClases como motos, camiones... etc.
// Esta clase no es Abstracta porque no contiene ningún método abstracto
// Pero se debe definir el método Impuesto de la SuperClase que es abstracto.

public class AbstractaMotocicleta extends AbstractaVehiculos{

    // Propiedades
    // Numero de ocupantes 
    private byte Ocupantes;

    // Constructores - NO ME CONVENCE, esta poniendo la firma "byte Ruedas" COMO HARDCODE... --- 
    // vacio
    AbstractaMotocicleta(){
        super((byte)2);
    }

    // Sólo los de las propiedades de la SubClase
    // firma byte
    AbstractaMotocicleta(byte ocupantes){
        super((byte)2);
        setOcupantes(ocupantes);
    }
    // firma Color, byte
    AbstractaMotocicleta(Color color){
        super(color, (byte)2);
    }
    // firma Color, byte, short
    AbstractaMotocicleta(Color color, short cilindrada){
        super(color, (byte)2, cilindrada);
    }
    
    // firma Color, byte, short, short
    AbstractaMotocicleta(Color color, short cilindrada, short potencia){
        super(color, (byte) 2, cilindrada, potencia);
    }
    // setters
    public void setOcupantes(byte ocupantes){
        this.Ocupantes = ocupantes;
    }

    // getters
    public byte getOcupantes(){
        return Ocupantes;
    }

    // definición del método abstract perteneciente a la SuperClase - Suponemos que así se calcula el Impuesto de las Motocicletas
    public float Impuesto(){
        return (
            super.getCilindrada()/30 +
            super.getPotencia()*20
        );
    }
}
