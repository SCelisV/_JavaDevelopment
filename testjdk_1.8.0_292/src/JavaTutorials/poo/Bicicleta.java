package JavaTutorials.poo;

/*
Las bicicletas tienen 
estados (marcha actual, cadencia de pedaleo actual, velocidad actual) y 
comportamientos (cambiar de marcha, cambiar de cadencia de pedaleo, aplicar los frenos). 
*/

public class Bicicleta{

    /*estados*/

    int marcha = 1;
    int cadencia = 0;
    float velocidad = 0;

    /*comportamiento*/

    void cambiaMarcha(int newValue){
        marcha = newValue;
    }

    void cambiaCadencia(int newValue){
        cadencia = newValue;
    }

    void subeVelocidad(float incremento){
        velocidad = velocidad + incremento;
    }

    void aplicaFrenos(int decremento){
        velocidad = velocidad - decremento;
    }

    void imprimeEstados(){
        System.out.println("Estados de la Bicicleta: ");
        System.out.println("Marcha: " + marcha + " Cadencia: " + cadencia + " Velocidad: " + velocidad);
    }
}