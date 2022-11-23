/*
 * Los operadores de incremento/decremento pueden aplicarse antes (prefijo) o después (postfijo) del operando. 
 * resultado++ => evalúa el valor incrementado, 
 * ++resultado => evalúa el valor original.
 * terminarán ambos con el resultado incrementado en uno. 
 * 
 * Si sólo es un simple incremento/decremento, no importa realmente.
 * Pero si es parte de una expresión mayor, puede suponer una diferencia significativa.
 */
package JavaTutorials.LanguageBasics;

public class PrePostDemo {
    
    public static void main(String[] args) {

        int i = 3;
        i++;
        System.out.println(i); // 4
        ++i;			   
        System.out.println(i); // 5

        // porque la versión del prefijo ++i se evalúa al valor incrementado. 
        System.out.println(++i); // 6
        System.out.println(i); // 6 

        // porque la versión del posfijo i++ se evalúa al valor sin incrementar. 
        System.out.println(i++); // 6
        System.out.println(i); // 7

    }
}
