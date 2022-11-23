/*
 * 
Bitwise and Bit Shift Operators - Operadores Bitwise y Bit Shift

Java proporciona operadores que realizan operaciones de desplazamiento de bits y bitwise en tipos integrales.

El operador unario de complemento a nivel de bits "~" invierte un patrón de bits; 
puede aplicarse a cualquiera de los tipos integrales, 
convirtiendo cada "0" en "1" y cada "1" en "0". 
Por ejemplo, un byte contiene 8 bits; 
aplicando este operador a un valor cuyo patrón de bits es "00000000" cambiaría su patrón a "11111111".

El operador de desplazamiento a la izquierda con signo "<<" desplaza un patrón de bits a la izquierda, 
y el operador de desplazamiento a la derecha con signo ">>" desplaza un patrón de bits a la derecha. 
El patrón de bits viene dado por el operando izquierdo, y el número de posiciones a desplazar por el operando derecho. 
El operador de desplazamiento a la derecha sin signo ">>>" desplaza un cero a la posición más a la izquierda,
mientras que la posición más a la izquierda después de ">>" depende de la extensión del signo.

El operador & a nivel de bits realiza una operación AND a nivel de bits.
El operador ^ a nivel de bits realiza una operación OR exclusiva a nivel de bits.
El operador bitwise | realiza una operación OR inclusiva a nivel de bit.

En este ejemplo se usa el operador AND a nivel de bits para imprimir el número "2" en la salida estándar.

 */
package JavaTutorials.LanguageBasics;

public class BitDemo {

    public static void main(String[] args) {
        
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println("val: " + val + " " + "bitmask: " + bitmask); // val: 8738 bitmask: 15
        System.out.println("val & bitmask: " + (val & bitmask)); // val & bitmask: 2

    }
    
}
