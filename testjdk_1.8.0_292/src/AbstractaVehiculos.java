import java.awt.Color;
// Definir una clase que implemente alguna caracteristicas de diferentes tipos de vehiculos.
// Será una SuperClase que sirva para crear distintas SubClases como motos, camiones... etc.

abstract public class AbstractaVehiculos {

    // Propiedades
    
    // Color de vehiculo
    private Color Color;
    // Número de ruedas de vehículo
    private byte Ruedas;
    // Cilindrada la suma del volumen útil de todos los cilindros de un motor alternativo en un vehículo //// centímetros cúbicos (cm³) 
    private short Cilindrada;
    // Potencia de vehiculo - Kilovatios: kW
    private short Potencia;
    // Constructores
    // firma Color
    AbstractaVehiculos(Color color){
        setColor(color);
    }
    // firma byte
    AbstractaVehiculos(byte ruedas){
        this.Ruedas = ruedas;
    }
    // firma short
    AbstractaVehiculos(short cilindrada){
        this.Cilindrada = cilindrada;
    }
    // firma Color, byte
    AbstractaVehiculos(Color color, byte ruedas){
        this(color);
        this.Ruedas = ruedas;
    }
    // firma Color, byte, short
    AbstractaVehiculos(Color color, byte ruedas, short cilindrada){
        this(color, ruedas);
        this.Cilindrada = cilindrada;
    }
    // firma Color, byte, short, short
    AbstractaVehiculos(Color color, byte ruedas, short cilindrada, short potencia){
        this(color, ruedas, cilindrada);
        this.Potencia = potencia;
    }
    // setters
    public void setColor(Color color){
        Color = color;
    }

    // getters
    public Color getColor(){
        return Color;
    }
    public byte getRuedas(){
        return Ruedas;
    }
    public short getCilindrada(){
        return Cilindrada;
    }
    public short getPotencia(){
        return Potencia;
    }

    // abstrac
    // Se deja abstracto en la SuperClase y se define en cada una de las SubClases según sea necesario
    // El impuesto que paga un camion es diferente al de una motocicleta..etc
    public abstract float Impuesto();
}
