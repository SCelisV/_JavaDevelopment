/*
 * Los operadores && y || realizan operaciones Conditional-AND y Conditional-OR sobre dos expresiones booleanas. Estos operadores tienen un comportamiento de "cortocircuito", lo que significa que el segundo operando se evalúa sólo si es necesario.
 * && Conditional-AND
 * || Conditional-OR
 */
package JavaTutorials.LanguageBasics;

public class ConditionalDemo1 {
    
    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2"); // value1 is 1 AND value2 is 2

        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1"); // value1 is 1 OR value2 is 1

    }
}
