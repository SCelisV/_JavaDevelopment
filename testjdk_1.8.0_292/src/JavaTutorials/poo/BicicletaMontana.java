package JavaTutorials.poo;

/*
Las bicicletas tienen 
estados (marcha actual, cadencia de pedaleo actual, velocidad actual) y 
comportamientos (cambiar de marcha, cambiar de cadencia de pedaleo, aplicar los frenos). 

La programación orientada a objetos permite que las clases hereden estados y comportamientos de uso común de otras clases. 

algunas bicicletas de montaña tienen un anillo de cadena adicional, lo que les da una relación de transmisión más baja.

En este ejemplo, Bicicleta se convierte en la superclase de Bicicleta de montaña. 

En el lenguaje de programación Java, cada clase puede tener una superclase directa, y cada superclase tiene el potencial de un número ilimitado de subclases

Esta clase tiene todos los mismos campos y métodos que Bicicleta, pero permite que su código se centre exclusivamente en las características que la hacen única. 
Esto hace que el código de sus subclases sea fácil de leer. 
Sin embargo, 
debe tener cuidado de documentar adecuadamente el estado y el comportamiento que cada superclase define, 
ya que ese código no aparecerá en el archivo fuente de cada subclase.

*/

public class BicicletaMontana extends Bicicleta{

    int cadenas = 2;
    
}
