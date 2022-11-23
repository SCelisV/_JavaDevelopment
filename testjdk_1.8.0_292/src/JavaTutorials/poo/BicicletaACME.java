package JavaTutorials.poo;

/*
Las bicicletas tienen 
estados (marcha actual, cadencia de pedaleo actual, velocidad actual) y 
comportamientos (cambiar de marcha, cambiar de cadencia de pedaleo, aplicar los frenos). 

Para implementar la interface IBiclicleta 

El compilador ahora requerirá que los métodos cambiaCadencia, cambiaMarcha, subeVelocidad, aplicaFrenos e imprimeEstados estén implementados. 
El compilador fallará si estos métodos faltan en esta clase.

La implementación de una interfaz permite que una clase sea más formal en cuanto al comportamiento que promete proporcionar. 

Las interfaces forman un contrato entre la clase y el mundo exterior, y el compilador hace cumplir este contrato en el momento de la compilación. 

Si su clase afirma que implementa una interfaz, todos los métodos definidos por esa interfaz deben aparecer en su código fuente antes de que la clase se compile correctamente.

*/

public class BicicletaACME implements BicicletaI{

    /*estados*/

    int marcha = 1;
    int cadencia = 0;
    float velocidad = 0;

    /*comportamiento*/

    public void cambiaMarcha(int newValue){
        marcha = newValue;
    }

    public void cambiaCadencia(int newValue){
        cadencia = newValue;
    }

    public void subeVelocidad(float incremento){
        velocidad = velocidad + incremento;
    }

    public void aplicaFrenos(int decremento){
        velocidad = velocidad - decremento;
    }

    public void imprimeEstados(){
        System.out.println("Estados de la Bicicleta: ");
        System.out.println("Marcha: " + marcha + " Cadencia: " + cadencia + " Velocidad: " + velocidad);
    }
}