import java.awt.Color;
// Definir una clase que implemente alguna caracteristicas de diferentes tipos de vehiculos.
// Será una SuperClase que sirva para crear distintas SubClases como motos, camiones... etc.
// contiene llamadas explicitas a los constructores de su misma clase

public class Vehiculos {

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
    // vacio
    Vehiculos(){
        Color = Color.RED;
        Ruedas = 4;
        Cilindrada = 1582;
        Potencia = 90;
    }
    // firma Color
    Vehiculos(Color color){
        setColor(color);
    }
    /*
    // firma byte
    Vehiculos(byte ruedas){
        setRuedas(ruedas);
    }
    */
    // firma short
    Vehiculos(short cilindrada){
        setCilindrada(cilindrada);
    }
    // firma Color, byte
    Vehiculos(Color color, byte ruedas){
        setColor(color);
        setRuedas(ruedas);
    }
    // firma Color, byte, short
    Vehiculos(Color color, byte ruedas, short cilindrada){
        this(color, ruedas);
        setCilindrada(cilindrada);
    }
    // firma Color, byte, short, short
    Vehiculos(Color color, byte ruedas, short cilindrada, short potencia){
        this(color, ruedas, cilindrada);
        setPotencia(potencia);
    }
    // setters
    public void setColor(Color color){
        Color = color;
    }
    public void setRuedas(byte ruedas){
        Ruedas = ruedas;
    }
    public void setCilindrada(short cilindrada){
        Cilindrada = cilindrada;
    }
    public void setPotencia(short potencia){
        Potencia = potencia;
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
}
