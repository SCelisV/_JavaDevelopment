import java.awt.Color;
// Implementa una SubClases camion... etc.
// utilizando las caracteristicas de la SuperClase vehiculos.

public class Camion extends Vehiculos{

    // Propiedades
    
    // Número de ejes
    private byte Ejes;

    // Constructores
    // vacio
    Camion(){
        super();
        this.Ejes = 2;
    }
    // Sólo las propiedades de la SubClase firma double
    Camion(byte ejes){
        super();
        setEjes(ejes);
    }
    // Sólo las propiedades de la SuperClase
    // firma Color, byte, short
    Camion(Color color, byte ruedas, short cilindrada, short potencia){
        super(color, ruedas, cilindrada, potencia);
    }
    // Mezcla SubClase y SuperClase firma byte, byte
    // firma Color, byte, short, short, byte
    Camion(Color color, byte ruedas, short cilindrada, short potencia, byte ejes){
        super(color, ruedas, cilindrada, potencia);
        setEjes(ejes);
    }
    // setters
    public void setEjes(byte ejes){
        Ejes = ejes;
    }
    // getters
    public byte getEjes(){
        return Ejes;
    }
}
