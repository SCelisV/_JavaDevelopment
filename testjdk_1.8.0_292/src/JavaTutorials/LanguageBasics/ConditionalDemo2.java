/*
 * Otro operador condicional es ?:, 
 * que puede ser considerado como una abreviatura de una sentencia if-then-else  
 * Este operador también se conoce como operador ternario porque utiliza tres operandos. 
 */
package JavaTutorials.LanguageBasics;

public class ConditionalDemo2 {
    
    public static void main(String[] args) {
        
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean algunaCondicion = true;
/*
 * Si algunaCondicion es verdadera, asigne el valor del valor1 al resultado. 
 * En caso contrario, asigna el valor del valor2 al resultado
 */
        result = algunaCondicion ? value1 : value2; 

        System.out.println("result: " + result); // result: 1

    }
}
