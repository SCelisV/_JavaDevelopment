import java.awt.Color;
// Implementa una SubClases camion... etc.
// utilizando las caracteristicas de la SuperClase vehiculos.
// Esta clase no es Abstracta porque no contiene ningún método abstracto
// Pero se debe definir el método Impuesto de la SuperClase que es abstracto.
// this indica la propia clase y super indica la SuperClase
public class AbstractaCamion extends AbstractaVehiculos{

    // Propiedades
    
    // Número de ejes
    private byte Ejes;

    // Constructores
    // Sólo las propiedades de la SuperClase
    // firma byte
    AbstractaCamion(byte ruedas){
        super(ruedas);
    }
    // firma Color, byte
    AbstractaCamion(Color color, byte ruedas){
        super(color, ruedas);
    }
    // firma Color, byte, short
    AbstractaCamion(Color color, byte ruedas, short cilindrada){
        super(color, ruedas, cilindrada);
    }
    // firma Color, byte, short, short
    AbstractaCamion(Color color, byte ruedas, short cilindrada, short potencia){
        super(color, ruedas, cilindrada, potencia);
    }
    // Mezcla SubClase y SuperClase 
    // firma Color, byte, byte, short, short
    AbstractaCamion(Color color, byte ruedas, byte ejes, short cilindrada, short potencia){
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

    // definición del método abstract perteneciente a la SuperClase - Suponemos que aśi se calcula el Impuesto de los Camiones
    public float Impuesto(){
        return (
            super.getCilindrada()/30 +
            super.getPotencia()*20 + 
            super.getRuedas() * 20 + 
            getEjes() * 50
        );
    }
}
