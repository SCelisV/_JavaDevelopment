package JavaTutorials.poo;

import JavaTutorials.poo.Bicicleta;
/*
Las bicicletas tienen 
estados (marcha actual, cadencia de pedaleo actual, velocidad actual) y 
comportamientos (cambiar de marcha, cambiar de cadencia de pedaleo, aplicar los frenos). 

Prueba de la clase Bicicleta
*/

public class BicicletaTest{

    public static void main(String[] args) {

        // Creo mi bicicleta a partir del formato Bicicleta
        Bicicleta myBicicleta = new Bicicleta();
        // Imprimo los estados de myBicicleta
        myBicicleta.imprimeEstados();

    /* ahora modifico el comportamiento de myBicicleta*/

        myBicicleta.cambiaMarcha(2);
        myBicicleta.cambiaCadencia(3);
        myBicicleta.subeVelocidad(4);
        myBicicleta.aplicaFrenos(0);

        // Imprimo los estados de myBicicleta
        myBicicleta.imprimeEstados();
        
    }
}