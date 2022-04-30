import java.awt.Color;
// Definir una clase que implemente alguna caracteristicas de diferentes tipos de vehiculos.
// Será una SuperClase que sirva para crear distintas SubClases como motos, camiones... etc.

public class Motocicleta extends Vehiculos{

    // Propiedades
    // Numero de ocupantes 
    private byte Ocupantes;

    // Constructores
    // vacio
    Motocicleta(){
        super();
        this.Ocupantes = 1;
    }

    // Sólo los de las propiedades de la SubClase
    // firma byte
    Motocicleta(byte ocupantes){
        super();
        setOcupantes(ocupantes);
    }
    
    // firma Color, byte, short, short
    Motocicleta(Color color, byte ruedas, short cilindrada, short potencia){
        super(color, ruedas, cilindrada, potencia);
        this.Ocupantes = 1;
    }
    // Mezcla Sub y Super Clase
    // firma Color, byte, short, short, byte
    Motocicleta(Color color, byte ruedas, short cilindrada, short potencia, byte ocupantes){
        super(color, ruedas, cilindrada, potencia);
        setOcupantes(ocupantes);
    }
    // setters
    public void setOcupantes(byte ocupantes){
        Ocupantes = ocupantes;
    }

    // getters
    public byte getOcupantes(){
        return Ocupantes;
    }
}
