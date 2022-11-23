package JavaTutorials.LanguageBasics;

/*
Las bicicletas tienen 
estados (marcha actual, cadencia de pedaleo actual, velocidad actual) y 
comportamientos (cambiar de marcha, cambiar de cadencia de pedaleo, aplicar los frenos). 
*/

public class Bicicleta2{

    /*estados*/

    int marcha = 1;
    int cadencia = 0;
    float velocidad = 0;
    boolean estaEnMovimiento = false;

    /*comportamiento*/

    void cambiaMarcha(int newValue){
        marcha = newValue;
        estaEnMovimiento = true;
    }

    void cambiaCadencia(int newValue){
        cadencia = newValue;
    }

    void subeVelocidad(float incremento){
        estaEnMovimiento = true;
        velocidad = velocidad + incremento;
    }

    /*
     * Una posible implementación del método applicaFrenos podría ser la siguiente:
     */
    void aplicaFrenos(int decremento){
        velocidad = velocidad - decremento;
    }

    /*
     * Por ejemplo, la clase Bicicleta podría permitir que los frenos disminuyan la velocidad de la bicicleta sólo si ésta ya está en movimiento. 
     * Si se evalúa como false, (lo que significa que la bicicleta no está en movimiento), el control salta al final de la sentencia if-then.
     * Otra posible implementación del método applicaFrenos podría ser la siguiente:
     */
    void aplicaFrenos(){
        if(estaEnMovimiento){ // se puede evaluar como true o false
            velocidad--;
        } // final sentencia if-then
    }
    /*
     * las llaves de apertura y cierre son opcionales, siempre que la cláusula "then" contenga una sola sentencia:
     */
    void aplicaFrenos2(){
        if(estaEnMovimiento) // se puede evaluar como true o false
            velocidad--;
        // final sentencia if-then
    }
    /*
     * Puedes utilizar una sentencia if-then-else en el método para realizar alguna acción 
     * si los frenos se aplican cuando la bicicleta no está en movimiento. 
     * En este caso, la acción es simplemente imprimir un mensaje de error indicando que la bicicleta ya se ha detenido.
     */
    void aplicaFrenos3(){
        if(estaEnMovimiento) // se puede evaluar como true o false
            velocidad--;
        else
            System.out.println("la bici se ha detenido"); // final sentencia if-then-else
    }

    void imprimeEstados(){
        System.out.println("Estados de la Bicicleta: ");
        System.out.println("Marcha: " + marcha + " Cadencia: " + cadencia + " Velocidad: " + velocidad);
    }
}

    void imprimeEstados(){
        System.out.println("Estados de la Bicicleta: ");
        System.out.println("Marcha: " + marcha + " Cadencia: " + cadencia + " Velocidad: " + velocidad);
    }
}